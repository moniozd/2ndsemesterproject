package com.example.demo.model;

public class Motorhome extends IDs{
    private MotorhomeModel motorhomeModel;
    private int kilometers;
    private boolean serviceNeeded;
    private boolean cleaningNeeded;

    public Motorhome(MotorhomeModel motorhomeModel, int kilometers, boolean serviceNeeded, boolean cleaningNeeded) {
        this.motorhomeModel = motorhomeModel;
        this.kilometers = kilometers;
        this.serviceNeeded = serviceNeeded;
        this.cleaningNeeded = cleaningNeeded;
    }


    public MotorhomeModel getMotorhomeModel() {
        return motorhomeModel;
    }

    public void setMotorhomeModel(MotorhomeModel motorhomeModel) {
        this.motorhomeModel = motorhomeModel;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
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
