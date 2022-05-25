package com.example.demo.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;


// @Data handles all boilerplate code like getters, setters etc.
@Data
// @Entity is for classes that represent a table in the database
@Entity
@Table(name = "accessories")
public class AccessoryModel {

    // @Id is for the primary key for the table
    @Id
    private long id;
    private double price;
    private String name;
    private int amount;

/*
    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "accessoriesId", referencedColumnName = "id")
    private List<BookingModel> bookingModelList;
*/

/*
    @OneToMany(mappedBy = "accessoryModel", cascade=CascadeType.ALL, orphanRemoval = true)
    private Set<BookingModel> bookingModelSet = new HashSet<BookingModel>();
*/


/*    public double getRentalPriceByDays(int days) {
        return (price * days);
    }

    public double getRentalPriceByDays(LocalDate startDate, LocalDate endDate) {
        return getRentalPriceByDays((int) ChronoUnit.DAYS.between(startDate, endDate));
    }*/
}
