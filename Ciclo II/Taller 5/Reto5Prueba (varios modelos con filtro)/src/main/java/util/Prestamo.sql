drop table if exists Prestamo;
create table Prestamo (
IdPrestamo integer auto_increment not null primary key,
IdLector int not null,
IdLibro int not null,
FechaPrestamo date not null,
FechaDevolucion date,
Devuelto boolean not null default 0,
foreign key (IdLector) References Estudiante (IdLector),
foreign key (IdLibro) References Libro (IdLibro));

insert into prestamo (IdLector, IdLibro, FechaPrestamo, FechaDevolucion, Devuelto) values
(1,1, '2022-01-01', '2022-02-01', 0),
(1,2, '2019-10-01', '2019-12-01', 1),
(4,2, '2020-03-06', '2020-04-06', true),
(6,6, '2020-04-23', '2020-05-23', false),
(8,7, '2022-04-23', '2022-05-23', false),
(8,7, '2022-04-23', '2022-05-23', false),
(8,5, '2021-04-23', '2021-05-23', true);

insert into prestamo (IdLector, IdLibro, FechaPrestamo, FechaDevolucion, Devuelto) values
(1,7, '2022-01-01', '2022-02-01', 0),
(2,6, '2022-01-01', '2022-04-01', 0),
(3,5, '2022-01-01', '2022-02-01', 0);

insert into prestamo (IdLector, IdLibro, FechaPrestamo, FechaDevolucion, Devuelto) values
(5,7, '2022-01-01', '2022-02-01', 0),
(6,6, '2022-01-01', '2022-04-01', 0),
(5,5, '2022-01-01', '2022-02-01', 0);

