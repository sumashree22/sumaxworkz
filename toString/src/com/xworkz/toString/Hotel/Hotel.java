package com.xworkz.toString.Hotel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Hotel {
    private String name;
    private String location;
    private int starRating; // Star rating from 1 to 5
    private boolean isAvailable;
    private double pricePerNight; // in ₹
    private int roomsAvailable;
    private String amenities;

    @Override
    public String toString() {
        return "Hotel Details:\n" +
                "Name = " + this.name + "\n" +
                "Location = " + this.location + "\n" +
                "Star Rating = " + this.starRating + " stars\n" +
                "Is Available = " + this.isAvailable + "\n" +
                "Price per Night = ₹" + this.pricePerNight + "\n" +
                "Rooms Available = " + this.roomsAvailable + "\n" +
                "Amenities = " + this.amenities;
    }
}
