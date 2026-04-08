-- Contexto:
-- Una aerolínea necesita modelar sus vuelos y los asientos disponibles.

-- Enunciado: Tenemos Vuelos(ID_Vuelo, origen, destino, hora). Cada vuelo tiene múltiples
-- Asientos. Un asiento se identifica por un número (ej: '12A'), pero ese número no es único en el sistema (muchos vuelos tienen un asiento '12A'). 
-- El asiento solo existe si existe el vuelo, y se identifica por la combinación del ID del vuelo y su número de asiento. 
-- Además, tenemos Pasajeros (DNI, nombre) que reservan esos asientos.

-- Crear una entidad débil (Asientos) cuya clave primaria sea compuesta, formada por su propio número y la clave foránea del vuelo.

-- Entidades Débiles (Dependencia de Existencia)
-- Son entidades que no tienen sentido por sí solas y dependen de una entidad fuerte. Su identificación depende de otra tabla.

-- Ejemplo:
-- Un Hotel (edificio) y sus Habitaciones. La "Habitación 101" no significa nada si no sabemos de qué "Hotel" hablamos. 
-- La clave primaria de la tabla débil es compuesta: (ID_Hotel + Num_Habitacion).

-- Ejercicio: Gestión de Vuelos y Asientos (Entidad Débil)

DROP DATABASE IF EXISTS gestion_vuelos;
CREATE DATABASE gestion_vuelos;
USE gestion_vuelos;

-- 1. Tabla Fuerte: Vuelos
DROP TABLE IF EXISTS Vuelos;
CREATE TABLE Vuelos (
    idVuelo INT NOT NULL AUTO_INCREMENT,
    origen VARCHAR(50) NOT NULL,
    destino VARCHAR(50) NOT NULL,
    hora DATETIME NOT NULL,
    PRIMARY KEY (idVuelo)
);

-- 2. Tabla Fuerte: Pasajeros (La creamos antes de los asientos para poder referenciarla)
DROP TABLE IF EXISTS Pasajeros;
CREATE TABLE Pasajeros (
    dni VARCHAR(9) NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    PRIMARY KEY (dni)
);

-- 3. Tabla Débil: Asientos
-- Su existencia depende totalmente de la tabla Vuelos.
DROP TABLE IF EXISTS Asientos;
CREATE TABLE Asientos (
    idVuelo INT NOT NULL,
    numero VARCHAR(5) NOT NULL, -- Ej: '12A', '14F'
    
    -- Atributo para gestionar la reserva (NULL significa que está libre)
    dni_pasajero VARCHAR(9), 
    
    -- ¡La clave primaria es COMPUESTA! (La propia + la del padre)
    PRIMARY KEY (idVuelo, numero),
    
    -- Clave foránea hacia la entidad fuerte (Vuelo)
    -- ON DELETE CASCADE es vital aquí: si se borra el vuelo, se borran sus asientos.
    FOREIGN KEY (idVuelo) REFERENCES Vuelos(idVuelo) ON DELETE CASCADE,
    
    -- Clave foránea hacia el pasajero que reserva
    FOREIGN KEY (dni_pasajero) REFERENCES Pasajeros(dni)
);

USE gestion_vuelos;

-- 1. Insertamos los Vuelos (Entidad Fuerte)
INSERT INTO Vuelos (origen, destino, hora) VALUES 
('Madrid', 'París', '2026-04-15 10:00:00'),   -- Será el idVuelo 1
('Sevilla', 'Roma', '2026-04-16 18:30:00');   -- Será el idVuelo 2

-- 2. Insertamos los Pasajeros (Entidad Fuerte)
INSERT INTO Pasajeros (dni, nombre) VALUES 
('99999999X', 'Carmen López'),
('88888888Y', 'Antonio Fernández');

-- 3. Insertamos los Asientos (Entidad Débil)
-- Fíjate cómo el asiento '1A' se repite, pero en distintos vuelos.
-- Algunos tienen pasajero asignado (reserva) y otros tienen NULL (disponibles).
INSERT INTO Asientos (idVuelo, numero, dni_pasajero) VALUES 
(1, '1A', '99999999X'), -- Asiento 1A del Vuelo 1 reservado por Carmen
(1, '1B', NULL),        -- Asiento 1B del Vuelo 1 está LIBRE
(1, '2A', NULL),        -- Asiento 2A del Vuelo 1 está LIBRE

(2, '1A', '88888888Y'), -- Asiento 1A del Vuelo 2 reservado por Antonio
(2, '1B', '99999999X'), -- Asiento 1B del Vuelo 2 reservado por Carmen (viaja en ambos)
(2, '2A', NULL);        -- Asiento 2A del Vuelo 2 está LIBRE