package com.example.demo.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "accessories")
public class AccessoryModel {

    @Id
    private int id;
    private double price;
    private String name;
    private int amount;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "accessoriesId")
    private List<BookingModel> bookingModelList;


    public double getRentalPriceByDays(int days) {
        return (price * days);
    }

    public double getRentalPriceByDays(LocalDate startDate, LocalDate endDate) {
        return getRentalPriceByDays((int) ChronoUnit.DAYS.between(startDate, endDate));
    }
}
