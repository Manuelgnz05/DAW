-- 1. Crear una rutina que reciba como entrada un número entero. La rutina devuelve
-- en tres variables de salida el propio número, el número elevado al cuadrado y
-- el número elevado al cubo.

DELIMITER $$; 
DROP PROCEDURE IF EXISTS proc_getNumero $$; 
CREATE PROCEDURE proc_getNumero (in num int, out numero int, out numero_cuadrado int, out numero_cubo int) 
BEGIN 
	set numero = num;
    set numero_cuadrado = num * num;
    set numero_cubo = num * num * num;
END $$; 
DELIMITER ; 

set @num = 3;
set @res1 = 3;
set @res2 = 3;
set @res3 = 3;
call proc_getNumero(@num, @res1, @res2, @res3);
select @res1;
select @res2;
select @res3;

-- 2. Crear una rutina que reciba un ID de categoría y devuelva la descripción de la misma.

DELIMITER $$; 
DROP PROCEDURE IF EXISTS proc_getDescripcion $$; 
CREATE PROCEDURE proc_getDescripcion (in id int, out des varchar(100)) 
BEGIN 
	select description into des from categories where categories.CategoryID = id;
END $$; 
DELIMITER ; 

set @mensaje = " ";
set @id = 3;
call proc_getDescripcion(@num, @mensaje);
select @mensaje;

-- 3. Crear una rutina que reciba una letra y un número. La rutina debe devolver una cadena
-- en la que la letra se repita tantas veces como diga el número. Debe validar el número:
-- si es negativo o cero, se devuelve únicamente una cadena con la letra.

DELIMITER $$; 
DROP PROCEDURE IF EXISTS proc_getRepiteLetra $$; 
CREATE PROCEDURE proc_getRepiteLetra (in num int, in letra varchar(1), out mensaje varchar(100)) 
BEGIN 
	declare contador int default 0;
	declare res varchar(100) default "";
	mi_loop: LOOP
		SET contador = contador + 1;
        set res = concat(res, letra);
        IF contador >= num THEN
            LEAVE mi_loop; 
        END IF;
    END LOOP mi_loop;
    set mensaje = res;
END $$; 
DELIMITER ; 

set @mensaje = " ";
set @num = 3;
set @letra = "A";
call proc_getRepiteLetra(@num, @letra, @mensaje);
select @mensaje;

-- 4. Crear una rutina que sume los precios unitarios de todos los productos. La rutina
-- NO puede realizar la suma con una sentencia SQL y el operador SUM, sino que deberá recuperar
-- iterativamente por cada producto su precio unitario e ir sumando. La rutina devuelve
-- la suma en una variable de salida. Tenga en cuenta dentro de la rutina que los ID
-- de producto van desde 1 a 77.

DELIMITER $$; 
DROP PROCEDURE IF EXISTS proc_getSumaPrecios $$; 
CREATE PROCEDURE proc_getSumaPrecios (out res int) 
BEGIN 
	declare contador int default 0;
	declare suma int default 0;
	declare resul int default 0;
	mi_loop: LOOP
		SET contador = contador + 1;
        select unitPrice into suma from products where products.ProductID=contador;
        set resul = resul + suma;
        IF contador = 77 THEN
            LEAVE mi_loop; 
        END IF;
    END LOOP mi_loop;
    set res = resul;
END $$; 
DELIMITER ; 

set @num = 3;
call proc_getSumaPrecios(@num);
select @num;