USE heroku_3dcaafb1b01f2cd;

INSERT INTO accessories (name, price, amount)
VALUES ('None', 0, 0),
       ('Bikerack', 250, 25),
       ('Chair', 50, 50),
       ('Linen', 25, 120),
       ('Child Seat', 75, 35),
       ('Table', 200, 20);

INSERT INTO customers (firstName, lastName, email, phoneNumber)
VALUES ('Spongebob', 'Squarepants', 'sponge@bob.com', 23512212),
       ('Jack', 'Sparrow', 'jack@sparrow.com', 52112341),
       ('Anders', 'Strøm', 'anders@strøm.com', 23522231),
       ('Monika', 'Ozdoba', 'monika@ozdoba.com', 29832123),
       ('Dua', 'Lipa', 'dua@lipa.com', 12311242),
       ('Obi-Wan', 'Kenobi', 'hello@there.com', 25122235);

INSERT INTO motorhomes (name, numberOfBeds, price, kilometers, serviceNeeded, cleaningNeeded)
VALUES ('HYMER B-CLASS MasterLine T', 6, 1500, 0, false, true),
       ('HYMER B-CLASS ModernComfort T', 3, 1250, 0, false, true),
       ('HYMER Exesis-i', 2, 900, 0, false, true),
       ('HYMER B-CLASS ModernComfort I', 5, 1600, 0, true, false),
       ('HYMER ML-T', 2, 800, 0, false, true),
       ('HYMER CamperVans Fiat', 2, 750, 0, false, true),
       ('HYMER Exisis-t', 3, 800, 0, false, true),
       ('HYMER Free S', 2, 855, 0, false, false);


INSERT INTO bookings (motorhome, customer, accessories, start_date, end_date)
VALUES ('HYMER B-CLASS MasterLine T', 'Monika Ozdoba', 'Bikerack', 2022-05-26, 2022-06-01),
       ('HYMER CamperVans Fiat', 'Jack Sparrow', 'Chair', 2022-05-31, 2022-06-05),
       ('HYMER Free S', 'Dua Lipa', 'Table', 2022-05-27, 2022-05-30);