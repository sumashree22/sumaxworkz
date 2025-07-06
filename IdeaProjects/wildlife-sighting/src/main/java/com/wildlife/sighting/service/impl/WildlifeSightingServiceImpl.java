package com.wildlife.sighting.service.impl;

import com.wildlife.sighting.dto.WildlifeSightingDto;
import com.wildlife.sighting.repository.WildlifeSightingRepository;
import com.wildlife.sighting.repository.impl.WildlifeSightingRepositoryImpl;
import com.wildlife.sighting.service.WildlifeSightingService;

public class WildlifeSightingServiceImpl implements WildlifeSightingService {

    WildlifeSightingRepository wildlifeSightingRepository;

    public WildlifeSightingServiceImpl() {
        wildlifeSightingRepository = new WildlifeSightingRepositoryImpl();
    }

    @Override
    public boolean validateAndSaveSighting(WildlifeSightingDto sightingDto) {
        boolean isValidatedAndSaved = false;
        boolean isSpeciesName = false;
        boolean isLocation = false;
        boolean isSightingDate = false;
        boolean isObserverName = false;
        boolean isNumberOfAnimals = false;

        if (sightingDto.getSpeciesName() != null && !sightingDto.getSpeciesName().isEmpty()) {
            isSpeciesName = true;
        }
        if (sightingDto.getLocation() != null && !sightingDto.getLocation().isEmpty()) {
            isLocation = true;
        }
        if (sightingDto.getSightingDate() != null && !sightingDto.getSightingDate().isEmpty()) {
            isSightingDate = true;
        }
        if (sightingDto.getObserverName() != null && !sightingDto.getObserverName().isEmpty()) {
            isObserverName = true;
        }
        if (sightingDto.getNumberOfAnimals() > 0) {
            isNumberOfAnimals = true;
        }

        if (isSpeciesName && isLocation && isSightingDate && isObserverName && isNumberOfAnimals) {
            isValidatedAndSaved = wildlifeSightingRepository.saveSighting(sightingDto);
        }

        return isValidatedAndSaved;
    }

    @Override
    public boolean updateSightingDateById(int sightingId, String updatedDate) {
        boolean isDateUpdated = false;
        if (sightingId > 0 && updatedDate != null && !updatedDate.isEmpty()) {
            isDateUpdated = wildlifeSightingRepository.updateSightingDateById(sightingId, updatedDate);
        }
        return isDateUpdated;
    }

    @Override
    public boolean deleteSightingById(int sightingId) {
        boolean isDeleted = false;
        if (sightingId > 0) {
            isDeleted = wildlifeSightingRepository.deleteSightingById(sightingId);
        }
        return isDeleted;
    }
}

