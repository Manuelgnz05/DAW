-- Ejercicio
-- 6: Gestión de una Flota de Transporte

-- Contexto:
-- Una empresa de logística necesita catalogar sus diferentes tipos de vehículos.
-- Enunciado: Tenemos una entidad genérica llamada Vehículos (Matrícula, marca, modelo). Los vehículos se dividen en dos tipos:
-- Camiones y Furgonetas. De los camiones queremos saber su "capacidad de carga (toneladas)" y de las furgonetas su "volumen de carga(m³)". 
-- Relaciones: Todos los vehículos son conducidos por Conductores (DNI, nombre). Un conductor puede conducir muchos vehículos y un vehículo puede ser conducido por 
-- varios conductores (queremos registrar la "fecha de asignación"). Además, cada vehículo tiene un Seguro (Número de póliza, compañía) asociado; 
-- un vehículo solo tiene un seguro activo, pero una compañía puede asegurar muchos vehículos.    

-- Reto: Implementar la herencia (Vehículo -> Camión/Furgoneta), 
-- una relación N:N (Conductor-Vehículo) y una relación 1:N (Seguro-Vehículo).

-- Herencia en SQL: No existe una palabra clave "INHERITS" estándar. Se suele representar haciendo que la clave primaria de la tabla hija sea también 
-- una clave foránea que apunta a la tabla padre.

-- Integridad: Si un vehículo es un camión, tendrá registros en Vehiculos y en Camiones. Si es una furgoneta, los tendrá en Vehiculos y Furgonetas.

-- Relaciones con el Padre: la relación N:N con los conductores se hace con la tabla Vehiculos, porque tanto los camiones como las furgonetas son, al fin y al cabo, vehículos.

-- Ejercicio 6: Gestión de una Flota de Transporte

DROP DATABASE IF EXISTS flota_transporte;
CREATE DATABASE flota_transporte;
USE flota_transporte;

-- 1. Tabla Seguros (Lado "1" de la relación 1:N con Vehículos)
-- La creamos primero porque Vehículos dependerá de ella.
DROP TABLE IF EXISTS Seguros;
CREATE TABLE Seguros (
    numPoliza VARCHAR(50) NOT NULL,
    compania VARCHAR(100) NOT NULL,
    PRIMARY KEY (numPoliza)
);

-- 2. Tabla Padre: Vehículos
-- Contiene los atributos comunes a todos los vehículos y la clave foránea del seguro.
DROP TABLE IF EXISTS Vehiculos;
CREATE TABLE Vehiculos (
    matricula VARCHAR(15) NOT NULL,
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    numPoliza VARCHAR(50) NOT NULL,
    PRIMARY KEY (matricula),
    FOREIGN KEY (numPoliza) REFERENCES Seguros(numPoliza)
);

-- 3. Tabla Hija: Camiones
-- Implementación de la herencia: La PK es al mismo tiempo FK hacia la tabla padre.
DROP TABLE IF EXISTS Camiones;
CREATE TABLE Camiones (
    matricula VARCHAR(15) NOT NULL,
    capacidadCarga FLOAT NOT NULL, -- Expresado en toneladas
    PRIMARY KEY (matricula),
    FOREIGN KEY (matricula) REFERENCES Vehiculos(matricula) ON DELETE CASCADE
);

-- 4. Tabla Hija: Furgonetas
-- Igual que los camiones, hereda de Vehículos.
DROP TABLE IF EXISTS Furgonetas;
CREATE TABLE Furgonetas (
    matricula VARCHAR(15) NOT NULL,
    volumenCarga FLOAT NOT NULL, -- Expresado en m³
    PRIMARY KEY (matricula),
    FOREIGN KEY (matricula) REFERENCES Vehiculos(matricula) ON DELETE CASCADE
);

-- 5. Tabla Conductores
DROP TABLE IF EXISTS Conductores;
CREATE TABLE Conductores (
    dni VARCHAR(9) NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    PRIMARY KEY (dni)
);

-- 6. Tabla Intermedia N:M (Conductores - Vehículos)
-- La relación se hace con la tabla padre (Vehículos) para que aplique a camiones y furgonetas.
DROP TABLE IF EXISTS Conduce;
CREATE TABLE Conduce (
    dni VARCHAR(9) NOT NULL,
    matricula VARCHAR(15) NOT NULL,
    fechaAsignacion DATE NOT NULL,
    PRIMARY KEY (dni, matricula),
    FOREIGN KEY (dni) REFERENCES Conductores(dni),
    FOREIGN KEY (matricula) REFERENCES Vehiculos(matricula)
);

-- 1. Seguros (No dependen de ninguna otra tabla)
INSERT INTO Seguros (numPoliza, compania) VALUES
('POL-1001', 'Mapfre'),
('POL-2002', 'Allianz');

-- 2. Conductores (Tampoco dependen de nada)
INSERT INTO Conductores (dni, nombre) VALUES
('12345678A', 'Ana García'),
('87654321B', 'Carlos López');

-- 3. Vehículos (Tabla Padre - Requiere que exista el Seguro)
-- Registramos todos los vehículos de la flota, sin importar su tipo.
INSERT INTO Vehiculos (matricula, marca, modelo, numPoliza) VALUES
('1111-AAA', 'Volvo', 'FH16', 'POL-1001'),       -- Este será un camión
('2222-BBB', 'Scania', 'R500', 'POL-2002'),      -- Este será un camión
('3333-CCC', 'Mercedes', 'Sprinter', 'POL-1001'),-- Esta será una furgoneta
('4444-DDD', 'Ford', 'Transit', 'POL-2002');     -- Esta será una furgoneta

-- 4. Camiones (Tabla Hija - Requiere que exista el Vehículo)
-- Solo insertamos las matrículas de los que realmente son camiones, añadiendo sus toneladas.
INSERT INTO Camiones (matricula, capacidadCarga) VALUES
('1111-AAA', 24.5),
('2222-BBB', 40.0);

-- 5. Furgonetas (Tabla Hija - Requiere que exista el Vehículo)
-- Solo insertamos las matrículas de las furgonetas, añadiendo sus metros cúbicos.
INSERT INTO Furgonetas (matricula, volumenCarga) VALUES
('3333-CCC', 14.0),
('4444-DDD', 11.5);

-- 6. Conduce (Tabla Intermedia N:M - Requiere Conductor y Vehículo)
-- Asignamos quién conduce qué y cuándo.
INSERT INTO Conduce (dni, matricula, fechaAsignacion) VALUES
('12345678A', '1111-AAA', '2024-01-10'), -- Ana conduce el Volvo (Camión)
('12345678A', '3333-CCC', '2024-02-15'), -- Ana también conduce la Sprinter (Furgoneta)
('87654321B', '4444-DDD', '2024-03-01'); -- Carlos conduce la Transit (Furgoneta)