-- 8. Películas y actores
-- Una plataforma de cine quiere almacenar películas y actores.
-- • De las películas: título, año, duración, género.
-- • De los actores: nombre, nacionalidad, fecha de nacimiento.
-- Un actor puede participar en varias películas y una película puede tener varios actores.

drop database if exists cine;
create database if not exists cine;
use cine;

create table if not exists películas(
	idPeliculas int primary key auto_increment,
    título varchar(255) not null,
    ano date,
	duración int,
    género varchar(55)
);

create table if not exists actores(
	idActores int primary key auto_increment,
	nombre varchar(255) not null,
	nacionalidad varchar(55),
    fecha_nacimiento date
);

create table if not exists reparto(
    pelicula int not null,
    actores int not null,
    primary key(pelicula, actores),
    foreign key(pelicula) references películas(idPeliculas),
    foreign key(actores) references actores(idActores)
);

INSERT INTO películas (título, ano, duración, género) VALUES
('Inception', '2010-01-01', 148, 'Ciencia Ficción'),
('Pulp Fiction', '1994-01-01', 154, 'Crimen'),
('The Matrix', '1999-01-01', 136, 'Acción'),
('Interstellar', '2014-01-01', 169, 'Ciencia Ficción');

INSERT INTO actores (nombre, nacionalidad, fecha_nacimiento) VALUES
('Leonardo DiCaprio', 'Estadounidense', '1974-11-11'),
('Samuel L. Jackson', 'Estadounidense', '1948-12-21'),
('Keanu Reeves', 'Canadiense', '1964-09-02'),
('Matthew McConaughey', 'Estadounidense', '1969-11-04');

INSERT INTO reparto (pelicula, actores) VALUES
(1, 1), -- DiCaprio en Inception
(4, 4), -- McConaughey en Interstellar
(2, 2), -- Samuel L. Jackson en Pulp Fiction
(3, 3), -- Keanu Reeves en The Matrix
(1, 2); -- Imaginemos que Samuel L. Jackson también sale en Inception (dato de prueba)