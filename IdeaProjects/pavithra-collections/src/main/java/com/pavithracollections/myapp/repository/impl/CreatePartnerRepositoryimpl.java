package com.pavithracollections.myapp.repository.impl;
import com.pavithracollections.myapp.dto.DistributersPartnerDto;
import com.pavithracollections.myapp.repository.CreatePartnerRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatePartnerRepositoryimpl implements CreatePartnerRepository {
    @Override
    public boolean savePartner(DistributersPartnerDto dto) {
        boolean partnerSaved = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/pavithra_collections", "root", "sumashree@22");
            Statement statement = conn.createStatement();

            String query = "INSERT INTO partners_table(distributerName, adress, mobileNumber, emailId, totalCost) VALUES (" +
                    "'" + dto.getDistributerName() + "', " +
                    "'" + dto.getAdress() + "', " +
                    "'" + dto.getMobileNumber() + "', " +
                    "'" + dto.getEmailId() + "', " +
                    "'" + dto.getTotalCost() + "'" +
                    ")";

            int noOfRowsAffected = statement.executeUpdate(query);

            if (noOfRowsAffected > 0) {
                partnerSaved = true;
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        System.out.println(dto);
        return partnerSaved;

    }
}