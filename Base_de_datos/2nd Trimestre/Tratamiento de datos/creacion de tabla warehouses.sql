/*
Crear una base de datos llamada WAREHOUSES, destinada a almacenar información sobre unos almacenes. La base de datos debe tener dos tablas:
Warehouses:
    - con un campo Code de tipo entero no nulo, clave primaria.
    - con un campo Location de tipo cadena variable de tamaño maximo 255, no nulo.
    - con un campo Capacity de tipo entero no nulo.
Boxes:
    - con un campo Code de tipo cadena variable de tamaño maximo 255, no nulo, clave primaria.
    - con un campo Contents de tipo cadena variable de tamaño maximo 255, no nulo.
    - con un campo Value de tipo real no nulo.
    - con un campo Warehouse de tipo entero no nulo, clave ajena hacia la tabla Warehouses
*/

drop database if exists warehouses;
create database if not exists warehouses;
use warehouses;

create table if not exists Warehouses(
	Code int not null primary key,
    Location varchar(255) not null,
    Capacity int not null
);

create table if not exists Boxes(
	Code varchar(255) not null primary key,
    Contents varchar(255) not null,
    Value real not null,
    Warehouses int not null,
    foreign key(Warehouses) references Warehouses(Code)
);

INSERT INTO Warehouses (Code, Location, Capacity) VALUES
(1, 'Sevilla, Andalucía', 1000),
(2, 'Madrid, Comunidad de Madrid', 1500),
(3, 'Barcelona, Cataluña', 1200),
(4, 'Valencia, Comunidad Valenciana', 800);

INSERT INTO Boxes (Code, Contents, Value, Warehouses) VALUES
('B001', 'Electrónica variada', 1250.50, 1),
('B002', 'Herramientas de precisión', 850.00, 1),
('B003', 'Componentes GPU', 3200.75, 2),
('B004', 'Discos SSD 2TB', 950.25, 2),
('B005', 'Procesadores Intel i7', 1800.00, 3),
('B006', 'Ryzen 7 y accesorios', 1450.99, 3),
('B007', 'Cables y conectores', 275.30, 4);
