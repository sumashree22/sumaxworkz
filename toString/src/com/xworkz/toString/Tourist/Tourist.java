package com.xworkz.toString.Tourist;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Tourist {
    private String name;
    private String countryOfOrigin;
    private String destination;
    private int durationOfStay;
    private String[] placesToVisit;
    private double budget;
    private boolean isSoloTraveler;

    @Override
    public String toString() {
        return "Tourist Details:\n" +
                "Name = " + this.name + "\n" +
                "Country of Origin = " + this.countryOfOrigin + "\n" +
                "Destination = " + this.destination + "\n" +
                "Duration of Stay = " + this.durationOfStay + " days\n" +
                "Places to Visit = " + String.join(", ", this.placesToVisit) + "\n" +
                "Budget = ₹" + this.budget + "\n" +
                "Solo Traveler = " + this.isSoloTraveler;
    }
}

