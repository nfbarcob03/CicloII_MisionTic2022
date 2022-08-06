use taller_4;

drop table Estudiante;
create table Estudiante(
IdLector integer AUTO_INCREMENT not null,
CI varchar(20) not null,
Nombre varchar(100) not null,
Direccion varchar(100),
Programa_curricular enum ('Ingenieria de Sistemas', 'Economia', 'Fisica', 'Ingenieria Industrial'),
Edad int not null default 99,
primary key (IdLector));

insert into Estudiante(CI, Nombre, Direccion, Programa_curricular, Edad)
values ('1111252', 'Andres caicedo', 'av rosales #10', 1, 23),
('855622', 'Marleni penagos', 'cra 30 #50-80', 2, 22),
('9545454', 'Santiago Otalvaro', 'cra 52 #34-20', 3, 27),
('87459495', 'Manuela Garcia', 'cav 5ta #30', 4, 25);

insert into Estudiante(CI, Nombre, Programa_curricular)
values ('98975992111', 'Andres sosa', 1),
('95941321', 'Doris penagos',  2),
('111112222', 'Santiago Suarez', 3),
('87459495', 'Manuela sans', 4);