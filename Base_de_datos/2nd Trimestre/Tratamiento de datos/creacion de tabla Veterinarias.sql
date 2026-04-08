-- Ejercicio 2: Red de Clínicas Veterinarias
-- Contexto: Una empresa gestiona varias clínicas en diferentes ciudades.
-- Enunciado: Cada Clínica (ID, dirección, teléfono) tiene varios Veterinarios (Colegiado,
-- nombre, especialidad) trabajando en ella, pero un veterinario solo trabaja en una clínica.
-- Los veterinarios atienden a Mascotas (Chip, nombre, especie). Una mascota puede ser
-- atendida por diferentes veterinarios en distintas fechas, y un veterinario atiende a muchas
-- mascotas. Además, cada mascota tiene un único Dueño (DNI, nombre), pero un dueño
-- puede tener varias mascotas.

drop database if exists Veterinario;
create database if not exists Veterinario;
use Veterinario;

create table clinicas (
    id_clinica int primary key,
    direccion varchar(200),
    telefono varchar(20)
);

create table veterinarios (
    n_colegiado varchar(20) primary key,
    nombre varchar(100),
    especialidad varchar(100),
    id_clinica int,
    foreign key (id_clinica) references clinicas(id_clinica)
);

create table duenos (
	idDueno int primary key not null auto_increment,
    dni varchar(9) not null,
    nombre varchar(100)
);

create table mascotas (
    chip int primary key,
    nombre varchar(50),
    especie varchar(50),
    dni_dueno varchar(20),
    foreign key (dni_dueno) references duenos(dni)
);

create table visitas (
    n_colegiado varchar(20),
    chip_mascota varchar(20),
    fecha datetime,
    diagnostico text,
    primary key (n_colegiado, chip_mascota, fecha),
    foreign key (n_colegiado) references veterinarios(n_colegiado),
    foreign key (chip_mascota) references mascotas(chip)
);