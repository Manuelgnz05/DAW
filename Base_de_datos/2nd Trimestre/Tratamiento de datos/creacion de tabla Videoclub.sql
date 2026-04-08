-- Ejercicio 1: Sistema de Gestión de Videoclub
-- Contexto: Un videoclub quiere digitalizar sus alquileres.
-- Enunciado: Tenemos Socios (DNI, nombre, dirección), Películas (ID, título, género, año)
-- y Ejemplares físicos de esas películas. Un socio puede alquilar varios ejemplares a la
-- vez, y un ejemplar puede haber sido alquilado por muchos socios a lo largo del tiempo
-- (queremos guardar la fecha de inicio y fin del alquiler). Además, cada película pertenece a
-- una Productora (CIF, nombre, país), pero una productora puede haber realizado muchas
-- películas.

drop database if exists Videoclub;
create database if not exists Videoclub;
use Videoclub;

create table productoras (
    cif varchar(20) primary key,
    nombre varchar(100) not null,
    pais varchar(50)
);

create table peliculas (
    id_pelicula int primary key,
    titulo varchar(150) not null,
    genero varchar(50),
    anio int,
    cif_productora varchar(20),
    foreign key (cif_productora) references productoras(cif)
);

create table ejemplares (
    id_ejemplar int primary key,
    id_pelicula int,
    foreign key (id_pelicula) references peliculas(id_pelicula)
);

create table socios (
    dni varchar(20) primary key,
    nombre varchar(100) not null,
    direccion varchar(200)
);

create table alquileres (
    dni_socio varchar(20),
    id_ejemplar int,
    fecha_inicio date,
    fecha_fin date,
    primary key (dni_socio, id_ejemplar, fecha_inicio),
    foreign key (dni_socio) references socios(dni),
    foreign key (id_ejemplar) references ejemplares(id_ejemplar)
);