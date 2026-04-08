-- 1. Escribe una funcion que reciba un numero entero de entrada y devuelva TRUE si el numero es par o FALSE en caso
-- contrario.

DELIMITER $$;
DROP FUNCTION IF EXISTS es_par$$;
CREATE FUNCTION es_par(num1 int)
	RETURNS varchar(10)
DETERMINISTIC
BEGIN
	if num1%2 = 0 then
		return "True";
	else
		return "False";
	end if;
END$$;
DELIMITER ;

set @a = 4;
select es_par(@a);

-- 2. Escribe una función que devuelva el valor de la hipotenusa de un triángulo a partir de los valores de sus lados.

DELIMITER $$;
DROP FUNCTION IF EXISTS cal_hipotenusa$$;
CREATE FUNCTION cal_hipotenusa(num1 float, num2 float)
	RETURNS float
DETERMINISTIC
BEGIN
	return sqrt(pow(num1, 2) + pow(num2, 2));
END$$;
DELIMITER ;

set @a = 4;
set @b = 3;
select cal_hipotenusa(@a, @b);

-- 3. Escribe una función que reciba como parámetro de entrada un valor numérico que represente un día de la semana y que
-- devuelva una cadena de caracteres con el nombre del día de la semana correspondiente. Por ejemplo, para el valor de
-- entrada 1 debería devolver la cadena lunes .

DELIMITER $$;
DROP FUNCTION IF EXISTS nombre_dia$$;
CREATE FUNCTION nombre_dia(num1 int)
	RETURNS varchar(20)
DETERMINISTIC
BEGIN
	DECLARE nombre_dia VARCHAR(20);
	SET nombre_dia = CASE num1
        WHEN 1 THEN 'lunes'
        WHEN 2 THEN 'martes'
        WHEN 3 THEN 'miércoles'
        WHEN 4 THEN 'jueves'
        WHEN 5 THEN 'viernes'
        WHEN 6 THEN 'sábado'
        WHEN 7 THEN 'domingo'
        ELSE 'inválido'
	END;
    RETURN nombre_dia;
END$$;
DELIMITER ;

select nombre_dia(3);

-- 4. Escribe una función que reciba tres números reales como parámetros de entrada y devuelva el mayor de los tres.

DELIMITER $$;
DROP FUNCTION IF EXISTS num_mayor$$;
CREATE FUNCTION num_mayor(num1 int, num2 int, num3 int)
	RETURNS int
DETERMINISTIC
BEGIN
	declare res int default 0;
    if num1>num2 and num1>num3 then
		set res = num1;
	elseif num2>num1 and num2>num3 then
		set res = num2;
	else 
		set res = num3;
	end if;
    return res;
END$$;
DELIMITER ;

select num_mayor(2, 3, 4);

-- 5. Escribe una funcion que devuelva el valor del area de un círculo a partir del valor del radio que se recibirá como
-- parámetro de entrada.

DELIMITER $$;
DROP FUNCTION IF EXISTS area_circulo$$;
CREATE FUNCTION area_circulo(radio float)
	RETURNS float
DETERMINISTIC
BEGIN
	return PI() * POW(radio, 2);
END$$;
DELIMITER ;

select area_circulo(5);

-- 6. Escribe una función que devuelva como salida el número de años que han transcurrido entre dos fechas que se reciben
-- como parámetros de entrada. Por ejemplo, si pasamos como parámetros de entrada las fechas 2018-01-01 y 2008-01-01
-- la función tiene que devolver que han pasado 10 años.

-- Para realizar esta funcion puede hacer uso de las siguientes funciones que nos proporciona MySQL:
-- . DATEDIFF
-- . TRUNCATE

DELIMITER $$;
DROP FUNCTION IF EXISTS anyos_pasados$$;
CREATE FUNCTION anyos_pasados(fecha1 date, fecha2 date)
	RETURNS int
DETERMINISTIC
BEGIN
	return timestampdiff(year, fecha1, fecha2);
END$$;
DELIMITER ;

select anyos_pasados('2025-01-01', '2026-01-01')

-- 7. Escribe una funcion que reciba una cadena de entrada y devuelva la misma cadena pero sin acentos. La función tendrá
-- que reemplazar todas las vocales que tengan acento por la misma vocal pero sin acento. Por ejemplo, si la función recibe
-- como parámetro de entrada la cadena María la función debe devolver la cadena Maria.

DELIMITER $$;
DROP FUNCTION IF EXISTS eliminar_acentos$$;
CREATE FUNCTION eliminar_acentos(cadena VARCHAR(255)) 
	RETURNS VARCHAR(255)
DETERMINISTIC
BEGIN
	DECLARE resultado VARCHAR(255);
    SET resultado = cadena;
    
    SET resultado = REPLACE(resultado, 'á', 'a');
    SET resultado = REPLACE(resultado, 'é', 'e');
    SET resultado = REPLACE(resultado, 'í', 'i');
    SET resultado = REPLACE(resultado, 'ó', 'o');
    SET resultado = REPLACE(resultado, 'ú', 'u');

    SET resultado = REPLACE(resultado, 'Á', 'A');
    SET resultado = REPLACE(resultado, 'É', 'E');
    SET resultado = REPLACE(resultado, 'Í', 'I');
    SET resultado = REPLACE(resultado, 'Ó', 'O');
    SET resultado = REPLACE(resultado, 'Ú', 'U');

    RETURN resultado;
END$$;
DELIMITER ;

select eliminar_acentos("camión");