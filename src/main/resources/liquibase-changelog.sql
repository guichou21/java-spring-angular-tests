--liquibase formatted sql

--changeset sandBox:1
create table place (id bigint NOT NULL, coordinates character varying(255), name character varying(255) NOT NULL, short_name character varying(255) NOT NULL);
alter table place add constraint place_pkey PRIMARY KEY (id);
alter table place add constraint uk_b8nbstg9t15unnmk6uod41f47 UNIQUE (name);
alter table place add constraint uk_m8waq1hbv8rib8q60s5j4cli1 UNIQUE (short_name);
