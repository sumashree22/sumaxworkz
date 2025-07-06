package com.xworkz.toString.Gadget;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Gadget {
    private String name;
    private String brand;
    private String category;
    private double price;
    private boolean isWireless;
    private int batteryLife;
    private String color;

    @Override
    public String toString() {
        return "Gadget Details:\n" +
                "Name = " + this.name + "\n" +
                "Brand = " + this.brand + "\n" +
                "Category = " + this.category + "\n" +
                "Price = ₹" + this.price + "\n" +
                "Wireless = " + this.isWireless + "\n" +
                "Battery Life = " + this.batteryLife + " hours\n" +
                "Color = " + this.color;
    }
}

