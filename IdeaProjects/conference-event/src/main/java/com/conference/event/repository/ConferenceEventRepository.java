package com.conference.event.repository;

import com.conference.event.dto.ConferenceEventDto;

public interface ConferenceEventRepository {
    boolean saveEvent(ConferenceEventDto eventDto);
    boolean updateEventDateById(int eventId, String updatedDate);
    boolean deleteEventById(int eventId);
}
