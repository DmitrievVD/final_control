CREATE TABLE animal(
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       name_class VARCHAR(20)
);

INSERT INTO animal (name_class)
VALUES ("вьючные"), ("домашние");

CREATE TABLE pack(
                     id INT AUTO_INCREMENT PRIMARY KEY,
                     type_pack VARCHAR(20),
                     animal_id INT,
                     FOREIGN KEY (animal_id) REFERENCES animal (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO pack (type_pack, animal_id)
VALUES ('Лошади', 1), ('Ослы', 1), ('Верблюды', 1);

CREATE TABLE pet(
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    type_pet VARCHAR(20),
                    animal_id INT,
                    FOREIGN KEY (animal_id) REFERENCES animal (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO pet (type_pet, animal_id)
VALUES ("Собаки", 2), ("Кошки", 2), ("Хомяки", 2);

