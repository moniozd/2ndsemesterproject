USE heroku_3dcaafb1b01f2cd;









DELIMITER $$
DROP PROCEDURE IF EXISTS addBooking $$
CREATE PROCEDURE addBooking(motorhomeId int, customerId int,
                            accessoriesId int, startDate VARCHAR(200), endDate VARCHAR(200))
BEGIN
    INSERT INTO heroku_3dcaafb1b01f2cd.bookings(motorhome_id, customer_id,  accessories_id, start_date, end_date)
    VALUES (motorhome_id, customer_id, accessories_id, start_date, end_date);
END $$
DELIMITER ;


ALTER TABLE bookings
    ADD FOREIGN KEY (accessories_id) REFERENCES accessories (id);

ALTER TABLE bookings
    ADD FOREIGN KEY (motorhome_id) REFERENCES motorhomes (id);


ALTER TABLE bookings
    ADD FOREIGN KEY (accessories_id) REFERENCES accessories (id);

ALTER TABLE bookings
    ADD FOREIGN KEY (customer_id) REFERENCES customers (id);

INSERT INTO bookings (customer_id, motorhome_id, accessories_id, start_date, end_date)
VALUES ('61', '1', '1', '2022-05-27', '2022-06-15');

INSERT INTO bookings (customer_id, motorhome_id, accessories_id, start_date, end_date)
VALUES ('71', '21', '31', '2022-07-27', '2022-07-30');

INSERT INTO bookings (customer_id, motorhome_id, accessories_id, start_date, end_date)
VALUES ('71', '51', '41', '2022-08-27', '2022-09-30');

INSERT INTO bookings (motorhome_id, customer_id, accessories_id, start_date, end_date)
VALUES ('51', '91', '41', '2022-09-27', '2022-09-30');


SELECT *
FROM bookings;

SELECT bookings.id, CONCAT(c.id,'-', c.firstName),CONCAT(m.id,'-',m.name) ,CONCAT(a.id, '-', a.name) , start_date, end_date
FROM bookings
         LEFT JOIN accessories a on a.id = bookings.accessories_id
         LEFT JOIN customers c on c.id = bookings.customer_id
         LEFT JOIN motorhomes m on m.id = bookings.motorhome_id;

SELECT start_date
FROM bookings;


SET FOREIGN_KEY_CHECKS = 1;