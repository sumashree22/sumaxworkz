package com.agriculture.cropyield.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgriculturalCropYieldDto {
    private String farmId;
    private String cropType;
    private String harvestDate;
    private String region;
    private double yieldTons;
}
