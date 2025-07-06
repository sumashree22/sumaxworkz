package com.xworkz.toString.Apartment;

public class ApartmentRunner {
    public static void main(String[] args) {
        Apartment apartment = new Apartment();

        apartment.setName("Skyline View");
        apartment.setLocation("New York City, NY");
        apartment.setFloorNumber(15);
        apartment.setPrice(350000.00);
        apartment.setNumberOfRooms(3);
        apartment.setHasBalcony(true);

        System.out.println(apartment.toString());
    }
}

