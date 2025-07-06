package com.xworkz.form.repsitory;

import com.xworkz.form.dto.UserDto;
import java.sql.*;

public class RegisterUserRepositoryImpl implements RegisterUserRepository{

        @Override
        public boolean saveUser(UserDto dto) {
            boolean userRegistered = false;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/passport", "root", "Mallu@2K3");
                Statement statement = conn.createStatement();
                int noOfRowsAffected =
                        statement.executeUpdate("insert into user_table values(" + dto.getFirstName() + "," +
                                "'" + dto.getLastName() + "'," +
                                "'" + dto.getGender() + "'," +
                                "'" + dto.getDob() + "'," +
                                "'" + dto.getPassword() + "'," +
                                "'" + dto.getConfirmPassword() + "')");

                if (noOfRowsAffected > 0)
                    userRegistered = true;
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }

            System.out.println(dto);
            return userRegistered;
        }

}
