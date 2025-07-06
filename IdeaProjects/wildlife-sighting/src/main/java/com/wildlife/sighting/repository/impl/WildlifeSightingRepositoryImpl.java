package com.wildlife.sighting.repository.impl;

import com.wildlife.sighting.dto.WildlifeSightingDto;
import com.wildlife.sighting.repository.WildlifeSightingRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WildlifeSightingRepositoryImpl implements WildlifeSightingRepository {

    @Override
    public boolean saveSighting(WildlifeSightingDto sightingDto) {
        boolean isSaved = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration", "root", "Mallu@2K3");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO wildlife_sightings (species_name, location, sighting_date, observer_name, number_of_animals) VALUES (?, ?, ?, ?, ?)");
            preparedStatement.setString(1, sightingDto.getSpeciesName());
            preparedStatement.setString(2, sightingDto.getLocation());
            preparedStatement.setString(3, sightingDto.getSightingDate());
            preparedStatement.setString(4, sightingDto.getObserverName());
            preparedStatement.setInt(5, sightingDto.getNumberOfAnimals());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(sightingDto);
        return isSaved;
    }

    @Override
    public boolean updateSightingDateById(int sightingId, String updatedDate) {
        boolean isUpdated = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration", "root", "Mallu@2K3");
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE wildlife_sightings SET sighting_date = ? WHERE sighting_id = ?");
            preparedStatement.setString(1, updatedDate);
            preparedStatement.setInt(2, sightingId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean deleteSightingById(int sightingId) {
        boolean isDeleted = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration", "root", "Mallu@2K3");
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM wildlife_sightings WHERE sighting_id = ?");
            preparedStatement.setInt(1, sightingId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isDeleted;
    }
}