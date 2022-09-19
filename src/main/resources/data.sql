INSERT INTO owners(firstname, lastname, age)
VALUES ('Adam', 'Adamsson', 10),
       ('Berit', 'Beritsson', 20),
       ('Carl', 'Carlsson', 30),
       ('Daniel', 'Danielsson', 40),
       ('Erika', 'Eriksson', 50);

INSERT INTO animals(name, age)
VALUES ('Assy', 1),
       ('Bruno', 2),
       ('Churro', 3),
       ('Dalle', 4),
       ('Ella', 5);

INSERT INTO owners_animals(owner_id_fk, animal_id_fk)
VALUES (1, 5),
       (1, 4),
       (2, 4),
       (3, 3);