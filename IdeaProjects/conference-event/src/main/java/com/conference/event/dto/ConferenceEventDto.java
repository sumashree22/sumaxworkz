package com.conference.event.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConferenceEventDto {
    private String eventName;
    private String speaker;
    private String eventDate;
    private String location;
    private double durationHours;
}