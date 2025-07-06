package com.conference.event.repository.impl;

import com.conference.event.dto.ConferenceEventDto;
import com.conference.event.repository.ConferenceEventRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConferenceEventRepositoryImpl implements ConferenceEventRepository {

    @Override
    public boolean saveEvent(ConferenceEventDto eventDto) {
        boolean isEventSaved = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration", "root", "Mallu@2K3");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO conference_events (event_name, speaker, event_date, location, duration_hours) VALUES (?, ?, ?, ?, ?)");
            preparedStatement.setString(1, eventDto.getEventName());
            preparedStatement.setString(2, eventDto.getSpeaker());
            preparedStatement.setString(3, eventDto.getEventDate());
            preparedStatement.setString(4, eventDto.getLocation());
            preparedStatement.setDouble(5, eventDto.getDurationHours());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(eventDto);
        return isEventSaved;
    }

    @Override
    public boolean updateEventDateById(int eventId, String updatedDate) {
        boolean isUpdated = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration", "root", "Mallu@2K3");
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE conference_events SET event_date=? WHERE event_id=?");
            preparedStatement.setString(1, updatedDate);
            preparedStatement.setInt(2, eventId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean deleteEventById(int eventId) {
        boolean isDeleted = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration", "root", "Mallu@2K3");
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM conference_events WHERE event_id=?");
            preparedStatement.setInt(1, eventId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isDeleted;
    }
}