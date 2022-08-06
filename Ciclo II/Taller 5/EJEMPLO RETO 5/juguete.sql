create schema tiendaJuguetes;
use tiendaJuguetes;
create table juguete(
id_juguete int auto_increment not null primary key,
nombre_juguete varchar(255),
precio_juguete int 
);

insert into juguete(nombre_juguete,precio_juguete)
values("Pistola de agua", 4500);
insert into juguete(nombre_juguete,precio_juguete)
values("Carro de policía", 5000);
insert into juguete(nombre_juguete,precio_juguete)
values("Muñeca Barbie", 40000);

