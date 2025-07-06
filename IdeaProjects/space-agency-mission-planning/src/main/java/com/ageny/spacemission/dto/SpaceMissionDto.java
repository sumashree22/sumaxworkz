package com.ageny.spacemission.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpaceMissionDto {
    private String missionName;
    private String launchDate;
    private String destination;
    private String missionType;
    private double payloadMassKg;
}
