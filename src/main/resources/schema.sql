drop table if exists owners;
drop table if exists animals;

CREATE TABLE addresses (
    address_id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    street VARCHAR(255),
    street_num INTEGER,
    postal_code INTEGER,
    city VARCHAR(255)

);

create table owners(
    owner_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    age INTEGER,
    address_id_fk BIGINT,

    FOREIGN KEY (address_id_fk) REFERENCES addresses(address_id)
);

create table animals(
    animal_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    age VARCHAR(255)
);

CREATE TABLE owners_animals (
    owner_id_fk BIGINT NOT NULL ,
    animal_id_fk BIGINT NOT NULL,

    FOREIGN KEY (animal_id_fk) REFERENCES animals(animal_id),
    FOREIGN KEY (owner_id_fk) REFERENCES owners(owner_id)
);