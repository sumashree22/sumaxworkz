package com.xworkz.toString.Flight;

public class FlightRunner {
    public static void main(String[] args) {
        Flight flight = new Flight();

        flight.setFlightNumber("AI202");
        flight.setAirline("Air India");
        flight.setDepartureAirport("Chhatrapati Shivaji Maharaj International Airport");
        flight.setArrivalAirport("Indira Gandhi International Airport");
        flight.setDepartureTime("10:00 AM");
        flight.setArrivalTime("12:30 PM");
        flight.setTicketPrice(7500);
        flight.setOnTime(true);

        System.out.println(flight.toString());
    }
}

