-- 9. Proyectos y empleados
-- Una empresa quiere registrar qué empleados trabajan en qué proyectos.
-- • De los empleados: nombre, apellidos, puesto.
-- • De los proyectos: nombre, fecha de inicio, presupuesto.
-- Un empleado puede participar en varios proyectos y un proyecto puede tener varios
-- empleados.
-- La tabla intermedia debe incluir también el rol del empleado en ese proyecto.

drop database if exists Trabajos;
create database if not exists Trabajos;
use Trabajos;

create table if not exists empleados(
	idEmpleado int primary key not null auto_increment,
    nombre varchar(255) not null,
    apellidos varchar(255) not null,
    puesto varchar(55) not null
);

create table if not exists proyectos(
	idProyectos int primary key auto_increment not null,
	nombre varchar(255) not null,
    inicio date not null,
    presupuesto int not null
);

create table if not exists reparto(
    empleados int not null,
    proyectos int not null,
    rol varchar(55) not null,
    primary key(empleados, proyectos),
    foreign key(empleados) references empleados(idEmpleado),
    foreign key(proyectos) references proyectos(idProyectos)
);

INSERT INTO empleados (nombre, apellidos, puesto) VALUES
('Laura', 'Sánchez Cano', 'Arquitecta Cloud'),
('Javier', 'Exposito Ruiz', 'Analista de Ciberseguridad'),
('Carmen', 'Milla Ortega', 'Diseñadora UI/UX'),
('Pedro', 'Gómez Farías', 'QA Engineer');

INSERT INTO proyectos (nombre, inicio, presupuesto) VALUES
('Migración Azure 2026', '2026-01-15', 85000),
('Portal de Transparencia', '2026-02-01', 32000),
('Auditoría de Sistemas', '2026-03-10', 15000);

INSERT INTO reparto (empleados, proyectos, rol) VALUES
(1, 1, 'Technical Lead'),      -- Laura en Migración Azure
(4, 1, 'Tester de Carga'),     -- Pedro en Migración Azure
(3, 2, 'Lead Designer'),       -- Carmen en Portal Transparencia
(1, 2, 'Consultora Externa'),  -- Laura también ayuda en el Portal
(2, 3, 'Auditor Principal'),   -- Javier en Auditoría
(4, 3, 'Documentación');       -- Pedro en Auditoría