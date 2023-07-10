CREATE TABLE cats
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    animal_name VARCHAR(20),
    birthday DATE,
    commands VARCHAR(50),
    pet_id int,
    Foreign KEY (pet_id) REFERENCES pet (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO cats (animal_name, birthday, commands, pet_id)
VALUES ("Мася", "2019-07-01", "ко мне", 1),
       ("Пальма", "2020-01-01", "кс-кс", 1),
       ("Белка", "2022-01-04", "дай лапу", 1);

CREATE TABLE dogs
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    animal_name VARCHAR(20),
    birthday DATE,
    commands VARCHAR(50),
    pet_id int,
    Foreign KEY (pet_id) REFERENCES pet (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO dogs (animal_name, birthday, commands, pet_id)
VALUES ("Громик", "2020-05-01", "лежать", 2),
       ("Рекс", '2021-06-22', "сидеть", 2),
       ("Шарик", '2022-05-01', "ко мне", 2);

CREATE TABLE hamsters
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    animal_name VARCHAR(20),
    birthday DATE,
    commands VARCHAR(50),
    pet_id int,
    Foreign KEY (pet_id) REFERENCES pet (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO hamsters (animal_name, birthday, commands, pet_id)
VALUES ("Боб", "2023-04-12", "кусь", 3),
       ("Тишка", "2023-03-12", "пищать", 3),
       ("Крош", "2023-06-02", "пищать", 3);

CREATE TABLE horses
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    animal_name VARCHAR(20),
    birthday DATE,
    commands VARCHAR(50),
    pack_id int,
    Foreign KEY (pack_id) REFERENCES pack (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO horses (animal_name, birthday, commands, pack_id)
VALUES ("Гром", "2020-01-12", "рысь, шагом", 1),
       ("Закат", "2017-03-12", "тише, шагом, хоп", 1),
       ("Байкал", "2016-07-12", "тише, шагом, хоп", 1),
       ("Молния", "2020-11-10", "рысь, шагом, хоп", 1);

CREATE TABLE donkeys
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    animal_name VARCHAR(20),
    birthday DATE,
    commands VARCHAR(50),
    pack_id int,
    Foreign KEY (pack_id) REFERENCES pack (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO donkeys (animal_name, birthday, commands, pack_id)
VALUES ("Упрямец", "2019-04-10", NULL, 2),
       ("Силач", "2020-03-12", NULL, 2);

CREATE TABLE camels
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    animal_name VARCHAR(20),
    birthday DATE,
    commands VARCHAR(50),
    pack_id int,
    Foreign KEY (pack_id) REFERENCES pack (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO camels (animal_name, birthday, commands, pack_id)
VALUES ("Горбатый", "2022-04-10", "спать", 3),
       ("Джоги", "2019-03-12", "кушать", 3),
       ("Харкун", "2015-07-12", "идти", 3);