drop table t_carreras if exists;
drop table t_conductores if exists;
create table t_conductores (co_nombre varchar(255) not null, co_modelo varchar(255), co_matricula varchar(255), co_valoracion_media double, co_ocupado TINYINT,  primary key (co_nombre));
create table t_carreras (c_id integer, c_tarjeta_credito varchar(255) not null, c_origen varchar(255), c_destino varchar(255), c_distancia double, c_tiempo_esperado integer, c_tiempo_carrera integer, c_coste_total double, c_propina integer, c_conductor varchar(255), primary key (c_id));
alter table t_carreras add constraint carreras_conductor_fk foreign key (c_conductor) references t_conductores

--
-- 	"drop table t_carreras if exists",
-- 	"drop table t_conductores if exists",
-- 	"create table t_conductores (co_tarjeta_credito varchar(255) not null, co_nombre varchar(255), co_modelo varchar(255), co_matricula varchar(255), co_valoracion_media double, co_ocupado TINYINT,  primary key (co_tarjeta_credito))",
-- 	"create table t_carreras (c_id bigint generated by default as identity, c_tarjeta_credito varchar(255) not null, c_origen varchar(255), c_destino varchar(255), c_distancia double, c_tiempo_esperado integer, c_tiempo_carrera integer, c_coste_total double, c_propina integer, c_conductor varchar(255), primary key (c_id))",
--     "alter table t_carreras add constraint carreras_conductor_fk foreign key (c_conductor) references t_conductores",
-- 	"delete from t_carreras",
-- 	"delete from t_conductores",
-- 	"insert into t_conductores (co_tarjeta_credito, co_nombre, co_modelo, co_matricula, co_valoracion_media, co_ocupado) values ('1111111111111111' , 'Samantha', 'Chevy Malibu', '4ABC123', 0, 0)",
-- 	"insert into t_carreras (c_tarjeta_credito, c_origen, c_destino, c_distancia, c_tiempo_esperado, c_tiempo_carrera, c_coste_total, c_propina, c_conductor) values ('4916119711304546', 'Aeroport Son Sant Joan', 'Magaluf', 7.75, 10, 0, 0, 0, '1111111111111111')"