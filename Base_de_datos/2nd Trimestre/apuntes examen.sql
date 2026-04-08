-- insert into, update y delete

-- 1. Añadir una entrada a la base de datos para indicar que "Suministros Skellington" (code "TNBC") 
-- proveerá piñones (code "1") por 7 céntimos cada uno.
insert into provee (ID_pieza, ID_proveedor, precio) values (1, 'TNBC', 7);
-- 2. Incrementa todos los precios por un céntimo.
update provee set precio = precio+1;
-- 3. Actualiza la base de datos para reflejar que "Corporacion Susan Calvin" (code "RBT") no proveerá clavos (code 4).
delete from provee where ID_Proveedor = "RBT" and ID_Pieza = 4;
-- 4. Configura la calificación de todas las películas sin calificar a "G"
update movies set rating = "G" where rating is null;

-- Ejemplo creacion base de datos

-- Ejercicio 2: Red de Clínicas Veterinarias
-- Contexto: Una empresa gestiona varias clínicas en diferentes ciudades.
-- Enunciado: Cada Clínica (ID, dirección, teléfono) tiene varios Veterinarios (Colegiado,
-- nombre, especialidad) trabajando en ella, pero un veterinario solo trabaja en una clínica.
-- Los veterinarios atienden a Mascotas (Chip, nombre, especie). Una mascota puede ser
-- atendida por diferentes veterinarios en distintas fechas, y un veterinario atiende a muchas
-- mascotas. Además, cada mascota tiene un único Dueño (DNI, nombre), pero un dueño
-- puede tener varias mascotas.

drop database if exists Veterinario;
create database if not exists Veterinario;
use Veterinario;

create table clinicas (
    id_clinica int primary key,
    direccion varchar(200),
    telefono varchar(20)
);

create table veterinarios (
    n_colegiado varchar(20) primary key,
    nombre varchar(100),
    especialidad varchar(100),
    id_clinica int,
    foreign key (id_clinica) references clinicas(id_clinica)
);

create table duenos (
	idDueno int primary key not null auto_increment,
    dni varchar(9) not null,
    nombre varchar(100)
);

create table mascotas (
    chip int primary key,
    nombre varchar(50),
    especie varchar(50),
    dni_dueno varchar(20),
    foreign key (dni_dueno) references duenos(dni)
);

create table visitas (
    n_colegiado varchar(20),
    chip_mascota varchar(20),
    fecha datetime,
    diagnostico text,
    primary key (n_colegiado, chip_mascota, fecha),
    foreign key (n_colegiado) references veterinarios(n_colegiado),
    foreign key (chip_mascota) references mascotas(chip)
);

-- Funcion

DELIMITER $$;
DROP FUNCTION IF EXISTS medir_longitud$$;
CREATE FUNCTION medir_longitud(cadena varchar(100))
	RETURNS int
DETERMINISTIC
BEGIN
	RETURN length(cadena);
END$$;
DELIMITER ;

-- Proceso

DELIMITER $$; 
DROP PROCEDURE IF EXISTS proc_entrada $$; 
CREATE PROCEDURE proc_entrada (IN p INT) 
	BEGIN 
		SET p = 5; 
END $$; 
DELIMITER ;

-- Condicionales

-- IF

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

-- Case when

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

-- select into

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