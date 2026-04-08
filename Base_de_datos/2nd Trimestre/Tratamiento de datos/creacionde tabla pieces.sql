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

CREATE TABLE Pieces(
   CodeID int not null,
   Name text not null,
   primary key (CodeID)
);

CREATE TABLE Providers(
   CodeID varchar(40) primary key not null,
   Name text not null
);

CREATE TABLE Provides(
	Piece int,
   Provider varchar(40),
   Price int not null,
   foreign key(Piece) references Pieces(CodeID),
   foreign key(Provider) references Providers(CodeID),
   primary key (Piece, Provider)
);


