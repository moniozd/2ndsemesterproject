package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class AccessoriesAvailabilityModel extends IdModel {
    private AccessoryModel accessory;
    private int amount;
}