package com.xworkz.toString.Perfume;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Perfume {
    private String brand;
    private String fragrance;
    private double volume; // in ml
    private double price; // in USD
    private String gender; // Male, Female, Unisex
    private String launchDate;

    @Override
    public String toString() {
        return "Perfume Details:\n" +
                "Brand = " + this.brand + "\n" +
                "Fragrance = " + this.fragrance + "\n" +
                "Volume = " + this.volume + " ml\n" +
                "Price = $" + this.price + "\n" +
                "Gender = " + this.gender + "\n" +
                "Launch Date = " + this.launchDate;
    }
}
