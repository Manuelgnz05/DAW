-- 1.Crear una función que reciba un ID de empleado y devuelva su nombre y apellidos concatenados y separados por un espacio en blanco.
-- Darle el nombre func_getNombreCompleto.

DELIMITER $$;
DROP FUNCTION IF EXISTS func_getNombreCompleto $$;
CREATE FUNCTION func_getNombreCompleto(id_empleado INT)
RETURNS VARCHAR(30)
DETERMINISTIC
BEGIN
	DECLARE apellido VARCHAR(30) DEFAULT '';
	DECLARE nombre VARCHAR(30) DEFAULT '';
	SELECT LastName, FirstName INTO apellido, nombre FROM Employees WHERE EmployeeID=id_empleado;
    RETURN(concat_ws(" ", nombre, apellido));
END $$;
DELIMITER ;

select func_getNombreCompleto(3);

-- 2.Repetir el ejercicio anterior concatenando la edad, que deberá ser calculada en base a la fecha de nacimiento. Darle el nombre
-- func_getNombreCompletoEdad.

DELIMITER $$;
DROP FUNCTION IF EXISTS func_getNombreCompletoEdad $$;
CREATE FUNCTION func_getNombreCompletoEdad(id_empleado INT)
RETURNS VARCHAR(30)
DETERMINISTIC
BEGIN
	DECLARE apellido VARCHAR(30) DEFAULT '';
	DECLARE nombre VARCHAR(30) DEFAULT '';
	DECLARE edad int DEFAULT 0;
	SELECT LastName, FirstName, timestampdiff(year, birthDate, now()) INTO apellido, nombre, edad FROM Employees WHERE EmployeeID=id_empleado;
    RETURN(concat_ws(" ", nombre, apellido, edad));
END $$;
DELIMITER ;

select func_getNombreCompletoEdad(3);

-- 3.Modificar los ejercicios anteriores para que sea una rutina que devuelva en variables de salida los datos requeridos.

-- 1
DELIMITER $$; 
DROP PROCEDURE IF EXISTS proc_getNombreCompleto $$; 
CREATE PROCEDURE proc_getNombreCompleto (in id int, out nombre varchar(30)) 
BEGIN 
	SELECT concat_ws(" ", LastName, FirstName) INTO nombre FROM Employees WHERE EmployeeID=id;
END $$; 
DELIMITER ; 

set @mensaje = " ";
set @num = 3;
call proc_getNombreCompleto(@num, @mensaje);
select @mensaje;

-- 2

DELIMITER $$; 
DROP PROCEDURE IF EXISTS proc_getNombreCompletoEdad $$; 
CREATE PROCEDURE proc_getNombreCompletoEdad (in id int, out nombre varchar(30)) 
BEGIN 
	SELECT concat_ws(" ", LastName, FirstName, timestampdiff(year, birthDate, now())) INTO nombre FROM Employees WHERE EmployeeID=id;
END $$; 
DELIMITER ; 

set @mensaje = " ";
set @num = 1;
call proc_getNombreCompletoEdad(@num, @mensaje);
select @mensaje;

-- 4.Crear una rutina que reciba un ID de pedido, y devuelva en una variable de salida el nombre del empleado que lo atendió.

DELIMITER $$; 
DROP PROCEDURE IF EXISTS proc_getNombrePedido $$; 
CREATE PROCEDURE proc_getNombrePedido (in id_pedido int, out nombre varchar(30)) 
BEGIN 
	SELECT employees.FirstName INTO nombre FROM Employees join orders on (employees.EmployeeID = orders.EmployeeID) 
    WHERE orders.OrderID=id_pedido;
END $$; 
DELIMITER ; 

set @num = 10248;
call proc_getNombrePedido(@num, @mensaje);
select @mensaje;

-- 5.Repetir el anterior, pero devolviendo el nombre de compañía del cliente.

DELIMITER $$; 
DROP PROCEDURE IF EXISTS proc_getNombreCompania $$; 
CREATE PROCEDURE proc_getNombreCompania (in id_pedido int, out company varchar(30)) 
BEGIN 
	SELECT customers.CompanyName INTO company FROM customers join orders on (customers.CustomerID = orders.CustomerID) WHERE orders.OrderID=id_pedido;
