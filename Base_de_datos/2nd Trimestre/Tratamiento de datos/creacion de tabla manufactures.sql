/*
Crear una base de datos llamada Manufacturers. La base de datos debe tener
dos tablas:
Manufacturers:
	- con un campo Code de tipo entero, clave primaria.
	- con un campo Name de tipo cadena variable de tamaño maximo 255, no nulo.
Products:
	- con un campo Code de tipo entero, clave primaria.
	- con un campo Name de tipo cadena variable de tamaño maximo 255, no nulo.
	- con un campo Price de tipo decimal, no nulo.
	- con un campo Manufacturer de tipo entero no nulo, clave ajena hacia la tabla 
	Manufacturers.
*/

drop database if exists manufacturers;
create database if not exists manufacturers;
use manufacturers;

create table if not exists Manufacturers(
	Code int primary key,
    Name varchar(255) not null
);

create table if not exists Products(
	Code int primary key,
    Name varchar(255) not null,
    Price decimal not null,
    Manufacturer int not null,
    foreign key(Manufacturer) references Manufacturers(Code)
);

INSERT INTO Manufacturers (Code, Name) VALUES
(1, 'Intel'),
(2, 'AMD'),
(3, 'NVIDIA'),
(4, 'Samsung'),
(5, 'ASUS');

INSERT INTO Products (Code, Name, Price, Manufacturer) VALUES
(101, 'Intel Core i7-13700K', 429.99, 1),
(102, 'Intel Core i5-13600K', 329.99, 1),
(201, 'AMD Ryzen 7 7800X3D', 449.99, 2),
(202, 'AMD Ryzen 5 7600X', 259.99, 2),
(301, 'NVIDIA GeForce RTX 4080', 1199.00, 3),
(302, 'NVIDIA GeForce RTX 4070', 599.00, 3),
(401, 'Samsung 990 PRO 2TB', 189.90, 4),
(501, 'ASUS TUF Gaming B650-PLUS', 229.90, 5);


