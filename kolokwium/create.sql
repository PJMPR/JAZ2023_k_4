create table contact (id integer generated by default as identity (start with 1), email varchar(255), phone_number varchar(255), person_id integer, primary key (id));
create table person (id integer generated by default as identity (start with 1), first_name varchar(255), last_name varchar(255), primary key (id));
alter table contact add constraint FK81ihijcn1kdfwffke0c0sjqeb foreign key (person_id) references person;

