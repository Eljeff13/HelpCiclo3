#Empezamos creando la base de datos
CREATE DATABASE IF NOT exists base_inventarios;

#Seleccionamos la base de datos
USE base_inventarios;

#empezamos a hacer relaciones de la tabla
create table if not exists Producto(
	id_producto int not null,
    nombre varchar(30) not null,
    valor int,
    primary key(id_producto)
    
) engine=innodb;

create table if not exists inventario(
	codigo varchar(20),
    producto varchar(30),
    descripcion varchar(50),
    stock_inicial int not null,
    stock_final int not null,
    total_stock int not null
    
)engine=innodb;



