package com.example.demo.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import lombok.Data;

@Data
public class Accessory extends IDs {
    private double price;
    private String name;

    public double getRentalPriceByDays(int days) {
        return (price * days);
    }

    public double getRentalPriceByDays(LocalDate startDate, LocalDate endDate) {
        return getRentalPriceByDays((int) ChronoUnit.DAYS.between(startDate, endDate));
    }
}