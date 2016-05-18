delete from user;

insert into user (id, firstName, lastName, username, password, email, userRole) values (1,'Anish','Panthi','admin','admin','anish.panthi@gmail.com','ROLE_ADMIN');
insert into user (id, firstName, lastName, username, password, email, userRole) values (2,'Bijay','Khatri','staff','staff','bijay.khatri@gmail.com','ROLE_STAFF');
insert into user (id, firstName, lastName, username, password, email, userRole) values (3,'Patiram','Yadav','student','student','patiram.yadav@gmail.com','ROLE_STUDENT');
insert into user (id, firstName, lastName, username, password, email, userRole) values (4,'Umesh','Paudyal','student','student','umesh.paudyal@gmail.com','ROLE_STUDENT');

insert into student values(1,'nepal','a@b.com','Oct 2012','a','b','MSCS','na','abcd','','ROLE_STUDENT','student',null);

UPDATE user_seq SET next_val = 5;