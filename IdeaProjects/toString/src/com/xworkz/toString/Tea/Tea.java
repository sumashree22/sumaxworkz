package com.xworkz.toString.Tea;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Tea {
    private String brand;
    private String type; // e.g., Green, Black, Herbal
    private double weight; // in grams
    private double price; // in USD
    private String origin; // Country of origin
    private boolean isOrganic;

    @Override
    public String toString() {
        return "Tea Details:\n" +
                "Brand = " + this.brand + "\n" +
                "Type = " + this.type + "\n" +
                "Weight = " + this.weight + " grams\n" +
                "Price = $" + this.price + "\n" +
                "Origin = " + this.origin + "\n" +
                "Organic = " + this.isOrganic;
    }
}
