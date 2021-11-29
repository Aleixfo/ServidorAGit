create database productes;
use productes;

create table usuarios (
id int auto_increment primary key,
username varchar(20) not null,
password varchar(20) not null);

create table productos (
id int auto_increment primary key,
nom varchar(45) not null,
descripcio varchar(50),
preu float null);

insert into productos (nom, descripcio, preu) values
("Coca Cola", "Beguda Gaseosa", 2.1),
("Fanta Naranja", "Beguda gaseosa de taronga", 1.8),
("Fanta Limon", "Beguda gaseosa de llimona", 1.5);

insert into usuarios (username, password) values ("admin", "admin");

select * from productos;
select * from usuarios;

SELECT * FROM usuarios where username= "admin";