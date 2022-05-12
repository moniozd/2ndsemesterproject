USE heroku_3dcaafb1b01f2cd;
DELIMITER $$
DROP PROCEDURE IF EXISTS addBooking $$
CREATE PROCEDURE addBooking(motorhomeId int, customerId int,
                            accessoriesId int, startDate VARCHAR(200), endDate VARCHAR(200))
BEGIN
    INSERT INTO heroku_3dcaafb1b01f2cd.bookings(motorhomeId, customerId,  accessoriesId, startDate, endDate)
    VALUES (motorhomeId, customerId, accessoriesId, startDate, endDate);
END $$
DELIMITER ;


ALTER TABLE bookings
    ADD FOREIGN KEY (accessoriesId) REFERENCES accessories (id);

ALTER TABLE bookings
    ADD FOREIGN KEY (motorhomeId) REFERENCES motorhomes (id);


ALTER TABLE bookings
    ADD FOREIGN KEY (accessoriesId) REFERENCES accessories (id);

ALTER TABLE bookings
    ADD FOREIGN KEY (customerId) REFERENCES customers (id);

INSERT INTO bookings (customerId, motorhomeId, accessoriesId, startDate, endDate)
VALUES ('61', '1', '1', '2022-05-27', '2022-06-15');

INSERT INTO bookings (customerId, motorhomeId, accessoriesId, startDate, endDate)
VALUES ('71', '21', '31', '2022-07-27', '2022-07-30');

INSERT INTO bookings (customerId, motorhomeId, accessoriesId, startDate, endDate)
VALUES ('71', '51', '41', '2022-08-27', '2022-09-30');

INSERT INTO bookings (motorhomeId, customerId, accessoriesId, startDate, endDate)
VALUES ('51', '91', '41', '2022-09-27', '2022-09-30');


SELECT *
FROM bookings;

SELECT bookings.id, CONCAT(c.id,'-', c.firstName),CONCAT(m.id,'-',m.name) ,CONCAT(a.id, '-', a.name) , startDate, endDate
FROM bookings
         LEFT JOIN accessories a on a.id = bookings.accessoriesId
         LEFT JOIN customers c on c.id = bookings.customerId
         LEFT JOIN motorhomes m on m.id = bookings.motorhomeId;

SELECT startDate
FROM bookings;


SET FOREIGN_KEY_CHECKS = 1;