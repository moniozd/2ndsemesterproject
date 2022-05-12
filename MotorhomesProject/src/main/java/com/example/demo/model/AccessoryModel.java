package com.example.demo.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "accessoriesId")
    private BookingModel bookingModel;

/*
    @OneToMany(mappedBy = "accessoryModel", cascade=CascadeType.ALL, orphanRemoval = true)
    private Set<BookingModel> bookingModelSet = new HashSet<BookingModel>();
*/


    public double getRentalPriceByDays(int days) {
        return (price * days);
    }

    public double getRentalPriceByDays(LocalDate startDate, LocalDate endDate) {
        return getRentalPriceByDays((int) ChronoUnit.DAYS.between(startDate, endDate));
    }
}
