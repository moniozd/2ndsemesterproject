create table accessories
(
    id     bigint auto_increment
        primary key,
    name   varchar(300) null,
    price  int          not null,
    amount int          not null,
    constraint accessory_id_uindex
        unique (id)
);

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

create table bookings
(
    id            int auto_increment
        primary key,
    motorhome_id   bigint          not null,
    customer_id    bigint          not null,
    accessories_id bigint          not null,
    start_date     varchar(200) null,
    end_date       varchar(200) null,
    constraint bookings_ibfk_1
        foreign key (motorhome_id) references motorhomes (id),
    constraint bookings_ibfk_2
        foreign key (customer_id) references customers (id),
    constraint bookings_ibfk_3
        foreign key (accessories_id) references accessories (id)
);

create index accessoriesId
    on bookings (accessories_id);

create index customer_id
    on bookings (customer_id);

create index motorhome_id
    on bookings (motorhome_id);

create
    definer = bf485eb2e7ee33@`%` procedure addBooking(IN motorhome_id bigint, IN customer_id bigint, IN accessories_id bigint,
                                                      IN start_date varchar(200), IN end_date varchar(200))
BEGIN
    INSERT INTO heroku_3dcaafb1b01f2cd.bookings(motorhome_id, customer_id,  accessories_id, start_date, end_date)
    VALUES (motorhome_id, customer_id, accessories_id, start_date, end_date);
END;
