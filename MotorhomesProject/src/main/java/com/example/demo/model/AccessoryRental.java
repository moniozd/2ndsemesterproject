package com.example.demo.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AccessoryRental extends IDs {
    private Rental rental;
    public Accessory accessory;
    private int amountOfAccessories;

    public AccessoryRental(Rental rental, Accessory accessory, int amountOfAccessories) {
        this.rental = rental;
        this.accessory = accessory;
        this.amountOfAccessories = amountOfAccessories;
    }
    double calculateAmount(){
        LocalDate startDate = rental.getStartDate();
        LocalDate endDate = rental.getEndDate();

        int daysInTotal = (int) ChronoUnit.DAYS.between(startDate,endDate);

        return (daysInTotal * amountOfAccessories) * accessory.getPrice();
    }
}
