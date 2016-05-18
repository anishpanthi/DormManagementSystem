delete from user;

insert into user (id, firstName, lastName, username, password, email, userRole) values (1,'Anish','Panthi','admin','admin','anish.panthi@gmail.com','ROLE_ADMIN');
insert into user (id, firstName, lastName, username, password, email, userRole) values (2,'Bijay','Khatri','staff','staff','bijay.khatri@gmail.com','ROLE_STAFF');
insert into user (id, firstName, lastName, username, password, email, userRole) values (3,'Patiram','Yadav','student','student','patiram.yadav@gmail.com','ROLE_STUDENT');
insert into user (id, firstName, lastName, username, password, email, userRole) values (4,'Umesh','Paudyal','student','student','umesh.paudyal@gmail.com','ROLE_STUDENT');

--INSERT INTO `checkinform` (`id`,`available`,`description`,`itemName`,`status`,`student_id`) VALUES (24,1,'Wood or Metal','Bed Frame','Good',1);
INSERT INTO `checkinform` (`id`,`available`,`description`,`itemName`,`status`,`student_id`) VALUES (25,1,'Floor Mattress','Mattress','Good',1);
INSERT INTO `checkinform` (`id`,`available`,`description`,`itemName`,`status`,`student_id`) VALUES (26,1,'Computer or Study Desk','Desk','Good',1);
INSERT INTO `checkinform` (`id`,`available`,`description`,`itemName`,`status`,`student_id`) VALUES (27,1,'Sitting Chair','Chair','Good',1);
INSERT INTO `checkinform` (`id`,`available`,`description`,`itemName`,`status`,`student_id`) VALUES (28,1,'Where Books can be kept.','Bookshelf','Good',2);
INSERT INTO `checkinform` (`id`,`available`,`description`,`itemName`,`status`,`student_id`) VALUES (29,1,'For hand and face washing.','Dresser','Good',2);

UPDATE user_seq SET next_val = 5;