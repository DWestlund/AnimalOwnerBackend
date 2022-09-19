INSERT INTO owners(firstname, lastname, age, address_id_fk)
VALUES ('Adam', 'Adamsson', 10, null),
       ('Berit', 'Beritsson', 20, null),
       ('Carl', 'Carlsson', 30, null),
       ('Daniel', 'Danielsson', 40, null),
       ('Erika', 'Eriksson', 50, null);

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

INSERT INTO addresses(street, street_num, postal_code, city)
VALUES ('Salamandervagen', 30, 80638, 'Gävle'),
       ('Storgatan', 12, 83143, 'Östersund'),
       ('Vattugatan', 10, 86544, 'Örebro'),
       ('Kungsgatan', 207, 86633, 'Stockholm'),
       ('Arenavägen', 13, 84112, 'Göteborg');