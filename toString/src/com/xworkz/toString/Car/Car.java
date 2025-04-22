package com.xworkz.toString.Car;



import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private String fuelType;
    private boolean isElectric;
    private double mileage;

    // Display method
    @Override
    public String toString(){
        return "Car Details:\n" +
                "Brand = " + this.brand + "\n" +
                "Model = " + this.model + "\n" +
                "Year = " + this.year + "\n" +
                "Price = $" + this.price + "k\n" +
                "Fuel Type = " + this.fuelType + "\n" +
                "Is Electric = " + this.isElectric + "\n" +
                "Mileage = " + this.mileage + " km/l";
    }
}
