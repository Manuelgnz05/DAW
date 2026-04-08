-- 7. Cursos y alumnos
-- Un centro de formación quiere registrar qué alumnos están matriculados en qué cursos.
-- • De los cursos: nombre, duración en horas, fecha de inicio.
-- • De los alumnos: nombre, apellidos, email.
-- Un alumno puede estar en varios cursos y un curso puede tener varios alumnos.
-- Los alumnos deben deducir la tabla intermedia.

drop database if exists centro;
create database if not exists centro;
use centro;

create table if not exists cursos(
	idCurso int primary key auto_increment not null,
	duración int not null,
    inicio date not null
);

create table if not exists alumnos(
	idAlumno int primary key auto_increment not null,
	nombre varchar(255) not null,
	apellidos varchar(255) not null,
    email varchar(55) not null
);

create table if not exists matrícula(
    cursos int not null,
    alumnos int not null,
    primary key(cursos, alumnos),
    foreign key(cursos) references cursos(idCurso),
    foreign key(alumnos) references alumnos(idAlumno)
);

INSERT INTO cursos (duración, inicio) VALUES
(40, '2024-02-01'), -- Curso ID 1
(120, '2024-03-15'), -- Curso ID 2
(60, '2024-04-10');  -- Curso ID 3

INSERT INTO alumnos (nombre, apellidos, email) VALUES
('Laura', 'Méndez Pozo', 'laura.m@email.com'),
('Iker', 'Casillas Rey', 'iker.c@email.com'),
('Sara', 'Carbonero Gil', 'sara.c@email.com'),
('Marcos', 'Polo Ruiz', 'marcos.p@email.com');

INSERT INTO matrícula (cursos, alumnos) VALUES
(1, 1), -- Laura en el curso de 40h
(2, 1), -- Laura en el curso de 120h
(1, 2), -- Iker en el curso de 40h
(3, 3), -- Sara en el curso de 60h
(2, 4), -- Marcos en el curso de 120h
(3, 4); -- Marcos en el curso de 60h