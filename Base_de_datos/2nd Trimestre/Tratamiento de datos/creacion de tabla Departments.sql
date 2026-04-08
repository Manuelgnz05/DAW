/*
Crear una base de datos llamada Departments. La base de datos debe tener
dos tablas:
Departments:
	- con un campo Code de tipo entero, clave primaria.
	- con un campo Name de tipo cadena variable de tamaño maximo 255, no nulo.
	- con un campo Budget de tipo decimal, no nulo
Employees:
	- con un campo SSN de tipo entero, clave primaria.
	- con un campo Name de tipo cadena variable de tamaño maximo 255, no nulo.
	- con un campo LastName de tipo cadena variable de tamaño maximo 255, no nulo.
	- con un campo Department de tipo entero no nulo, clave ajena hacia la tabla 
	Departments.
*/

drop database if exists Departments;
create database if not exists Departments;
use Departments;

create table if not exists Departments(
	Code int primary key,
    Name varchar(255) not null,
    Budget decimal not null
);

create table if not exists Employees(
	SSN int primary key,
    Name varchar(255) not null,
    LastName varchar(255) not null,
    Department int not null,
    foreign key(Department) references Departments(Code)
);

INSERT INTO Departments (Code, Name, Budget) VALUES
(1, 'Desarrollo Java', 250000.00),
(2, 'Base de Datos', 180000.00),
(3, 'Web Development', 220000.00),
(4, 'Administración', 150000.00);

INSERT INTO Employees (SSN, Name, LastName, Department) VALUES
(123456789, 'Juan', 'Pérez García', 1),
(234567890, 'María', 'López Ruiz', 1),
(345678901, 'Carlos', 'García Soto', 2),
(456789012, 'Ana', 'Martínez Vega', 2),
(567890123, 'David', 'Rodríguez Cruz', 3),
(678901234, 'Laura', 'Sánchez Díaz', 3),
(789012345, 'Miguel', 'Torres Molina', 4);
