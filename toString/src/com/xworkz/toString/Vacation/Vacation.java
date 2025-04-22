package com.xworkz.toString.Vacation;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Vacation {
    private String destination;
    private int duration; // in days
    private String[] activities;
    private double budget;
    private boolean isFamilyTrip;
    private String accommodationType;

    @Override
    public String toString() {
        return "Vacation Details:\n" +
                "Destination = " + this.destination + "\n" +
                "Duration = " + this.duration + " days\n" +
                "Activities = " + String.join(", ", this.activities) + "\n" +
                "Budget = ₹" + this.budget + "\n" +
                "Family Trip = " + this.isFamilyTrip + "\n" +
                "Accommodation Type = " + this.accommodationType;
    }
}

