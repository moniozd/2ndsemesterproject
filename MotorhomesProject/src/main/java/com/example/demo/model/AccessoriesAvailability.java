package com.example.demo.model;

import lombok.Data;

@Data
public class AccessoriesAvailability extends IDs {
    private Accessory accessory;
    private int amount;
}