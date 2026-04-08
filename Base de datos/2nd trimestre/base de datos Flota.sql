-- 6: Gestión de una Flota de Transporte

-- Contexto:
-- Una empresa de logística necesita catalogar sus diferentes tipos de vehículos.

-- Enunciado: Tenemos una entidad genérica llamada Vehículos (Matrícula, marca, modelo). Los vehículos se dividen en dos tipos:
-- Camiones y Furgonetas. De los camiones queremos saber su "capacidad de carga (toneladas)" y de las furgonetas su "volumen de carga(m³)". 

-- Relaciones: Todos los vehículos son conducidos por Conductores (DNI, nombre). Un conductor puede conducir muchos vehículos y un vehículo puede ser 
-- conducido por varios conductores (queremos registrar la "fecha de asignación"). Además, cada vehículo tiene un Seguro (Número de póliza, compañía) asociado; 
-- un vehículo solo tiene un seguro activo, pero una compañía puede asegurar muchos vehículos.    Reto: Implementar la herencia (Vehículo -> Camión/Furgoneta), 
-- una relación N:N (Conductor-Vehículo) y una relación 1:N (Seguro-Vehículo).

-- Herencia en SQL: No existe una palabra clave "INHERITS" estándar. Se suele representar haciendo que la clave primaria de la tabla hija sea también una clave 
-- foránea que apunta a la tabla padre.

-- Integridad: Si un vehículo es un camión, tendrá registros en Vehiculos y en Camiones. Si es una furgoneta, los tendrá en Vehiculos y Furgonetas.

-- Relaciones con el Padre: la relación N:N con los conductores se hace con la tabla Vehiculos, porque tanto los camiones como las furgonetas son, al fin y al cabo, vehículos.

drop database if exists Flota;
create database if not exists Flota;
use Flota;

create table if not exists Vehículos(
idVehiculos int primary key auto_increment not null,
Matrícula varchar(7) not null,
Marca varchar(30),
Modelo varchar(30)
);

create table if not exists Camiones(
idCamion int primary key auto_increment not null,
Capacidad_de_carga int not null
);

