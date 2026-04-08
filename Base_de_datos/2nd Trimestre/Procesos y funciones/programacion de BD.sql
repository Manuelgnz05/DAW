-- Crear una rutina que reciba un número y lo eleve al cuadrado.
DELIMITER $$; 
DROP PROCEDURE IF EXISTS alCuadrado $$; 
CREATE PROCEDURE alCuadrado (INOUT a INT)
BEGIN 
    set a = a*a;
END $$; 
DELIMITER ;

set @a = 2;
call alCuadrado(@a);
select @a;

-- Crear una rutina que reciba dos números, y eleve el primero al segundo (potencia).

DELIMITER $$; 
DROP PROCEDURE IF EXISTS elevar $$; 
CREATE PROCEDURE elevar (INOUT a INT, IN b INT)
BEGIN 
    set a = power(a, b);
END $$; 
DELIMITER ;

set @a = 2;
set @b = 4;
call alCuadrado(@a, @b);
select @a;

-- Crear una rutina que reciba dos cadenas y las concatene con un guion bajo.

DELIMITER $$;
DROP FUNCTION IF EXISTS concatenar$$;
CREATE FUNCTION Northwind.concatenar(cadena varchar(100), cadena2 varchar(100))
	RETURNS varchar(201)
DETERMINISTIC
BEGIN
	RETURN concat_ws("_", cadena, cadena2);
END$$;
DELIMITER ;

set @a = "Manuel";
set @b = "González";
select concatenar(@a, @b);

-- Crear una rutina que reciba una cadena y le quite los espacios del principio y el final.

DELIMITER $$; 
DROP PROCEDURE IF EXISTS quitarEspacios $$; 
CREATE PROCEDURE quitarEspacios (INOUT a varchar(50))
BEGIN 
    set a = trim(a);
END $$; 
DELIMITER ;

set @a = "   Manuel  ";
call quitarEspacios(@a);
select @a;

-- Crear una rutina que reciba una cadena y genere una segunda con el mismo contenido pero en mayúsculas.

DELIMITER $$;
DROP FUNCTION IF EXISTS ponerMayusculas$$;
CREATE FUNCTION ponerMayusculas(cadena varchar(100))
	RETURNS varchar(100)
DETERMINISTIC
BEGIN
	RETURN upper(cadena);
END$$;
DELIMITER ;

set @a = "Manuel";
select ponerMayusculas(@a);
