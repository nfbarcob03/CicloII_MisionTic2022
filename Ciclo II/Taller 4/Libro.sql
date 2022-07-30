use taller_4;

drop table Libro;
truncate table libro;
create table  Libro (
IdLibro integer auto_increment not null primary key,
Titulo varchar(100) not null,
Editorial varchar(100) not null default 'NA',
Area varchar(100) null );

insert into Libro (Titulo, Editorial, Area) values
('El coronel no tiene quien le escriba', 'Colombia magica', 'Realismo magico'),
('Cien años de soledad', 'Colombia diversa', 'Realismo magico');

insert into Libro (Titulo, Area) values
('Harry potter y la piedra filosofal', 'Fantasia'),
('Harry potter y la la camara secreta', 'Fantasia');

insert into Libro (Titulo, Editorial) values
('Harry potter y el La orden del fenix', 'qqqqqqq'),
('Harry potter y el principe mestizo', 'qqqqqqq');

insert into Libro values (7, 'Los juegos del hambre 1', 'oooooo', 'Drama');

delete from libro where idLibro in (1,2,6,7);