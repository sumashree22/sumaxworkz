package com.xworkz.app.repo.impl;

import com.xworkz.app.dto.AccountDto;
import com.xworkz.app.repo.AccountRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountRepoImpl implements AccountRepo {
    @Override
    public boolean saveUser(AccountDto dto) {
        boolean userRegistered = false;
        //JDBC
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/account","root","sumashree@22");
            Statement statement = connection.createStatement();
            int noOfRowsAffected = statement.executeUpdate("insert into account_details (account_name,account_type,account_address) " +
                    "values('"+dto.getAccountName()+"','"+dto.getAccountType()+"','"+dto.getAccountAddress()+"')");

            if (noOfRowsAffected > 0){
                userRegistered = true;
            }
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return userRegistered;
    }
}
