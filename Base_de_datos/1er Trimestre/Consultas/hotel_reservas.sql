-- --------------------------------------------------
-- CREACIÓN DE LA BASE DE DATOS
-- --------------------------------------------------
DROP DATABASE IF EXISTS hotel_reservas;
CREATE DATABASE hotel_reservas CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE hotel_reservas;

-- --------------------------------------------------
-- TABLAS
-- --------------------------------------------------

CREATE TABLE clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    email VARCHAR(150),
    telefono VARCHAR(20),
    pais VARCHAR(100),
    fecha_registro DATE
);

CREATE TABLE empleados (
    id_empleado INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100),
    cargo VARCHAR(100),
    fecha_contratacion DATE,
    salario DECIMAL(10,2)
);

CREATE TABLE habitaciones (
    id_habitacion INT AUTO_INCREMENT PRIMARY KEY,
    numero VARCHAR(10) NOT NULL,
    tipo VARCHAR(50),
    precio_noche DECIMAL(10,2),
    estado VARCHAR(20)
);

CREATE TABLE reservas (
    id_reserva INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT,
    id_empleado INT,
    id_habitacion INT,
    fecha_entrada DATE,
    fecha_salida DATE,
    estado VARCHAR(50),
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente),
    FOREIGN KEY (id_empleado) REFERENCES empleados(id_empleado),
    FOREIGN KEY (id_habitacion) REFERENCES habitaciones(id_habitacion)
);

CREATE TABLE servicios (
    id_servicio INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    precio DECIMAL(10,2)
);

CREATE TABLE servicio_reserva (
    id_reserva INT,
    id_servicio INT,
    cantidad INT,
    PRIMARY KEY (id_reserva, id_servicio),
    FOREIGN KEY (id_reserva) REFERENCES reservas(id_reserva),
    FOREIGN KEY (id_servicio) REFERENCES servicios(id_servicio)
);

-- --------------------------------------------------
-- DATOS DE PRUEBA
-- --------------------------------------------------

INSERT INTO clientes (nombre, apellido, email, telefono, pais, fecha_registro) VALUES
('María', 'López', 'maria.lopez@gmail.com', '600123456', 'España', '2023-01-10'),
('Carlos', 'Pérez', 'carlos.perez@yahoo.com', '611234567', 'España', '2023-03-15'),
('Anna', 'Müller', 'anna.muller@web.de', '49151234567', 'Alemania', '2023-06-20'),
('John', 'Smith', 'john.smith@mail.co.uk', '441234567890', 'Reino Unido', '2022-12-01'),
('Lucía', 'Torres', 'lucia.torres@gmail.com', '622345678', 'España', '2024-02-05'),
('Sophie', 'Dubois', 'sophie.dubois@orange.fr', '33123456789', 'Francia', '2024-05-30');

INSERT INTO empleados (nombre, apellido, cargo, fecha_contratacion, salario) VALUES
('Laura', 'Martínez', 'Recepcionista', '2022-04-01', 1600.00),
('Pedro', 'García', 'Recepcionista', '2023-01-15', 1550.00),
('Ana', 'Suárez', 'Gerente', '2021-10-10', 2500.00),
('Javier', 'Ruiz', 'Conserje', '2023-05-05', 1400.00);

INSERT INTO habitaciones (numero, tipo, precio_noche, estado) VALUES
('101', 'Individual', 60.00, 'disponible'),
('102', 'Doble', 85.00, 'ocupada'),
('103', 'Doble', 90.00, 'disponible'),
('201', 'Suite', 150.00, 'mantenimiento'),
('202', 'Suite', 180.00, 'disponible'),
('203', 'Individual', 65.00, 'ocupada');

INSERT INTO servicios (nombre, precio) VALUES
('Desayuno buffet', 10.00),
('Spa', 35.00),
('Servicio de lavandería', 8.00),
('Parking', 12.00),
('Transporte al aeropuerto', 25.00);

-- ✅ SOLO ESTE BLOQUE DE RESERVAS
INSERT INTO reservas (id_cliente, id_empleado, id_habitacion, fecha_entrada, fecha_salida, estado) VALUES
(1, 1, 2, '2024-06-10', '2024-06-15', 'completada'),
(2, 1, 3, '2024-07-05', '2024-07-10', 'completada'),
(3, 2, 5, '2024-08-01', '2024-08-07', 'confirmada'),
(4, 3, 4, '2024-09-12', '2024-09-15', 'cancelada'),
(5, 1, 1, '2024-09-20', '2024-09-25', 'confirmada'),
(6, 2, 6, '2024-10-01', '2024-10-04', 'completada');

INSERT INTO servicio_reserva (id_reserva, id_servicio, cantidad) VALUES
(1, 1, 2),
(1, 4, 1),
(2, 1, 2),
(3, 2, 1),
(3, 1, 2),
(4, 5, 1),
(5, 1, 2),
(5, 3, 1),
(6, 1, 2),
(6, 4, 1);
