package com.example.demo.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class AccessoryModel {

    @Id
    private int id;
    private double price;
    private String name;
    private int amount;


    public double getRentalPriceByDays(int days) {
        return (price * days);
    }

    public double getRentalPriceByDays(LocalDate startDate, LocalDate endDate) {
        return getRentalPriceByDays((int) ChronoUnit.DAYS.between(startDate, endDate));
    }
}
