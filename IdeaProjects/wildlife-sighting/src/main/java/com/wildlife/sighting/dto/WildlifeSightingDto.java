package com.wildlife.sighting.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WildlifeSightingDto {
    private String speciesName;
    private String location;
    private String sightingDate;
    private String observerName;
    private int numberOfAnimals;
}
