package com.example.demo.model;

import lombok.Data;

@Data
public class CustomerModel extends IdModel {
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
}
