-- 4. Tienda con categorías
-- Una tienda online quiere guardar productos y categorías.
-- • Cada producto pertenece a una única categoría.
-- • De las categorías se guarda: nombre y descripción.
-- • De los productos: nombre, precio, stock y fecha de alta.
-- Debes identificar la clave foránea.

drop database if exists TiendaOnline;
create database if not exists TiendaOnline;
use TiendaOnline;

create table if not exists Categorias(
	idCategoria int primary key,
	Nombre varchar(255),
    Descripción varchar(255)
);

create table if not exists Productos(
	idProducto int primary key,
    Categoria int not null,
	Nombre varchar(255) not null,
    Precio float not null,
    Stock int not null,
    Fecha_alta date,
    foreign key(Categoria) references Categorias(idCategoria)
);