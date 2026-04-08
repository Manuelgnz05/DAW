-- 2. Registro de alumnos
-- Un centro educativo quiere almacenar datos de sus alumnos: nombre, apellidos, fecha de
-- nacimiento, email y teléfono.

drop database if exists Alumnos;
create database if not exists Alumnos;
use Alumnos;

create table if not exists Alumno(
	ID int primary key not null,
	Nombre varchar(255) not null,
    Apellidos varchar(255) not null,
    Fecha_de_nacimiento datetime not null, 
    Email varchar(55),
    Télefono varchar(55) not null
);

INSERT INTO Alumno (Nombre, Apellidos, Fecha_de_nacimiento, Email, Télefono) VALUES
('Alejandro', 'García López', '2005-03-15 00:00:00', 'ale.garcia@email.com', 600123456),
('María', 'Rodríguez Martínez', '2004-07-22 00:00:00', 'm.rodriguez@email.com', 611223344),
('Carlos', 'Sánchez Pérez', '2005-11-30 00:00:00', 'csanchez88@email.com', 622334455),
('Lucía', 'Fernández Gómez', '2006-01-12 00:00:00', 'lucia.fer@email.com', 633445566),
('Javier', 'Ruiz Hernández', '2004-05-05 00:00:00', 'javi.ruiz@email.com', 644556677),
('Elena', 'Díaz Moreno', '2005-09-18 00:00:00', 'elena.diaz@email.com', 655667788),
('Diego', 'Álvarez Torres', '2003-12-25 00:00:00', 'dalvarez@email.com', 666778899),
('Sofía', 'Romero Jiménez', '2006-04-10 00:00:00', 'sofia.rom@email.com', 677889900),
('Adrian', 'Vázquez Castro', '2005-08-14 00:00:00', 'adrian.vaz@email.com', 688990011),
('Paula', 'Gil Cano', '2004-02-28 00:00:00', 'paula.gil@email.com', 699001122);