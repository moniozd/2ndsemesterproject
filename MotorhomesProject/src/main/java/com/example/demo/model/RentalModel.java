package com.example.demo.model;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

import lombok.Data;

import javax.persistence.Entity;

@Data
public class RentalModel extends IdModel {
    private CustomerModel customer;
    private MotorhomeModel motorhome;
    private int pickUpDistance;
    private int deliveryDistance;
    private int kilometersStart;
    private int kilometersEnd;
    private boolean fuel;
    private LocalDate startDate;
    private LocalDate endDate;

//    //calculate fees for cancellation
//    public double calculateFeesForCancellation() {
//        double total = 0.0;
//
//    //days in total
//        int daysInTotal=(int) ChronoUnit.DAYS.between(startDate, endDate);
//
//    //prices
//return;
//    }
//}
}
