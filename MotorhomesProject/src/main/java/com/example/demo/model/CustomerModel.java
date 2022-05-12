package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class CustomerModel {

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = BookingModel.class)
    @JoinColumn(name = "customerId")
    private List<BookingModel> bookingModelList;

    public CustomerModel(List<BookingModel> bookingModelList){
        this.bookingModelList = bookingModelList;
    }

    public CustomerModel(int id, String firstName, String lastName, String email, int phoneNumber, List<BookingModel> bookingModelList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.bookingModelList = bookingModelList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
