package com.example.demo.model;

public class MotorhomeModel extends IDs{
    private String name;
    private int numberOfBeds;
    private double price;

    public MotorhomeModel(String name, int numberOfBeds, double price) {
        this.name = name;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}

