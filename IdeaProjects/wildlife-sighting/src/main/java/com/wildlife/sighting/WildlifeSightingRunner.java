package com.wildlife.sighting;

import com.wildlife.sighting.dto.WildlifeSightingDto;
import com.wildlife.sighting.service.WildlifeSightingService;
import com.wildlife.sighting.service.impl.WildlifeSightingServiceImpl;

public class WildlifeSightingRunner {

    static WildlifeSightingService wildlifeSightingService;

    public static void main(String[] args) {
        WildlifeSightingDto sightingDto = new WildlifeSightingDto();
        sightingDto.setSpeciesName("Elephant");
        sightingDto.setLocation("Bandipur National Park");
        sightingDto.setSightingDate("2025-06-18");
        sightingDto.setObserverName("Dr. Arjun Rao");
        sightingDto.setNumberOfAnimals(3);

        wildlifeSightingService = new WildlifeSightingServiceImpl();
        wildlifeSightingService.validateAndSaveSighting(sightingDto);
        System.out.println("Sighting Saved...");

        wildlifeSightingService.updateSightingDateById(1, "2025-07-01");
        System.out.println("Sighting Date Updated...");

        wildlifeSightingService.deleteSightingById(1);
        System.out.println("Sighting Deleted...");
    }
}
