delete from user;

insert into user (id, username, password, userrole) values (1,'admin','admin','ROLE_ADMIN');
insert into user (id, username, password, userrole) values (2,'staff','staff','ROLE_STAFF');
insert into user (id, username, password, userrole) values (3,'student','student','ROLE_STUDENT');

UPDATE user_seq SET next_val = 4;