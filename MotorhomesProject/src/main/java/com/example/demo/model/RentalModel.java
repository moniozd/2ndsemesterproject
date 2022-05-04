package com.example.demo.model;

import java.time.LocalDate;

import lombok.Data;

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

}