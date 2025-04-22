package com.xworkz.toString.Event;

public class EventRunner {
    public static void main(String[] args) {
        Event event = new Event();

        event.setEventName("Tech Expo 2025");
        event.setDate("15th May 2025");
        event.setLocation("Mumbai, India");
        event.setAttendees(5000);
        event.setSponsors(new String[]{"Google", "Microsoft", "Amazon"});
        event.setTicketPrice(999.99);

        System.out.println(event.toString());
    }
}

