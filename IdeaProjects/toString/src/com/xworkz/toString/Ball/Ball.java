package com.xworkz.toString.Ball;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Ball {
    private String brand;
    private String material; // e.g., Leather, Rubber, Synthetic
    private double diameter; // in centimeters
    private double weight; // in grams
    private String type; // e.g., Football, Basketball, Cricket Ball
    private String color;

    @Override
    public String toString() {
        return "Ball Details:\n" +
                "Brand = " + this.brand + "\n" +
                "Material = " + this.material + "\n" +
                "Diameter = " + this.diameter + " cm\n" +
                "Weight = " + this.weight + " grams\n" +
                "Type = " + this.type + "\n" +
                "Color = " + this.color;
    }
}

