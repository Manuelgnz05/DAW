-- 5. Profesores y asignaturas
-- Un instituto quiere almacenar qué asignaturas imparte cada profesor.
-- • De los profesores: nombre, apellidos, especialidad.
-- • De las asignaturas: nombre, curso al que pertenecen.
-- Cada profesor puede impartir varias asignaturas, pero cada asignatura solo tiene un profesor.

drop database if exists Colegio;
create database if not exists Colegio;
use Colegio;

create table if not exists profesores(
	idProfesor int primary key auto_increment,
	Nombre varchar(100) not null,
    Apellidos varchar(100) not null,
    especialidad varchar(55)
);

create table if not exists asignaturas(
	idAsignatura int primary key auto_increment,
	Nombre varchar(100) not null,
	Curso varchar(55) not null,
    Profesor int not null,
    foreign key(Profesor) references profesores(idProfesor)
);

INSERT INTO profesores (Nombre, Apellidos, especialidad) VALUES
('Clara', 'Fuentes Ortiz', 'Matemáticas'),
('Sergio', 'Marín Nieto', 'Tecnología'),
('Beatriz', 'Luna Valdés', 'Historia'),
('Fernando', 'Solís Guerra', 'Idiomas');

INSERT INTO asignaturas (Nombre, Curso, Profesor) VALUES
('Álgebra Lineal', '1º Bachillerato', 1),
('Programación Java', '2º DAW', 2),
('Sistemas Informáticos', '1º ASIR', 2),
('Historia Contemporánea', '4º ESO', 3),
('Inglés Técnico', '1º DAW', 4);