END $$; 
DELIMITER ; 

set @num = 10248;
call proc_getNombreCompania(@num, @mensaje);
select @mensaje;

-- 6.Crear una rutina que devuelva en una variable de salida la cantidad de pedidos del empleado número 3.

DELIMITER $$; 
DROP PROCEDURE IF EXISTS proc_getNumPedidos $$; 
CREATE PROCEDURE proc_getNumPedidos (in id_empleado int, out num_pedidos int) 
BEGIN 
	SELECT count(*) INTO num_pedidos FROM orders WHERE orders.EmployeeID=id_empleado;
END $$; 
DELIMITER ; 

set @num = 3;
set @num2 = 0;
call proc_getNumPedidos(@num, @num2);
select @num2;

-- 7.Crear una rutina que reciba dos nombres de empleados y devuelva el nombre del que ha atendido mayor cantidad de pedidos.

DELIMITER $$; 
DROP PROCEDURE IF EXISTS proc_getMayorPedidos $$; 
CREATE PROCEDURE proc_getMayorPedidos (in empleado1 varchar(30), in empleado2 varchar(30), out res varchar(30)) 
BEGIN 
	DECLARE numPedidos1 int DEFAULT 0;
	DECLARE numPedidos2 int DEFAULT 0;
	
    SELECT count(*) INTO numPedidos1 FROM orders join employees on (orders.EmployeeID = employees.EmployeeID) 
    WHERE employees.FirstName=empleado1;
	
    SELECT count(*) INTO numPedidos2 FROM orders join employees on (orders.EmployeeID = employees.EmployeeID) 
    WHERE employees.FirstName=empleado2;
    
    if numPedidos1>numPedidos2 then 
		set res = empleado1;
	elseif numPedidos1<numPedidos2 then
		set res = empleado2;
	else
		set res = "Son iguales";
end if;
END $$; 
DELIMITER ; 

call proc_getMayorPedidos("Nancy", "Janet", @mensaje);
select @mensaje;

-- 8.¿Se puede modificar el ejercicio anterior para que el ID de empleado se reciba como un argumento de entrada?

DELIMITER $$; 
DROP PROCEDURE IF EXISTS proc_getMayorPedidos_id $$; 
CREATE PROCEDURE proc_getMayorPedidos_id (in id_empleado1 int, in id_empleado2 int, out res varchar(30)) 
BEGIN 
	DECLARE numPedidos1 int DEFAULT 0;
	DECLARE numPedidos2 int DEFAULT 0;
	DECLARE empleado1 varchar(30) DEFAULT 0;
	DECLARE empleado2 varchar(30) DEFAULT 0;
	
    SELECT count(*) INTO numPedidos1 FROM orders join employees on (orders.EmployeeID = employees.EmployeeID) 
    WHERE employees.EmployeeID=id_empleado1;
	
    SELECT count(*) INTO numPedidos2 FROM orders join employees on (orders.EmployeeID = employees.EmployeeID) 
    WHERE employees.EmployeeID=id_empleado2;
    
    if numPedidos1>numPedidos2 then 
		select FirstName into empleado1 from employees where EmployeeID = id_empleado1;
		set res = empleado1;
	elseif numPedidos1<numPedidos2 then
		select FirstName into empleado2 from employees where EmployeeID = id_empleado2;
		set res = empleado2;
	else
		set res = "Son iguales";
end if;
END $$; 
DELIMITER ; 

call proc_getMayorPedidos_id(1, 3, @mensaje);
select @mensaje;

-- 9.Crear una rutina que devuelva en una variable el valor máximo de precio de producto.

DELIMITER $$; 
DROP PROCEDURE IF EXISTS proc_getMayorPrecioProducto $$; 
CREATE PROCEDURE proc_getMayorPrecioProducto (out precio_max float) 
BEGIN 
	select max(UnitPrice) into precio_max from products;
END $$; 
DELIMITER ; 

