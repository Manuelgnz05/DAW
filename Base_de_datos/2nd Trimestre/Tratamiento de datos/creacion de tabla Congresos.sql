-- Ejercicio 3: Organización de Congresos Científicos
-- Contexto: Se desea modelar la asistencia a ponencias de un congreso.
-- Enunciado: El congreso tiene varias Salas (Número, capacidad). En cada sala se
-- imparten diversas Ponencias (Código, título, hora_inicio). Una ponencia solo ocurre en
-- una sala. Existen Ponentes (DNI, nombre, biografía) que pueden impartir varias
-- ponencias, y una ponencia puede ser impartida por un equipo de varios ponentes. Por
-- otro lado, los Asistentes (DNI, nombre, email) se inscriben en las ponencias; un asistente
-- puede ir a muchas ponencias y cada ponencia tiene muchos asistentes inscritos.

drop database if exists Congreso;
create database if not exists Congreso;
use Congreso;

create table salas (
    numero int primary key,
    capacidad int
);

create table ponencias (
    codigo varchar(20) primary key,
    titulo varchar(200),
    hora_inicio datetime,
    num_sala int,
    foreign key (num_sala) references salas(numero)
);

create table ponentes (
    dni varchar(20) primary key,
    nombre varchar(100),
    biografia text
);

create table asistentes (
    dni varchar(20) primary key,
    nombre varchar(100),
    email varchar(100)
);

create table imparten (
    dni_ponente varchar(20),
    cod_ponencia varchar(20),
    primary key (dni_ponente, cod_ponencia),
    foreign key (dni_ponente) references ponentes(dni),
    foreign key (cod_ponencia) references ponencias(codigo)
);

create table inscripciones (
    dni_asistente varchar(20),
    cod_ponencia varchar(20),
    primary key (dni_asistente, cod_ponencia),
    foreign key (dni_asistente) references asistentes(dni),
    foreign key (cod_ponencia) references ponencias(codigo)
);