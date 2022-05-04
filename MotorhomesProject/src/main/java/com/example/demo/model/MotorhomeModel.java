package com.example.demo.model;

import lombok.Data;

@Data
public class MotorhomeModel extends IdModel {
    private MotorhomeTypeModel motorhomeTypeModel;
    private int kilometers;
    private boolean serviceNeeded;
    private boolean cleaningNeeded;
}