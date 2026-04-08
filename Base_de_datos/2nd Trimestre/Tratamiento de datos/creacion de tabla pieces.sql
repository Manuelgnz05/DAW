/*
Crear una base de datos llamada PIECES, destinada a almacenar productos de varios
proveedores. La base de datos debe tener tres tablas:
Pieces:
    - con un campo CodeID de tipo entero como clave primaria no nula.
    - con un campo Name de tipo texto no nulo.
Providers:
    - con un campo CodeID de tipo cadena variable de tamaño maximo 40, como clave primaria no nula.
    - con un campo Name de tipo texto no nulo.
Provides:
    - con un campo Piece de tipo entero, clave ajena hacia la tabla Pieces.
    - con un campo Provider de tipo cadena variable de tamaño maximo 40, como clave ajena hacia la tabla Providers.
    - con un campo Price de tipo entero no nulo.
    - la clave primaria la conforman los campos Piece y Provider.

Usar la IA para añadir instrucciones para rellenar las tablas. Hacer esto mismo en todos los ejercicios siguientes.
*/

drop database if exists pieces;
create database if not exists pieces;
USE pieces;

CREATE TABLE if not exists  Pieces(
   CodeID int auto_increment,
   Name text not null,
   primary key (CodeID)
);

CREATE TABLE if not exists  Providers(
   CodeID varchar(40) primary key not null,
   Name text not null
);

CREATE TABLE if not exists  Provides(
	Piece int,
   Provider varchar(40),
   Price int not null,
   foreign key(Piece) references Pieces(CodeID),
   foreign key(Provider) references Providers(CodeID),
   primary key (Piece, Provider)
);

INSERT INTO Pieces (CodeID, Name) VALUES
(1, 'Intel Core i7-13700K'),
(2, 'AMD Ryzen 7 7800X3D'),
(3, 'NVIDIA RTX 4080'),
(4, 'Samsung 990 PRO 2TB');

INSERT INTO Providers (CodeID, Name) VALUES
('P001', 'Amazon España'),
('P002', 'PcComponentes'),
('P003', 'Coolmod'),
('P004', 'Alternate');

INSERT INTO Provides (Piece, Provider, Price) VALUES
(1, 'P001', 450),
(1, 'P002', 440),
(2, 'P001', 480),
(2, 'P003', 470),
(3, 'P002', 1200),
(3, 'P004', 1180),
(4, 'P001', 180),
(4, 'P003', 175);

