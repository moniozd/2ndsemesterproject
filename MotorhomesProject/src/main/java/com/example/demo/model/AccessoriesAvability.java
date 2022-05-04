package com.example.demo.model;

public class AccessoriesAvability extends IDs{
    private Accessory accessory;
    private int amount;

    public AccessoriesAvability(Accessory accessory, int amount) {
        this.accessory = accessory;
        this.amount = amount;
    }

    public Accessory getAccessory() {
        return accessory;
    }

    public void setAccessory(Accessory accessory) {
        this.accessory = accessory;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
