-- Contexto:
-- Un comité organiza eventos deportivos y asigna directivos a cada sede.

-- Enunciado: Tenemos Sedes(ID_Sede, nombre, ciudad) y Directores (DNI, nombre, años_experiencia). Cada sede es gestionada por un único director,
-- y cada director solo puede estar a cargo de una sede a la vez. Queremos saber la "fecha de nombramiento" del director en esa sede.

-- Implementar una relación 1:1 real. Para ello, se coloca la FK en una de las tablas y se le añade una restricción de unicidad (UNIQUE), 
-- impidiendo que un director se repita en varias sedes.

-- Ejercicio: Gestión de Eventos Deportivos (Relación 1:1)

DROP DATABASE IF EXISTS eventos_deportivos;
CREATE DATABASE eventos_deportivos;
USE eventos_deportivos;

-- 1. Tabla Directores (La creamos primero porque será referenciada)
DROP TABLE IF EXISTS Directores;
CREATE TABLE Directores (
    dni VARCHAR(9) NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    anios_experiencia INT NOT NULL, -- Uso 'anios' en lugar de 'años' para evitar problemas de codificación
    PRIMARY KEY (dni)
);

-- 2. Tabla Sedes (Aquí implementaremos la relación 1:1)
DROP TABLE IF EXISTS Sedes;
CREATE TABLE Sedes (
    idSede INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    ciudad VARCHAR(50) NOT NULL,
    
    -- Atributos de la relación
    dni_director VARCHAR(9), 
    fecha_nombramiento DATE,
    
    PRIMARY KEY (idSede),
    FOREIGN KEY (dni_director) REFERENCES Directores(dni),
    
    -- ¡Aquí está la magia del 1:1!
    UNIQUE (dni_director) 
);

USE eventos_deportivos;

-- 1. Insertamos primero a los Directores
INSERT INTO Directores (dni, nombre, anios_experiencia) VALUES 
('11111111A', 'Laura Gómez', 10),
('22222222B', 'Pedro Martínez', 5),
('33333333C', 'Sofía Ruiz', 8);

-- 2. Insertamos las Sedes y les asignamos un director
INSERT INTO Sedes (nombre, ciudad, dni_director, fecha_nombramiento) VALUES 
('Estadio Olímpico', 'Sevilla', '11111111A', '2023-01-15'),
('Pabellón Central', 'Madrid', '22222222B', '2023-06-20');

-- 3. Sede sin director asignado (dni_director puede ser NULL)
INSERT INTO Sedes (nombre, ciudad, dni_director, fecha_nombramiento) VALUES 
('Polideportivo Norte', 'Valencia', NULL, NULL);

-- ❌ EJEMPLO DE ERROR (Relación 1:1):
-- Si intentaras ejecutar el siguiente INSERT, MySQL te daría un error 
-- porque el DNI '11111111A' ya está asignado al Estadio Olímpico y pusimos UNIQUE.
-- INSERT INTO Sedes (nombre, ciudad, dni_director) VALUES ('Pistas de Tenis', 'Barcelona', '11111111A');