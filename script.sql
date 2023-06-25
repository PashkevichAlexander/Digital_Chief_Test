drop
database Chief_db;
create
database Chief_db;

use
Chief_db;

create table city
(
    id         bigint PRIMARY KEY AUTO_INCREMENT,
    `name`     varchar(255),
    population bigint,
    is_capital boolean,
    square     bigint
);

create table attractions
(
    id      bigint PRIMARY KEY AUTO_INCREMENT,
    `name`  varchar(255),
    price   bigint,
    age     bigint,
    city_id bigint,
    FOREIGN KEY (city_id) REFERENCES city (id)
);

create table restaurants
(
    id      bigint PRIMARY KEY AUTO_INCREMENT,
    `name`  varchar(255),
    age     bigint,
    city_id bigint,
    FOREIGN KEY (city_id) REFERENCES city (id)
);



INSERT INTO city(`name`, population, is_capital, square)
VALUES ('Minsk', 1000000, true, 350),
       ('Brest', 150, false, 140);

INSERT INTO attractions(`name`, price, age, city_id)
VALUES ('attractions1', 100, 100, 1),
       ('attractions2', 200, 100, 1),
       ('attractions3', 100, 100, 2),
       ('attractions4', 150, 100, 2);

INSERT INTO restaurants(`name`, age, city_id)
VALUES ('restaurants1', 100, 1),
       ('restaurants2', 100, 1),
       ('restaurants3', 100, 2),
       ('restaurants4', 100, 2);
