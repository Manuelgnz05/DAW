-- Ejercicio 4: Gestión de Proyectos de Construcción
-- Contexto: Una constructora necesita controlar sus obras y recursos.
-- Enunciado: La empresa realiza Proyectos (ID, nombre, presupuesto). En cada proyecto
-- trabajan muchos Empleados (DNI, nombre, cargo) y un empleado puede estar asignado
-- a varios proyectos (guardando las horas semanales que dedica a cada uno). Cada
-- proyecto se lleva a cabo en una Ubicación geográfica (ID, ciudad, provincia), aunque en
-- una ubicación puede haber varios proyectos activos. Para cada proyecto se utilizan
-- Maquinarias (Matrícula, modelo); una máquina puede usarse en varios proyectos y un
-- proyecto requiere de varias máquinas.

DROP DATABASE IF EXISTS GestionConstructora;
CREATE DATABASE IF NOT EXISTS GestionConstructora;
USE GestionConstructora;

CREATE TABLE Ubicaciones (
    ID_Ubicacion INT AUTO_INCREMENT PRIMARY KEY,
    Ciudad VARCHAR(100) NOT NULL,
    Provincia VARCHAR(100) NOT NULL
);

CREATE TABLE Empleados (
	ID_Empleado INT PRIMARY KEY AUTO_INCREMENT,
    DNI VARCHAR(9) NOT NULL,
    Nombre VARCHAR(150) NOT NULL,
    Cargo VARCHAR(100)
);

CREATE TABLE Maquinarias (
	ID_Maquinaria INT PRIMARY KEY AUTO_INCREMENT,
    Matricula VARCHAR(20) NOT NULL,
    Modelo VARCHAR(100) NOT NULL
);

CREATE TABLE Proyectos (
    ID_Proyecto INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(200) NOT NULL,
    Presupuesto DECIMAL(15, 2),
    ID_Ubicacion INT,
    FOREIGN KEY (ID_Ubicacion) REFERENCES Ubicaciones(ID_Ubicacion)
);

CREATE TABLE Proyecto_Empleado (
    ID_Proyecto INT NOT NULL,
    ID_Empleado INT NOT NULL,
    Horas_Semanales INT,
    PRIMARY KEY (ID_Proyecto, ID_Empleado),
    FOREIGN KEY (ID_Proyecto) REFERENCES Proyectos(ID_Proyecto),
    FOREIGN KEY (ID_Empleado) REFERENCES Empleados(ID_Empleado)
);

CREATE TABLE Proyecto_Maquinaria (
    ID_Proyecto INT NOT NULL,
    ID_Maquinaria INT NOT NULL,
    PRIMARY KEY (ID_Proyecto, ID_Maquinaria),
    FOREIGN KEY (ID_Proyecto) REFERENCES Proyectos(ID_Proyecto),
    FOREIGN KEY (ID_Maquinaria) REFERENCES Maquinarias(ID_Maquinaria)
);