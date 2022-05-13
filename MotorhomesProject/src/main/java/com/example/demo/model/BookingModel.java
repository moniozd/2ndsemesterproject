
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;


import javax.persistence.*;

@Data
@Table(name = "bookings")
@Entity
public class BookingModel {

    @Id
    private long id;
    private long motorhomeId;
    private long customerId;
    private long accessoriesId;
    private String startDate;
    private String endDate;



//     public BookingModel(){}
/*
    public BookingModel(int id, int customerId, int motorhomeId, int accessoriesId, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.customerId = customerId;
        this.motorhomeId = motorhomeId;
        this.accessoriesId = accessoriesId;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public BookingModel(int id, int customerId, int motorhomeId, int accessoriesId, int price, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.customerId = customerId;
        this.motorhomeId = motorhomeId;
        this.accessoriesId = accessoriesId;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getMotorhomeId() {
        return motorhomeId;
    }

    public void setMotorhomeId(int motorhomeId) {
        this.motorhomeId = motorhomeId;
    }

    public int getAccessoriesId() {
        return accessoriesId;
    }

    public void setAccessoriesId(int accessoriesId) {
        this.accessoriesId = accessoriesId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }*/
}
