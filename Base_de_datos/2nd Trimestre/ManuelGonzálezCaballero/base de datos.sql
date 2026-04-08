drop database if exists CursosOnline;
create database if not exists CursosOnline;
use CursosOnline;

drop table if exists estudiantes;
create table estudiantes (
	id_estudiante int auto_increment primary key not null,
    dni varchar(9) not null,
    nombre_completo varchar(50) not null,
    email varchar(40) not null,
    fecha_registro date
);

drop table if exists profesores;
create table profesores (
	id_profesor int auto_increment primary key not null,
    dni varchar(9) not null,
    nombre_completo varchar(50) not null,
    especialidad varchar(20),
    email varchar(40) not null
);

drop table if exists cursos;
create table cursos (
    codigo_curso int primary key not null,
    nombre varchar(30) not null,
    descripcion varchar(40),
    precio float not null, 
    fecha_inicio date not null,
    fecha_fin date,
    id_profesor int not null,
    foreign key (id_profesor) references profesores(id_profesor)
);

drop table if exists matriculas;
create table matriculas (
    curso int not null,
    estudiante int not null,
    fecha_matricula date not null,
    nota_final int,
    primary key(curso, estudiante),
    foreign key (curso) references cursos(codigo_curso),
    foreign key (estudiante) references estudiantes(id_estudiante)
);