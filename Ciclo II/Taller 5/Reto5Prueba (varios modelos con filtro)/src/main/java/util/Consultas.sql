use taller_4;
select * from prestamo;

select * from estudiante;

select nombre from autor order by nombre desc;
-- Ver el nombre d elos libro
-- del primero de enero del 2020 ordenado por el nombre del estudiante
select l.* from prestamo p
join libro l on p.IdLibro = l.IdLibro
join Estudiante e on e.IdLector = p.IdLector
where fechaprestamo > '2020-01-01' order by e.nombre asc;