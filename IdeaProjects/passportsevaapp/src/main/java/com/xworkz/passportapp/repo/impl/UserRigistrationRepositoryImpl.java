package com.xworkz.passportapp.repo.impl;

import com.xworkz.passportapp.dto.UserRegistrationDto;
import com.xworkz.passportapp.repo.UserRegistrationRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRigistrationRepositoryImpl implements UserRegistrationRepository {

    @Override
    public boolean saveUser(UserRegistrationDto dto) {
        boolean userRegistered = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/passportsevaapp", "root", "sumashree@22");
            Statement statement = conn.createStatement();
            int noOfRowsAffected = statement.executeUpdate("insert into user_details (register_at, passport_office, given_name, sur_name, dob, email_id, same_email, login_id, password, confirm_password, hint_question, hint_answer) values(" +
                    "'" + dto.getRegisterAt() + "'," +
                    "'" + dto.getPassportOffice() + "'," +
                    "'" + dto.getGivenName() + "'," +
                    "'" + dto.getSurName() + "'," +
                    "'" + dto.getDob() + "'," +
                    "'" + dto.getEmail() + "'," +
                    "'" + dto.getSameEmail() + "'," +
                    "'" + dto.getLoginId() + "'," +
                    "'" + dto.getPassword() + "'," +
                    "'" + dto.getConfirmPassword() + "'," +
                    "'" + dto.getHintQuestion() + "'," +
                    "'" + dto.getHintAnswer() + "')");
            if (noOfRowsAffected > 0)
                userRegistered = true;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return userRegistered;
    }
}
