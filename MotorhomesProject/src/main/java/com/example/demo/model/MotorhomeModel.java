
package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class MotorhomeModel {
    @Id
    private int id;
    private String name;
    private int kilometers;
    private int numberOfBeds;
    private boolean serviceNeeded;
    private boolean cleaningNeeded;

public MotorhomeModel(){}

    public MotorhomeModel(int id, String name, int kilometers, int numberOfBeds, boolean serviceNeeded, boolean cleaningNeeded) {
        this.id = id;
        this.name = name;
        this.kilometers = kilometers;
        this.numberOfBeds = numberOfBeds;
        this.serviceNeeded = serviceNeeded;
        this.cleaningNeeded = cleaningNeeded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isServiceNeeded() {
        return serviceNeeded;
    }

    public void setServiceNeeded(boolean serviceNeeded) {
        this.serviceNeeded = serviceNeeded;
    }

    public boolean isCleaningNeeded() {
        return cleaningNeeded;
    }

    public void setCleaningNeeded(boolean cleaningNeeded) {
        this.cleaningNeeded = cleaningNeeded;
    }
}