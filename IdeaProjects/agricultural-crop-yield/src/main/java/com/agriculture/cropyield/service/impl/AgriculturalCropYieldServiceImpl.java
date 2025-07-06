package com.agriculture.cropyield.service.impl;

import com.agriculture.cropyield.dto.AgriculturalCropYieldDto;
import com.agriculture.cropyield.repository.AgriculturalCropYieldRepository;
import com.agriculture.cropyield.repository.impl.AgriculturalCropYieldRepositoryImpl;
import com.agriculture.cropyield.service.AgriculturalCropYieldService;

public class AgriculturalCropYieldServiceImpl implements AgriculturalCropYieldService {

    AgriculturalCropYieldRepository agriculturalCropYieldRepository;

    public AgriculturalCropYieldServiceImpl() {
        agriculturalCropYieldRepository = new AgriculturalCropYieldRepositoryImpl();
    }

    @Override
    public boolean validateAndSaveCropYield(AgriculturalCropYieldDto cropYieldDto) {
        boolean isValidatedAndSaved = false;
        boolean isFarmId = false;
        boolean isCropType = false;
        boolean isHarvestDate = false;
        boolean isRegion = false;
        boolean isYieldTons = false;

        if (cropYieldDto.getFarmId() != null && !cropYieldDto.getFarmId().isEmpty()) {
            isFarmId = true;
        }
        if (cropYieldDto.getCropType() != null && !cropYieldDto.getCropType().isEmpty()) {
            isCropType = true;
        }
        if (cropYieldDto.getHarvestDate() != null && !cropYieldDto.getHarvestDate().isEmpty()) {
            isHarvestDate = true;
        }
        if (cropYieldDto.getRegion() != null && !cropYieldDto.getRegion().isEmpty()) {
            isRegion = true;
        }
        if (cropYieldDto.getYieldTons() > 0.0) {
            isYieldTons = true;
        }

        if (isFarmId && isCropType && isHarvestDate && isRegion && isYieldTons) {
            isValidatedAndSaved = agriculturalCropYieldRepository.saveCropYield(cropYieldDto);
        }

        return isValidatedAndSaved;
    }

    @Override
    public boolean updateHarvestDateById(int yieldId, String updatedDate) {
        boolean isDateUpdated = false;
        if (yieldId > 0 && updatedDate != null && !updatedDate.isEmpty()) {
            isDateUpdated = agriculturalCropYieldRepository.updateHarvestDateById(yieldId, updatedDate);
        }
        return isDateUpdated;
    }

    @Override
    public boolean deleteYieldById(int yieldId) {
        boolean isYieldDeleted = false;
        if (yieldId > 0) {
            isYieldDeleted = agriculturalCropYieldRepository.deleteYieldById(yieldId);
        }
        return isYieldDeleted;
    }
}

