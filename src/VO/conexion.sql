create database veterinaria_ABC;
use veterinaria_ABC;

create table persona(
documento VARCHAR(50) PRIMARY KEY NOT NULL UNIQUE,
    nombre VARCHAR(50) NOT NULL,
    telefono VARCHAR(50) NOT NULL
);

CREATE TABLE mascotas (
	idMascota INT PRIMARY KEY NOT NULL UNIQUE AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    propietario VARCHAR(50),
    raza VARCHAR(50) NOT NULL,
    sexo VARCHAR(50) NOT NULL
);
