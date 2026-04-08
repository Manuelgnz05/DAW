-- 1. Escribe un procedimiento que no tenga ningún parámetro de entrada ni de salida y que muestre el texto ¡Hola mundo! .

DELIMITER $$; 
DROP PROCEDURE IF EXISTS hola $$; 
CREATE PROCEDURE hola () 
BEGIN 
	select "¡Hola mundo!";
END $$; 
DELIMITER ; 

call hola();

-- 2. Escribe un procedimiento que reciba un número real de entrada y muestre un mensaje indicando si el número es
-- positivo, negativo o cero.

DELIMITER $$; 
DROP PROCEDURE IF EXISTS pos_neg $$; 
CREATE PROCEDURE pos_neg (in num int, out mensaje varchar(20)) 
BEGIN 
	if num>0 then
		set mensaje = "positivo";
	elseif num<0 then
		set mensaje = "negativo";
	else
		set mensaje = "cero";
	end if ;
END $$; 
DELIMITER ; 

set @mensaje = "hola";
call pos_neg(0, @mensaje);
select @mensaje;

-- 3. Modifique el procedimiento diseñado en el ejercicio anterior para que tenga un parámetro de entrada, con el valor un
-- número real, y un parámetro de salida, con una cadena de caracteres indicando si el número es positivo, negativo o cero.

DELIMITER $$; 
DROP PROCEDURE IF EXISTS pos_neg $$; 
CREATE PROCEDURE pos_neg (in num int, out mensaje varchar(20)) 
BEGIN 
	if num>0 then
		set mensaje = "positivo";
	elseif num<0 then
		set mensaje = "negativo";
	else
		set mensaje = "cero";
	end if ;
END $$; 
DELIMITER ; 

set @mensaje = "hola";
call pos_neg(0, @mensaje);
select @mensaje;

-- 4. Escribe un procedimiento que reciba un número real de entrada, que representa el valor de la nota de un alumno, y
-- muestre un mensaje indicando que nota ha obtenido teniendo en cuenta las siguientes condiciones:

-- · [0,5) = Insuficiente
-- · [5,6) = Aprobado
-- · [6, 7) = Bien
-- · [7, 9) = Notable
-- · [9, 10] = Sobresaliente
-- · En cualquier otro caso la nota no será válida.

-- 5. Modifique el procedimiento diseñado en el ejercicio anterior para que tenga un parámetro de entrada, con el valor de la
-- nota en formato numerico y un parametro de salida, con una cadena de texto indicando la nota correspondiente.

-- 6. Resuelva el procedimiento diseñado en el ejercicio anterior haciendo uso de la estructura de control CASE .

DELIMITER $$; 
DROP PROCEDURE IF EXISTS nota $$; 
CREATE PROCEDURE nota (in nota float, out mensaje varchar(20)) 
BEGIN 
	SET mensaje = CASE
        WHEN nota >= 0 and nota < 5 THEN 'Insuficiente'
        WHEN nota >= 5 and nota < 6 THEN 'Aprobado'
        WHEN nota >= 6 and nota < 7 THEN 'Bien'
        WHEN nota >= 7 and nota < 9 THEN 'Notable'
        WHEN nota >= 9 and nota <= 10 THEN 'Sobresaliente'
        ELSE 'inválido'
	END;
END $$; 
DELIMITER ; 

call nota(5, @mensaje);
select @mensaje;


-- 7. Escribe un procedimiento que reciba como parámetro de entrada un valor numérico que represente un día de la semana
-- y que devuelva una cadena de caracteres con el nombre del día de la semana correspondiente. Por ejemplo, para el valor
-- de entrada 1 debería devolver la cadena lunes .

DELIMITER $$; 
DROP PROCEDURE IF EXISTS dia_semana $$; 
CREATE PROCEDURE dia_semana (in dia int, out nombre_dia varchar(20)) 
BEGIN 
	SET nombre_dia = CASE dia
        WHEN 1 THEN 'lunes'
        WHEN 2 THEN 'martes'
        WHEN 3 THEN 'miércoles'
        WHEN 4 THEN 'jueves'
        WHEN 5 THEN 'viernes'
        WHEN 6 THEN 'sábado'
        WHEN 7 THEN 'domingo'
        ELSE 'inválido'
	END;
END $$; 
DELIMITER ; 

call dia_semana(4, @mensaje);
select @mensaje;
