package com.conference.event.service;

import com.conference.event.dto.ConferenceEventDto;

public interface ConferenceEventService {
    boolean validateAndSaveEvent(ConferenceEventDto eventDto);
    boolean updateEventDateById(int eventId, String updatedDate);
    boolean deleteEventById(int eventId);
}
