-- // Author: Team

create table accessories
(
    id     bigint(11) auto_increment
        primary key,
    name   varchar(300) null,
    price  int          not null,
    amount int          not null,
    constraint accessory_id_uindex
        unique (id)
);

create table bookings
(
    id          bigint auto_increment
        primary key,
    motorhome   varchar(255) not null,
    customer    varchar(255) not null,
    accessories varchar(255) not null,
    start_date  varchar(200) null,
    end_date    varchar(200) null
);

create index accessoriesId
    on bookings (accessories);

create index customer_id
    on bookings (customer);

create index motorhome_id
    on bookings (motorhome);

create table customers
(
    id          bigint auto_increment
        primary key,
    firstName   varchar(300) not null,
    lastName    varchar(300) not null,
    email       varchar(300) not null,
    phoneNumber int          not null
);

create table motorhomes
(
    id             bigint auto_increment
        primary key,
    name           varchar(300) not null,
    numberOfBeds   int          not null,
    price          int          not null,
    kilometers     int          not null,
    serviceNeeded  tinyint(1)   not null,
    cleaningNeeded tinyint(1)   not null,
    constraint motorhomes_id_uindex
        unique (id)
);

create
    definer = bf485eb2e7ee33@`%` procedure addBooking(IN motorhome varchar(255), IN customer varchar(255),
                                                      IN accessories varchar(255), IN start_date varchar(200),
                                                      IN end_date varchar(200))
BEGIN
    INSERT INTO heroku_3dcaafb1b01f2cd.bookings(motorhome, customer,  accessories, start_date, end_date)
    VALUES (motorhome, customer, accessories, start_date, end_date);
END;
