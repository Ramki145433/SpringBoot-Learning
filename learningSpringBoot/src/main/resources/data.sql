create table person
(
   id integer not null,
   name varchar(255) not null,
   location varchar(255),
   dateOfBirth timestamp,
   primary key (id)
);

INSERT INTO PERSON (ID, NAME, LOCATION, DATEOFBIRTH) VALUES (100011, 'Ram', 'Vizianagaram', CURRENT_DATE);
INSERT INTO PERSON (ID, NAME, LOCATION, DATEOFBIRTH) VALUES (10006, 'Naveen', 'Vizag', CURRENT_DATE);
INSERT INTO PERSON (ID, NAME, LOCATION, DATEOFBIRTH) VALUES (10007, 'Raj', 'Anantapur', CURRENT_DATE);
INSERT INTO PERSON (ID, NAME, LOCATION, DATEOFBIRTH) VALUES (10008, 'Raj', 'Guntur', CURRENT_DATE);