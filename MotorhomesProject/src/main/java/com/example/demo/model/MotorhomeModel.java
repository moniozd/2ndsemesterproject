
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data

@Table(name = "motorhomes")
public class MotorhomeModel {
    @Id
    private int id;
    private String name;
    private int kilometers;
    private int numberOfBeds;
    private boolean serviceNeeded;
    private boolean cleaningNeeded;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "motorhomeId")
    private BookingModel bookingModel;

/*    @OneToMany(mappedBy = "motorhomeModel", cascade=CascadeType.ALL, orphanRemoval = true)
    private Set<BookingModel> bookingModelSet = new HashSet<BookingModel>();*/
}

//public MotorhomeModel(){}

//    public MotorhomeModel(int id, String name, int kilometers, int numberOfBeds, boolean serviceNeeded, boolean cleaningNeeded) {
//        this.id = id;
//        this.name = name;
//        this.kilometers = kilometers;
//        this.numberOfBeds = numberOfBeds;
//        this.serviceNeeded = serviceNeeded;
//        this.cleaningNeeded = cleaningNeeded;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getKilometers() {
//        return kilometers;
//    }
//
//    public void setKilometers(int kilometers) {
//        this.kilometers = kilometers;
//    }
//
//    public int getNumberOfBeds() {
//        return numberOfBeds;
//    }
//
//    public void setNumberOfBeds(int numberOfBeds) {
//        this.numberOfBeds = numberOfBeds;
//    }
//
//    public boolean isServiceNeeded() {
//        return serviceNeeded;
//    }
//
//    public void setServiceNeeded(boolean serviceNeeded) {
//        this.serviceNeeded = serviceNeeded;
//    }
//
//    public boolean isCleaningNeeded() {
//        return cleaningNeeded;
//    }
//
//    public void setCleaningNeeded(boolean cleaningNeeded) {
//        this.cleaningNeeded = cleaningNeeded;
//    }
//}