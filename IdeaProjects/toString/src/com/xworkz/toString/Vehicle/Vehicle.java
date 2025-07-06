package com.xworkz.toString.Vehicle;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Vehicle {
    private String make;
    private String model;
    private int year;
    private double price;
    private String fuelType;
    private int mileage; // in km/l
    private boolean isElectric;

    @Override
    public String toString() {
        return "Vehicle Details:\n" +
                "Make = " + this.make + "\n" +
                "Model = " + this.model + "\n" +
                "Year = " + this.year + "\n" +
                "Price = ₹" + this.price + "\n" +
                "Fuel Type = " + this.fuelType + "\n" +
                "Mileage = " + this.mileage + " km/l\n" +
                "Is Electric = " + this.isElectric;
    }
}

