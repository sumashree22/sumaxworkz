package com.xworkz.jobapplication.Repo.impl;

import com.xworkz.jobapplication.Repo.RegisterUserRepo;
import com.xworkz.jobapplication.dto.RegisterUserDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterUserRepoImpl implements RegisterUserRepo {
    @Override
    public boolean saveUser(RegisterUserDto registerUserDto) {
        boolean isUserSaved=false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/job_database","root","sumashree@22");
            PreparedStatement stmnt=connection.prepareStatement("insert into user_details(user_name,Email_id,Age,Gender) values(?,?,?,?)");
            stmnt.setString(1,registerUserDto.getName());
            stmnt.setString(2,registerUserDto.getEmailId());
            stmnt.setString(3,registerUserDto.getAge());
            stmnt.setString(4,registerUserDto.getGender());
            int noOfrowsAffected=  stmnt.executeUpdate();
            if(noOfrowsAffected>0){
                isUserSaved=true;

            }
        }
        catch(ClassNotFoundException|SQLException e){
            e.printStackTrace();
        }
        return isUserSaved;
    }
}
