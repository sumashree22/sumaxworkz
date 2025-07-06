package com.wildlife.sighting.service;

import com.wildlife.sighting.dto.WildlifeSightingDto;

public interface WildlifeSightingService {
    boolean validateAndSaveSighting(WildlifeSightingDto sightingDto);
    boolean updateSightingDateById(int sightingId, String updatedDate);
    boolean deleteSightingById(int sightingId);
}
