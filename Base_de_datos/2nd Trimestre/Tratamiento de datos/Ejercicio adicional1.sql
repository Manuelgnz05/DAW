-- Fabricación de Componentes Industriales

-- Contexto:
-- Una fábrica de maquinaria pesada necesita controlar el despiece de sus productos.
-- Enunciado:
-- Tenemos Piezas (ID_Pieza, nombre, material). Una pieza puede estar compuesta por varias "sub-piezas" más pequeñas, 
-- y a su vez, una pieza pequeña puede formar parte de varias piezas mayores (ejemplo: un "Tornillo T1" se usa en el "Motor M1" y en el "Chasis C1"). 
-- Debemos guardar cuántas unidades de la sub-pieza se necesitan para la pieza mayor.
   
-- Relaciones adicionales: Cada pieza se guarda en un Almacén (ID_Almacen, nombre, ciudad); un almacén tiene muchas piezas, 
-- pero cada pieza solo se guarda en uno. Además, las piezas son suministradas por Proveedores(CIF, nombre); un proveedor puede suministrar muchas piezas y 
-- una pieza puede ser suministrada por varios proveedores (guardando el precio de compra de cada uno).

-- En este enunciado aparecerá una Relación Reflexiva N:N

drop database if exists componentes_industriales;
create database componentes_industriales;
use componentes_industriales;

drop table if exists Almacenes;
create table Almacenes(
idAlmacen int not null auto_increment,
nombre varchar(50) not null,
ciudad varchar(50)  not null,

primary key(idAlmacen)
);

CREATE TABLE Piezas (
    idPieza INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    material VARCHAR(50),
    idAlmacen INT NOT NULL,
    FOREIGN KEY (idAlmacen) REFERENCES Almacenes(idAlmacen)
);

CREATE TABLE Subpiezas (
    idPieza INT NOT NULL,
    idSubpieza INT NOT NULL,
    cantidad INT NOT NULL,

    PRIMARY KEY (idPieza, idSubpieza),
    FOREIGN KEY (idPieza) REFERENCES Piezas(idPieza),
    FOREIGN KEY (idSubpieza) REFERENCES Piezas(idPieza)
);


drop table if exists Proveedores;
create table Proveedores(
cif varchar(9) not null,
nombre varchar(50) not null,

primary key(cif)
);

drop table if exists Suministros;
create table Suministros(
idPieza int not null,
cif varchar(9) not null,
precio float not null,

primary key(idPieza, cif),
foreign key(idPieza) references Piezas(idPieza),
foreign key(cif) references Proveedores(cif)
);

-- 1. Primero insertamos los almacenes (no tienen dependencias)
INSERT INTO Almacenes (nombre, ciudad) VALUES 
('Almacén Central', 'Madrid'),
('Almacén Este', 'Valencia');

-- 2. Insertamos las piezas. 
-- Fíjate que insertamos tanto piezas "grandes" (Motor, Chasis) como "pequeñas" (Tornillo, Tuerca).
-- Todas van a la misma tabla y les asignamos un almacén (1 o 2).
INSERT INTO Piezas (nombre, material, idAlmacen) VALUES 
('Motor M1', 'Aluminio', 1),       -- Se le asignará el idPieza = 1
('Chasis C1', 'Acero', 1),         -- Se le asignará el idPieza = 2
('Tornillo T1', 'Acero Inox', 2),  -- Se le asignará el idPieza = 3
('Tuerca T1', 'Acero Inox', 2),    -- Se le asignará el idPieza = 4
('Engranaje E1', 'Titanio', 1);    -- Se le asignará el idPieza = 5

-- 3. ¡La magia de la tabla reflexiva! 
-- Aquí definimos qué pieza va dentro de cuál y en qué cantidad.
INSERT INTO Subpiezas (idPieza, idSubpieza, cantidad) VALUES 
(1, 3, 15),  -- El Motor (1) necesita 15 Tornillos (3)
(1, 5, 4),   -- El Motor (1) necesita 4 Engranajes (5)
(2, 3, 50),  -- El Chasis (2) necesita 50 Tornillos (3)
(2, 4, 50);  -- El Chasis (2) necesita 50 Tuercas (4)

-- 4. Insertamos un par de proveedores
INSERT INTO Proveedores (cif, nombre) VALUES 
('A12345678', 'Suministros Industriales SA'),
('B87654321', 'Tornillería Paco SL');

-- 5. Insertamos los suministros (quién nos vende qué y a qué precio)
INSERT INTO Suministros (idPieza, cif, precio) VALUES 
(3, 'A12345678', 0.15), -- Suministros Ind. nos vende el Tornillo (3) a 0.15€
(3, 'B87654321', 0.10), -- Tornillería Paco nos vende el Tornillo (3) a 0.10€ (Más barato!)
(5, 'A12345678', 25.50); -- Suministros Ind. nos vende el Engranaje (5) a 25.50€