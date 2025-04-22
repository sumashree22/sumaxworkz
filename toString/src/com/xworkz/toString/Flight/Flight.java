package com.xworkz.toString.Flight;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Flight {
    private String flightNumber;
    private String airline;
    private String departureAirport;
    private String arrivalAirport;
    private String departureTime;
    private String arrivalTime;
    private double ticketPrice;
    private boolean isOnTime;

    @Override
    public String toString() {
        return "Flight Details:\n" +
                "Flight Number = " + this.flightNumber + "\n" +
                "Airline = " + this.airline + "\n" +
                "Departure Airport = " + this.departureAirport + "\n" +
                "Arrival Airport = " + this.arrivalAirport + "\n" +
                "Departure Time = " + this.departureTime + "\n" +
                "Arrival Time = " + this.arrivalTime + "\n" +
                "Ticket Price = ₹" + this.ticketPrice + "\n" +
                "Is On Time = " + this.isOnTime;
    }
}
