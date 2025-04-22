package com.xworkz.toString.Event;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Event {
    private String eventName;
    private String date;
    private String location;
    private int attendees;
    private String[] sponsors;
    private double ticketPrice;

    @Override
    public String toString() {
        return "Event Details:\n" +
                "Event Name = " + this.eventName + "\n" +
                "Date = " + this.date + "\n" +
                "Location = " + this.location + "\n" +
                "Attendees = " + this.attendees + "\n" +
                "Sponsors = " + String.join(", ", this.sponsors) + "\n" +
                "Ticket Price = ₹" + this.ticketPrice;
    }
}

