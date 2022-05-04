package com.example.demo.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Rental extends IDs {
    private Customer customer;
    private Motorhome motorhome;
    private int pickUpDistance;
    private int deliveryDistance;
    private int kilometersStart;
    private int kilometersEnd;
    private boolean fuel;
    private LocalDate startDate;
    private LocalDate endDate;

}