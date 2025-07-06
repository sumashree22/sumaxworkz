package com.conference.event.service.impl;

import com.conference.event.dto.ConferenceEventDto;
import com.conference.event.repository.ConferenceEventRepository;
import com.conference.event.repository.impl.ConferenceEventRepositoryImpl;
import com.conference.event.service.ConferenceEventService;

public class ConferenceEventServiceImpl implements ConferenceEventService {
    ConferenceEventRepository conferenceEventRepository;

    public ConferenceEventServiceImpl() {
        conferenceEventRepository = new ConferenceEventRepositoryImpl();
    }

    @Override
    public boolean validateAndSaveEvent(ConferenceEventDto eventDto) {
        boolean isValidatedAndSaved = false;
        boolean isEventName = false;
        boolean isSpeaker = false;
        boolean isEventDate = false;
        boolean isLocation = false;
        boolean isDurationHours = false;

        if (eventDto.getEventName() != null && !eventDto.getEventName().isEmpty()) {
            isEventName = true;
        }
        if (eventDto.getSpeaker() != null && !eventDto.getSpeaker().isEmpty()) {
            isSpeaker = true;
        }
        if (eventDto.getEventDate() != null && !eventDto.getEventDate().isEmpty()) {
            isEventDate = true;
        }
        if (eventDto.getLocation() != null && !eventDto.getLocation().isEmpty()) {
            isLocation = true;
        }
        if (eventDto.getDurationHours() > 0.0) {
            isDurationHours = true;
        }

        if (isEventName && isSpeaker && isEventDate && isLocation && isDurationHours) {
            isValidatedAndSaved = conferenceEventRepository.saveEvent(eventDto);
        }

        return isValidatedAndSaved;
    }

    @Override
    public boolean updateEventDateById(int eventId, String updatedDate) {
        boolean isEventDateUpdated = false;
        if (eventId > 0 && updatedDate != null && !updatedDate.isEmpty()) {
            isEventDateUpdated = conferenceEventRepository.updateEventDateById(eventId, updatedDate);
        }
        return isEventDateUpdated;
    }

    @Override
    public boolean deleteEventById(int eventId) {
        boolean isEventDeleted = false;
        if (eventId > 0) {
            isEventDeleted = conferenceEventRepository.deleteEventById(eventId);
        }
        return isEventDeleted;
    }
}