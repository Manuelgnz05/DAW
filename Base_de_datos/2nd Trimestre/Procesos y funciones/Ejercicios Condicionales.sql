-- 1- Crear una función que devuelva 1 o 0 si un número a es divisible por un numero b (siendo estos
-- enteros). (Busca información en google sobre cómo hacer el módulo)

DELIMITER $$; 
DROP FUNCTION IF EXISTS es_divisible $$; 
CREATE FUNCTION es_divisible (a INT, b INT)
	RETURNS bool
DETERMINISTIC
BEGIN 
	IF a % b = 0 THEN 
		return 1; 
	ELSE 
		return 0; 
END IF; 
END $$; 
DELIMITER ; 

set @n1 = 4;
set @n2 = 2;
select es_divisible(@n1, @n2);

-- 2- Crear un procedimiento que reciba un entero entre 1 y 12, y muestre por pantalla el mes del año. En
-- caso de no ser el número de un mes, mostrar ‘Eres un poco despistado, introduce un mes’.

DELIMITER $$; 
DROP PROCEDURE IF EXISTS num_mes $$; 
CREATE PROCEDURE num_mes (IN a INT, OUT mensaje VARCHAR(50)) 
BEGIN 
	Case a
		when 1 then
			set mensaje = "Enero";
		when 2 then
			set mensaje = "Febrero";
		when 3 then
			set mensaje = "Marzo";
		when 4 then
			set mensaje = "Abril";
		when 5 then
			set mensaje = "Mayo";
		when 6 then
			set mensaje = "Junio";
		when 7 then
			set mensaje = "Julio";
		when 8 then
			set mensaje = "Agosto";
		when 9 then
			set mensaje = "Septiembre";
		when 10 then
			set mensaje = "Octubre";
		when 11 then
			set mensaje = "Noviembre";
		when 12 then
			set mensaje = "Diciembre";
		Else
			set mensaje = "Eres un poco despistado, introduce un mes";
    end case;
END $$; 
DELIMITER ; 

set @n3 = 4;
set @mes = "";
call num_mes(@n3, @mes);
select @mes;

-- 3- Crear un procedimiento que reciba una cadena de tamaño 50 (puede usar una inferior si quiere) e
-- imprima por pantalla si es un palíndromo (no elimine espacios ni nada, solo compruebe que se lee
-- igual al derecho que al revés). (Busca información sobre cómo invertir una cadena)

DELIMITER $$; 
DROP PROCEDURE IF EXISTS palindromo $$; 
CREATE PROCEDURE palindromo (IN a varchar(50), OUT message varchar(50))
BEGIN 
	IF reverse(a) = a THEN
		set message = "Es un palindromo";
	ELSE
		set message = "No es un palindromo";
END IF;
END $$; 
DELIMITER ;

set @a = "Amor a Roma";
set @b = "";
call palindromo(@a, @b);
select @b;

