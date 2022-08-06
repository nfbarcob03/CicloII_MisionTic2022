use taller_4;
update Estudiante set nombre = 'Pepito Perez' where CI = '1111252';
update Estudiante set edad = 25 where nombre = 'Doris penagos';

-- update prestamo set Devuelto = 1  where IdLEctor = 1 IdLibro = 1; no es el deber ser

update prestamo set Devuelto = 1 
where IdLEctor = (select IdLector from Estudiante where nombre = 'Pepito Perez')
and IdLibro = (select IdLibro from Libro where Titulo = 'El coronel no tiene quien le escriba');

-- delete from prestamo where IdLibro in (1,5,6); no es el deber ser

delete from prestamo where IdLibro in (
select IdLibro from libaut where  idautor = (
select idautor from autor where lower(nombre) like '%garcia%'));

select replace(nombre,'.',' ') as nuevo_nombe from autor;

delete from prestamo;