package com.xworkz.passportapp.repo.impl;

import com.xworkz.passportapp.dto.UserRegistrationDto;
import com.xworkz.passportapp.repo.GetAllUsersRepository;

import java.sql.*;

public class GetAllUsersRepositoryImpl implements GetAllUsersRepository {
    UserRegistrationDto userDtos[];

    @Override
    public UserRegistrationDto[] fetchAllUsers() {
        int index=0;
        int count=1;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/passportsevaapp","root","sumashree@22");
            PreparedStatement stmnt=con.prepareStatement("select * from user_details");
            ResultSet rs=stmnt.executeQuery();
            while(rs.next()){
                count ++;
            }
            userDtos= new  UserRegistrationDto[count];
            rs=stmnt.executeQuery();
            while(rs.next()){
                System.out.println("started collecting the data");
                UserRegistrationDto userRegistrationDto=new UserRegistrationDto();
                userRegistrationDto.setRegisterAt(rs.getString(2));
                userRegistrationDto.setPassportOffice(rs.getString(3));
                userRegistrationDto.setGivenName((rs.getString(4)));
                userRegistrationDto.setSurName(rs.getString(5));
                userRegistrationDto.setDob(rs.getString(6));
                userRegistrationDto.setEmail(rs.getString(7));
                userRegistrationDto.setSameEmail(rs.getString(8));
                userRegistrationDto.setLoginId(rs.getString(9));
                userRegistrationDto.setPassword(rs.getString(10));
                userRegistrationDto.setConfirmPassword(rs.getString(11));
                userRegistrationDto.setHintQuestion(rs.getString(12));
                userRegistrationDto.setHintAnswer(rs.getString(13));
                userDtos[index++]=userRegistrationDto;
            }
        }
        catch(ClassNotFoundException| SQLException b){
            b.printStackTrace();

        }

        return userDtos;
    }
}
