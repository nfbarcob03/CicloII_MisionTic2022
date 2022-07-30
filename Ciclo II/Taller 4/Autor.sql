use taller_4;
create table Autor (
IdAutor integer AUTO_INCREMENT not null primary key,
Nombre varchar(100) not null,
Nacionalidad varchar(100));

insert into Autor (Nombre, Nacionalidad) 
values ('Gabriel Garcia Marquez', 'Colombiano'),
('J. K. Rowling','Estado unidense');

insert into Autor (Nombre) 
values ('Nelson Barco'),
('Andres Petrono');

insert into Autor values(5, 'Andres Cepeda', 'Colombiano');

insert into Autor (Nombre, Nacionalidad) values
('Rocio Dulcan', 'Mexicano'),
('Ruben bladez', 'Cubano');
