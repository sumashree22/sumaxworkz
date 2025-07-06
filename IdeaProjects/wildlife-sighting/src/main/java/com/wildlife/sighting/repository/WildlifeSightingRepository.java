package com.wildlife.sighting.repository;

import com.wildlife.sighting.dto.WildlifeSightingDto;

public interface WildlifeSightingRepository {
    boolean saveSighting(WildlifeSightingDto sightingDto);
    boolean updateSightingDateById(int sightingId, String updatedDate);
    boolean deleteSightingById(int sightingId);
}
