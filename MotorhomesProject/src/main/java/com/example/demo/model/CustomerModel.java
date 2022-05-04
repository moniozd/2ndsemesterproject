package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class CustomerModel extends IdModel {
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
}