set @precio = 0.0;
call proc_getMayorPrecioProducto(@precio);
select @precio;

-- 10.Crear una rutina que devuelva la cantidad de pedidos en una variable.

DELIMITER $$; 
DROP PROCEDURE IF EXISTS proc_getCantidadPedidos $$; 
CREATE PROCEDURE proc_getCantidadPedidos (out cantidad int) 
BEGIN 
	select count(*) into cantidad from orders;
END $$; 
DELIMITER ; 

set @cantidad = 0;
call proc_getCantidadPedidos(@cantidad);
select @cantidad;

-- 11.Crear una rutina que devuelva el id de empleado que tiene más pedidos.

DELIMITER $$; 
DROP PROCEDURE IF EXISTS proc_getEmpleadoMasPedidos $$; 
CREATE PROCEDURE proc_getEmpleadoMasPedidos (out id int) 
BEGIN 
	select employees.EmployeeID into id from employees join orders on (orders.EmployeeID = employees.EmployeeID) 
    group by employees.EmployeeID order by count(orders.OrderID) desc limit 1;
END $$; 
DELIMITER ; 

set @id = 3;
call proc_getEmpleadoMasPedidos(@id);
select @id;

-- 12.Crear una rutina que reciba un nombre de contacto y devuelva el ID de cliente.

DELIMITER $$; 
DROP PROCEDURE IF EXISTS proc_getIdCliente $$; 
CREATE PROCEDURE proc_getIdCliente (in contacto varchar(30), out id varchar(10)) 
BEGIN 
	select CustomerID into id from customers where ContactName = contacto;
END $$; 
DELIMITER ; 

call proc_getIdCliente("Juan", @id);
select @id;

-- 13.Crear una rutina que reciba un ID de envío (ShipperID) y devuelva la cantidad de pedidos enviados con ese transportista.

DELIMITER $$
DROP FUNCTION IF EXISTS func_getTotalPedidosPorTransportista $$
CREATE FUNCTION func_getTotalPedidosPorTransportista (id_envio INT) 
RETURNS INT
DETERMINISTIC
BEGIN
    DECLARE cantidad INT;
    SELECT COUNT(*) INTO cantidad FROM orders WHERE ShipVia = id_envio;
    RETURN cantidad;
END $$
DELIMITER ;

select func_getTotalPedidosPorTransportista(3);

-- 14.Crear una rutina que reciba dos ID de categoría, y devuelva la suma de la cantidad de productos que tienen ambas.

DELIMITER $$;
DROP PROCEDURE IF EXISTS proc_cantidad_categorias$$;
CREATE PROCEDURE proc_cantidad_categorias(in id_categoria1 int, in id_categoria2 int, out cantidad int)
BEGIN
	declare cantidad1 int default 0;
	declare cantidad2 int default 0;
    
    select count(*) into cantidad1 from products where categoryid = id_categoria1;
    select count(*) into cantidad2 from products where categoryid = id_categoria2;
    
    set cantidad = cantidad1 + cantidad2;
    
END$$;
DELIMITER ;

set @cantidad = 0;
call proc_cantidad_categorias(1, 2, @cantidad);
select @cantidad;

-- 15.Crear una rutina que reciba tres ID de categorías y devuelva sus descripciones concatenadas y separadas por punto y coma.

DELIMITER $$
DROP FUNCTION IF EXISTS func_getDescripcionesConcatWS $$
CREATE FUNCTION func_getDescripciones (cat1 INT, cat2 INT, cat3 INT) 
RETURNS TEXT
DETERMINISTIC
BEGIN
    DECLARE desc1, desc2, desc3 TEXT;
    SET desc1 = (SELECT Description FROM categories WHERE CategoryID = cat1);
    SET desc2 = (SELECT Description FROM categories WHERE CategoryID = cat2);
    SET desc3 = (SELECT Description FROM categories WHERE CategoryID = cat3);

    RETURN CONCAT_WS('; ', desc1, desc2, desc3);
END $$
DELIMITER ;

SELECT func_getDescripciones(1, 2, 4);
