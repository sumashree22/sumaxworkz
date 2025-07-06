package com.xworkz.toString.Tourist;

public class TouristRunner {
    public static void main(String[] args) {
        Tourist tourist = new Tourist();

        tourist.setName("John Doe");
        tourist.setCountryOfOrigin("USA");
        tourist.setDestination("Paris, France");
        tourist.setDurationOfStay(7);
        tourist.setPlacesToVisit(new String[]{"Eiffel Tower", "Louvre Museum", "Notre-Dame Cathedral"});
        tourist.setBudget(50000.00);
        tourist.setSoloTraveler(true);

        System.out.println(tourist.toString());
    }
}
