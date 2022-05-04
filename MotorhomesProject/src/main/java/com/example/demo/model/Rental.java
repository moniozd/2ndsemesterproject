package com.example.demo.model;

import java.time.LocalDate;

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

    public Rental(Customer customer, Motorhome motorhome, int pickUpDistance, int deliveryDistance, int kilometersStart, int kilometersEnd, boolean fuel, LocalDate startDate, LocalDate endDate) {
        this.customer = customer;
        this.motorhome = motorhome;
        this.pickUpDistance = pickUpDistance;
        this.deliveryDistance = deliveryDistance;
        this.kilometersStart = kilometersStart;
        this.kilometersEnd = kilometersEnd;
        this.fuel = fuel;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Motorhome getMotorhome() {
        return motorhome;
    }

    public void setMotorhome(Motorhome motorhome) {
        this.motorhome = motorhome;
    }

    public int getPickUpDistance() {
        return pickUpDistance;
    }

    public void setPickUpDistance(int pickUpDistance) {
        this.pickUpDistance = pickUpDistance;
    }

    public int getDeliveryDistance() {
        return deliveryDistance;
    }

    public void setDeliveryDistance(int deliveryDistance) {
        this.deliveryDistance = deliveryDistance;
    }

    public int getKilometersStart() {
        return kilometersStart;
    }

    public void setKilometersStart(int kilometersStart) {
        this.kilometersStart = kilometersStart;
    }

    public int getKilometersEnd() {
        return kilometersEnd;
    }

    public void setKilometersEnd(int kilometersEnd) {
        this.kilometersEnd = kilometersEnd;
    }

    public boolean isFuel() {
        return fuel;
    }

    public void setFuel(boolean fuel) {
        this.fuel = fuel;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}


