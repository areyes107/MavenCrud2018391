drop database if exists DBProyectoMaven2018391;
create database DBProyectoMaven2018391;
use DBProyectoMaven2018391;

create table Personas(
codigoPersona int not null auto_increment,
nombres varchar(100) not null,
apellidos varchar(100) not null, 
primary key PK_CodigoPersona(codigoPersona)
);

insert into Personas(nombres, apellidos)
	values('Miguel Estuardo','Aquino');
    
    insert into Personas(nombres, apellidos)
	values('Bryan Alexander ','Gomez Chavez');
    
    insert into Personas(nombres, apellidos)
	values('Fernando Javier','Suarez Acevedo');
    
    insert into Personas(nombres, apellidos)
	values('Diego Roberto','Cante Estrada');
    
    insert into Personas(nombres, apellidos)
	values('Kestler Luis Eduardo','Barrios Perez');
    
    select * from Personas;