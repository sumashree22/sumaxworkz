package com.xworkz.toString.Restaurant;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Restaurant {
    private String name;
    private String cuisineType;
    private int rating; // Rating out of 5
    private boolean isOpen;
    private String location;
    private int seatingCapacity;
    private double averageMealCost; // in ₹

    @Override
    public String toString() {
        return "Restaurant Details:\n" +
                "Name = " + this.name + "\n" +
                "Cuisine Type = " + this.cuisineType + "\n" +
                "Rating = " + this.rating + "/5\n" +
                "Is Open = " + this.isOpen + "\n" +
                "Location = " + this.location + "\n" +
                "Seating Capacity = " + this.seatingCapacity + "\n" +
                "Average Meal Cost = ₹" + this.averageMealCost;
    }
}

