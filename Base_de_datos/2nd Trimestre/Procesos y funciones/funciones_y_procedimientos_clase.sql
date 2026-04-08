-- Mostrar el ID de empleado, nombre en mayúsculas y apellido en mayúsculas 
-- de todos los empleados, empleando la función mayusculas creada en la transparencia anterior. 
-- ¿Es mejor una función o un procedimiento?

select EmployeeID, mayusculas(LastName), mayusculas(FirstName) from employees;

-- Crear una función multiplicar que reciba un float y un entero, y los devuelva multiplicados. 
-- Usar la función para mostrar el ID de producto, el nombre de producto y los beneficios de venderlo 
-- (UnitPrice*UnitsInStock), usando la función creada, sobre la tabla Products.

DELIMITER $$;
DROP FUNCTION IF EXISTS multiplicar$$;
CREATE FUNCTION Northwind.multiplicar(num1 float, num2 int)
	RETURNS float
DETERMINISTIC
BEGIN
	RETURN(num1*num2);
END$$;
DELIMITER ;

select ProductID, ProductName, multiplicar(unitPrice, unitsInStock) from products;

-- Crear una función medir_longitud que reciba una cadena de caracteres y devuela su longitud. 
-- Usarla para imprimir el nombre de todos los empleados junto con la longitud de sus nombres.

DELIMITER $$;
DROP FUNCTION IF EXISTS medir_longitud$$;
CREATE FUNCTION Northwind.medir_longitud(cadena varchar(100))
	RETURNS int
DETERMINISTIC
BEGIN
	RETURN length(cadena);
END$$;
DELIMITER ;

select FirstName, medir_longitud(FirstName) from employees;

-- Crear una función concatenar que reciba dos cadenas y las devuelva concatenadas separadas por un 
-- guión bajo. Por ejemplo, si se reciben ‘Juan’ y ‘Palomo’, devolvería ‘Juan_Palomo’. 
-- Usarla para imprimir el ID de empleado, y concatenar el nombre y apellidos usando esta función.

DELIMITER $$;
DROP FUNCTION IF EXISTS concatenar$$;
CREATE FUNCTION Northwind.concatenar(cadena varchar(100), cadena2 varchar(100))
	RETURNS varchar(201)
DETERMINISTIC
BEGIN
	RETURN concat_ws("_", cadena, cadena2);
END$$;
DELIMITER ;

select concatenar("Juan", "Palomo");
select EmployeeID, concatenar(FirstName, LastName) from employees;

-- ---------------------------------------------------------------------------------------------------------------------------------------------

DELIMITER $$; 
DROP PROCEDURE IF EXISTS proc_entrada $$; 
CREATE PROCEDURE proc_entrada (IN p INT) 
	BEGIN SET p = 5; 
END $$; 
DELIMITER ;

DELIMITER $$; 
DROP PROCEDURE IF EXISTS proc_salida $$; 
CREATE PROCEDURE proc_salida (out p INT) 
	BEGIN SET p = 5; 
END $$; 
DELIMITER ;

set @y = 7;
select @y;
call proc_entrada(@y);
call proc_salida(@y);

DELIMITER $$; 
DROP PROCEDURE IF EXISTS sumar $$; 
CREATE PROCEDURE sumar (IN a INT, IN b INT, OUT c INT) 
BEGIN 
	SET c = a + b;
END $$; 
DELIMITER ;

set @a = 3;
set @t = 6;
set @f = 0;
call sumar(@a, @t, @f);
select @f;

DELIMITER $$; 
DROP PROCEDURE IF EXISTS cambio $$; 
CREATE PROCEDURE cambio (INOUT a INT, INOUT b INT) 
BEGIN 
	declare temporal int;
	SET temporal = a;
    set a = b;
    set b = temporal;
END $$; 
DELIMITER ;

call cambio(@a, @t);
select @a;
select @t;

-- ---------------------------------------------------------------------------------------------------------------------------------------------------
-- Condicionales

DELIMITER $$; 
DROP PROCEDURE IF EXISTS es_mayor $$; 
CREATE PROCEDURE es_mayor (IN a INT, IN b INT, OUT mensaje VARCHAR(30)) 
BEGIN 
	IF a>b THEN 
		SET mensaje="El primero es mayor"; 
	ELSEIF a<b THEN 
		SET mensaje="El segundo es mayor"; 
	ELSE 
		SET mensaje="Son iguales"; 
END IF; 
END $$; 
DELIMITER ; 

SET @x=3; 
SET @y=13; 
SET @res=""; 
CALL es_mayor(@x, @y, @res);

-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- Bucles

-- FOR
DELIMITER $$;
DROP PROCEDURE IF EXISTS ejemplo_loop $$;
CREATE PROCEDURE ejemplo_loop()
BEGIN
    DECLARE contador INT DEFAULT 0;
    mi_loop: LOOP
		SELECT contador;
        SET contador = contador + 1;
        IF contador >= 10 THEN
            LEAVE mi_loop;  -- Sale del LOOP
        END IF;
    END LOOP mi_loop;
END $$;
DELIMITER ;

CALL ejemplo_loop();

-- DO WHILE
DELIMITER $$;
DROP PROCEDURE IF EXISTS repetir_hasta$$;
CREATE PROCEDURE repetir_hasta()
	BEGIN	
DECLARE i INT;
    SET i=0;    
    REPEAT		
		IF MOD(i,2)!=0 THEN			
			SELECT CONCAT(i, ' es impar');
		END IF;
		SET i = i + 1;
		UNTIL i>=10
    END REPEAT;
END$$;
DELIMITER ;

call repetir_hasta();

-- WHILE

DELIMITER $$;
DROP PROCEDURE IF EXISTS mientras $$;
CREATE PROCEDURE mientras ()
	BEGIN
	DECLARE i INT;
	SET i=0;
	bucle1: WHILE i<10 DO
		IF MOD(i,2)<>0 THEN
			SELECT CONCAT(i,' es impar');
		END IF;
		SET i=i+1;
	END WHILE;
END $$;
DELIMITER ;

CALL mientras ();

-- --------------------------------------------------------------------------------------------------------------------------------------------

DELIMITER $$;
DROP FUNCTION IF EXISTS getApellidoFuncion $$;
CREATE FUNCTION getApellidoFuncion
(id_empleado INT)
RETURNS VARCHAR(30)
DETERMINISTIC
BEGIN
	DECLARE apellido VARCHAR(30) DEFAULT '';
	SELECT LastName INTO apellido FROM Employees WHERE EmployeeID=id_empleado;
    RETURN(apellido);
END $$;
DELIMITER ;

select getApellidoFuncion(3);

DELIMITER $$; 
DROP PROCEDURE IF EXISTS getApellidoNombre $$; 
CREATE PROCEDURE getApellidoNombre (in id int, out apellido varchar(30), out nombre varchar(30)) 
BEGIN 
	SELECT LastName, FirstName INTO apellido, nombre FROM Employees WHERE EmployeeID=id_empleado;
END $$; 
DELIMITER ; 
