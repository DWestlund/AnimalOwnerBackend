drop table if exists owners;
drop table if exists animals;

create table owners(
    owner_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    age INTEGER
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