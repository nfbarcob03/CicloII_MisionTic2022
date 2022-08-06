use taller_4;

drop table LibAut;
create table LibAut (
IdAutor int not null,
IdLibro int not null,
foreign key (IdAutor) References Autor (IdAutor),
foreign key (IdLibro) References Libro (IdLibro),
primary key (IdAutor,IdLibro));

insert into LibAut (IdAutor, IdLibro) values
(1,1),(2,2),(2,3),(2,4),(3,5), (1,5),(2,5), (1,6),(2,6),(7,6), (7,4);