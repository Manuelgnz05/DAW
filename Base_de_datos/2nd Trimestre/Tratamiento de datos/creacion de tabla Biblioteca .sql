-- 1. Biblioteca sencilla
-- Una biblioteca quiere guardar información sobre sus libros. De cada libro necesita almacenar: título,
-- autor, año de publicación, número de páginas y género literario.
-- Crear la base de datos y las tablas necesaria.

drop database if exists Biblioteca;
create database if not exists Biblioteca;
use Biblioteca;

create table if not exists Libro(
	ID int primary key not null,
	Título varchar(255) not null,
    Autor varchar(255) not null,
    Año_de_publicacion date not null, 
    Número_paginas int not null,
    Género_literario varchar(55) 
);

INSERT INTO Libro (Título, Autor, Año_de_publicacion, Número_paginas, Género_literario) VALUES
('Cien años de soledad', 'Gabriel García Márquez', '1967-05-30 00:00:00', 471, 'Realismo mágico'),
('1984', 'George Orwell', '1949-06-08 00:00:00', 328, 'Distopía'),
('El resplandor', 'Stephen King', '1977-01-28 00:00:00', 447, 'Terror'),
('Don Quijote de la Mancha', 'Miguel de Cervantes', '1605-01-16 00:00:00', 1032, 'Novela de aventuras'),
('Fundación', 'Isaac Asimov', '1951-06-01 00:00:00', 255, 'Ciencia ficción'),
('Orgullo y prejuicio', 'Jane Austen', '1813-01-28 00:00:00', 432, 'Romance'),
('El código Da Vinci', 'Dan Brown', '2003-03-18 00:00:00', 489, 'Suspenso'),
('Crónica de una muerte anunciada', 'Gabriel García Márquez', '1981-01-01 00:00:00', 150, 'Novela'),
('Sapiens: De animales a dioses', 'Yuval Noah Harari', '2011-01-01 00:00:00', 496, 'Ensayo'),
('El Hobbit', 'J.R.R. Tolkien', '1937-09-21 00:00:00', 310, 'Fantasía');