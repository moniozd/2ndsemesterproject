package com.example.demo.model;

import lombok.Data;

@Data
public class Motorhome extends IDs {
    private MotorhomeModel motorhomeModel;
    private int kilometers;
    private boolean serviceNeeded;
    private boolean cleaningNeeded;
}