package com.xworkz.toString.Smartphone;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Smartphone {
    private String brand;
    private String model;
    private double screenSize;
    private int batteryCapacity;
    private int ramSize;
    private int storageCapacity;
    private boolean is5GEnabled;
    private double price;

    @Override
    public String toString() {
        return "Smartphone Details:\n" +
                "Brand = " + this.brand + "\n" +
                "Model = " + this.model + "\n" +
                "Screen Size = " + this.screenSize + " inches\n" +
                "Battery Capacity = " + this.batteryCapacity + " mAh\n" +
                "RAM Size = " + this.ramSize + " GB\n" +
                "Storage Capacity = " + this.storageCapacity + " GB\n" +
                "Is 5G Enabled = " + this.is5GEnabled + "\n" +
                "Price = ₹" + this.price;
    }
}
