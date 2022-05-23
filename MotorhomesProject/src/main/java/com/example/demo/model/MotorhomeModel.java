
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
    private long id;
    private String name;
    private int kilometers;
    private int numberOfBeds;
    private int price;
    private boolean serviceNeeded;
    private boolean cleaningNeeded;

/*    String str = String.valueOf(serviceNeeded);
    String str2 = String.valueOf(cleaningNeeded);

    private String translate(boolean b) {
        if (serviceNeeded) {
            str = "yes";
        }
        if (cleaningNeeded) {
            str2 = "yes";
        }
        else {
            str = "No";
            str2 = "No";
        }
        return translate(b);
    }*/


}


/*    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "motorhomeId", referencedColumnName = "id")
    private List<BookingModel> bookingModelList;*/
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