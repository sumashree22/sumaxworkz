package com.xworkz.toString.Apartment;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Apartment {
    private String name;
    private String location;
    private int floorNumber;
    private double price; // in USD
    private int numberOfRooms;
    private boolean hasBalcony;

    @Override
    public String toString() {
        return "Apartment Details:\n" +
                "Name = " + this.name + "\n" +
                "Location = " + this.location + "\n" +
                "Floor Number = " + this.floorNumber + "\n" +
                "Price = $" + this.price + "\n" +
                "Number of Rooms = " + this.numberOfRooms + "\n" +
                "Has Balcony = " + this.hasBalcony;
    }
}
