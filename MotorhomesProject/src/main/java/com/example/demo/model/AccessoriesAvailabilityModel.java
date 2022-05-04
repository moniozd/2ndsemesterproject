package com.example.demo.model;

import lombok.Data;

@Data
public class AccessoriesAvailabilityModel extends IdModel {
    private AccessoryModel accessory;
    private int amount;
}