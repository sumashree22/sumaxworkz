package com.agriculture.cropyield.repository;

import com.agriculture.cropyield.dto.AgriculturalCropYieldDto;

public interface AgriculturalCropYieldRepository {
    boolean saveCropYield(AgriculturalCropYieldDto cropYieldDto);
    boolean updateHarvestDateById(int yieldId, String updatedDate);
    boolean deleteYieldById(int yieldId);
}