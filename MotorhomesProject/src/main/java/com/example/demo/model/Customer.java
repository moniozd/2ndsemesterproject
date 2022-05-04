package com.example.demo.model;

import lombok.Data;

@Data
public class Customer extends IDs {
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
}
