package com.agriculture.cropyield.service;


import com.agriculture.cropyield.dto.AgriculturalCropYieldDto;

public interface AgriculturalCropYieldService {
    boolean validateAndSaveCropYield(AgriculturalCropYieldDto cropYieldDto);
    boolean updateHarvestDateById(int yieldId, String updatedDate);
    boolean deleteYieldById(int yieldId);
}