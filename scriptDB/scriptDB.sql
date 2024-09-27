CREATE DATABASE usuarios;

USE usuarios;

CREATE TABLE usuario(
dni varchar(10),
nombre varchar(30),
apellido varchar(30),
codPostal varchar(10)
);

INSERT INTO usuario VALUES ("72230853Z","Paco","Gonzalez","48460");