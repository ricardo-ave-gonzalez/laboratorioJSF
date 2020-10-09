drop database if exists laboratorioJSF;
create database laboratorioJSF;
use laboratorioJSF;

create table alumnos(
    id int auto_increment primary key,
    nombre varchar(20),
    apellido varchar(20),
    correo varchar(40),
    password varchar(30),
    numeroAlumno int
);