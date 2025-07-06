package com.xworkz.toString.Hotel;

public class HotelRunner {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        hotel.setName("The Grand Palace");
        hotel.setLocation("Paris, France");
        hotel.setStarRating(5);
        hotel.setAvailable(true);
        hotel.setPricePerNight(25000.00);
        hotel.setRoomsAvailable(50);
        hotel.setAmenities("Free Wi-Fi, Pool, Gym, Spa");

        System.out.println(hotel.toString());
    }
}

