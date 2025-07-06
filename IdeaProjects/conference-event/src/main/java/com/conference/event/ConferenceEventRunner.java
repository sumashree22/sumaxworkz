package com.conference.event;

import com.conference.event.dto.ConferenceEventDto;
import com.conference.event.service.ConferenceEventService;
import com.conference.event.service.impl.ConferenceEventServiceImpl;

public class ConferenceEventRunner {

    static ConferenceEventService conferenceEventService;

    public static void main(String[] args) {
        ConferenceEventDto dto = new ConferenceEventDto();
        dto.setEventName("AI Summit 2025");
        dto.setSpeaker("Dr. Alan Smith");
        dto.setEventDate("2025-07-10");
        dto.setLocation("Bangalore");
        dto.setDurationHours(3.5);

        conferenceEventService = new ConferenceEventServiceImpl();
        conferenceEventService.validateAndSaveEvent(dto);
        System.out.println("Event Saved...");

        conferenceEventService.updateEventDateById(1, "2025-08-01");
        System.out.println("Event Date Updated...");

        conferenceEventService.deleteEventById(1);
        System.out.println("Event Deleted...");
    }
}
