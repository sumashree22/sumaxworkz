package com.ageny.spacemission.repository.impl;

import com.ageny.spacemission.dto.SpaceMissionDto;
import com.ageny.spacemission.repository.SpaceMissionRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SpaceMissionRepositoryImpl implements SpaceMissionRepository {
    @Override
    public boolean saveMission(SpaceMissionDto missionDto) {
        boolean isMissionSaved = false;

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration","root", "Mallu@2K3");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into mission_details (mission_name, launch_date, destination, mission_type, payload_mass_kg) values(?,?,?,?,?)");
            preparedStatement.setString(1,missionDto.getMissionName());
            preparedStatement.setString(2, missionDto.getLaunchDate());
            preparedStatement.setString(3, missionDto.getDestination());
            preparedStatement.setString(4, missionDto.getMissionType());
            preparedStatement.setDouble(5,missionDto.getPayloadMassKg());
            preparedStatement.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println(missionDto);
        return isMissionSaved;
    }

    @Override
    public boolean updatedLaunchDateByMissionId(int missionId, String updateLaunchDate) {
        boolean isLaunchDateUpdated = false;
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration","root", "Mallu@2K3");
            PreparedStatement preparedStatement = connection.prepareStatement("update user_registration.mission_details set launch_date=? where mission_id=?");
            preparedStatement.setString(1,updateLaunchDate);
            preparedStatement.setInt(2,missionId);
            preparedStatement.executeUpdate();

        }catch (SQLException exception){
            exception.printStackTrace();
        }
        System.out.println(missionId);
        return isLaunchDateUpdated;
    }

    @Override
    public boolean deleteMissionByMissionId(int missionId) {
        boolean isMissionDeleted = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration","root", "Mallu@2K3");
            PreparedStatement preparedStatement = connection.prepareStatement("delete from mission_details where mission_id=? ");
            preparedStatement.setInt(1,missionId);
            preparedStatement.executeUpdate();

        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
        return isMissionDeleted;
    }
}
