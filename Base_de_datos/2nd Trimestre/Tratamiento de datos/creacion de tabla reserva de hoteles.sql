-- 10. Sistema de reservas de un hotel
-- Un hotel quiere almacenar:
-- • Habitaciones: número, tipo, precio por noche.
-- • Clientes: nombre, apellidos, DNI, teléfono.
-- • Reservas: fecha de entrada, fecha de salida, número de personas.
-- Cada reserva pertenece a un cliente y a una habitación concreta.
-- Los alumnos deben identificar dos claves foráneas en la tabla de reservas.

drop database if exists hotel;
create database if not exists hotel;
use hotel;

create table if not exists Habitaciones(
	idHabitacion int primary key not null auto_increment,
    tipo varchar(255) not null,
    precio_noche float not null
);

create table if not exists Clientes(
	idCliente int primary key auto_increment not null,
	nombre varchar(255) not null,
    apellidos varchar(255) not null,
    DNI varchar(55) not null,
    telefono varchar(55)
);

create table if not exists Reservas(
	idReserva int primary key not null auto_increment,
    fecha_entrada date not null,
    fecha_salida date not null,
    personas int not null,
    cliente int not null,
    habitacion int not null,
    foreign key(cliente) references Clientes(idCliente),
    foreign key(habitacion) references Habitaciones(idHabitacion)
);

INSERT INTO Habitaciones (tipo, precio_noche) VALUES
('Individual Standard', 45.00),
('Doble Superior', 85.50),
('Suite Junior', 120.00),
('Familiar Deluxe', 150.00),
('Doble Económica', 60.00);

INSERT INTO Clientes (nombre, apellidos, DNI, telefono) VALUES
('Antonio', 'García Pérez', '12345678A', '600111222'),
('Marta', 'Sánchez Lora', '87654321B', '611333444'),
('Julian', 'Casas Trigo', '45678912C', '622555666'),
('Lucía', 'Martín Sol', '32165498D', '633777888');

INSERT INTO Reservas (fecha_entrada, fecha_salida, personas, cliente, habitacion) VALUES
('2026-05-10', '2026-05-15', 1, 1, 1), -- Antonio en Individual
('2026-06-01', '2026-06-03', 2, 2, 2), -- Marta en Doble Superior
('2026-06-15', '2026-06-20', 4, 3, 4), -- Julian en Familiar
('2026-07-01', '2026-07-02', 2, 4, 3), -- Lucía en Suite
('2026-08-10', '2026-08-12', 2, 1, 5); -- Antonio repite en Doble Económica