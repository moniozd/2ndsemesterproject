package com.example.demo.model;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Entity
public class AccessoryRentalModel extends IdModel {
    private RentalModel rental;
    public AccessoryModel accessory;
    private int amountOfAccessories;

    public AccessoryRentalModel(RentalModel rental, AccessoryModel accessory, int amountOfAccessories) {
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
