USE heroku_3dcaafb1b01f2cd;

ALTER TABLE rental
    ADD FOREIGN KEY (accessories_id) REFERENCES accessories(id);

ALTER TABLE rental
    ADD FOREIGN KEY (motorhome_id) REFERENCES motorhomes(id);

ALTER TABLE rental
    ADD FOREIGN KEY (customer_id) REFERENCES customers(id);