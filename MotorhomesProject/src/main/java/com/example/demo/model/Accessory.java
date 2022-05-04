package com.example.demo.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Accessory extends IDs{
    private double price;
    private String name;

    public Accessory(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getRentalPriceByDays(int days) {return (price*days);}
    public double getRentalPriceByDays(LocalDate startDate, LocalDate endDate) {
        return getRentalPriceByDays((int) ChronoUnit.DAYS.between(startDate,endDate));
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
