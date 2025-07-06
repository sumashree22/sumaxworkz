package com.agriculture.cropyield;

import com.agriculture.cropyield.dto.AgriculturalCropYieldDto;
import com.agriculture.cropyield.service.AgriculturalCropYieldService;
import com.agriculture.cropyield.service.impl.AgriculturalCropYieldServiceImpl;

public class AgriculturalCropYieldRunner {

    static AgriculturalCropYieldService agriculturalCropYieldService;

    public static void main(String[] args) {
        AgriculturalCropYieldDto dto = new AgriculturalCropYieldDto();
        dto.setFarmId("FARM-101");
        dto.setCropType("Wheat");
        dto.setHarvestDate("2025-06-20");
        dto.setRegion("Punjab");
        dto.setYieldTons(12.5);

        agriculturalCropYieldService = new AgriculturalCropYieldServiceImpl();
        agriculturalCropYieldService.validateAndSaveCropYield(dto);
        System.out.println("Crop Yield Saved...");

        agriculturalCropYieldService.updateHarvestDateById(1, "2025-07-01");
        System.out.println("Harvest Date Updated...");

        agriculturalCropYieldService.deleteYieldById(1);
        System.out.println("Crop Yield Deleted...");
    }
}
