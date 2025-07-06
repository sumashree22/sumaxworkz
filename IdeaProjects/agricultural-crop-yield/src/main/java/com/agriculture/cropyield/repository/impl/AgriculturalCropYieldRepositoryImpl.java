package com.agriculture.cropyield.repository.impl;

import com.agriculture.cropyield.dto.AgriculturalCropYieldDto;
import com.agriculture.cropyield.repository.AgriculturalCropYieldRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AgriculturalCropYieldRepositoryImpl implements AgriculturalCropYieldRepository {

    @Override
    public boolean saveCropYield(AgriculturalCropYieldDto cropYieldDto) {
        boolean isSaved = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration", "root", "sumashree@22");
            PreparedStatement ps = connection.prepareStatement("INSERT INTO crop_yields (farm_id, crop_type, harvest_date, region, yield_tons) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, cropYieldDto.getFarmId());
            ps.setString(2, cropYieldDto.getCropType());
            ps.setString(3, cropYieldDto.getHarvestDate());
            ps.setString(4, cropYieldDto.getRegion());
            ps.setDouble(5, cropYieldDto.getYieldTons());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(cropYieldDto);
        return isSaved;
    }

    @Override
    public boolean updateHarvestDateById(int yieldId, String updatedDate) {
        boolean isUpdated = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration", "root", "sumashree@22");
            PreparedStatement ps = connection.prepareStatement("UPDATE crop_yields SET harvest_date = ? WHERE yield_id = ?");
            ps.setString(1, updatedDate);
            ps.setInt(2, yieldId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean deleteYieldById(int yieldId) {
        boolean isDeleted = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration", "root", "sumashree@22");
            PreparedStatement ps = connection.prepareStatement("DELETE FROM crop_yields WHERE yield_id = ?");
            ps.setInt(1, yieldId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isDeleted;
    }
}