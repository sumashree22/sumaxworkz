package com.xworkz.passportapp;
//process of grouping data into single unit is called encapsulation;

import com.xworkz.passportapp.constants.Area;
import com.xworkz.passportapp.constants.Location;
import com.xworkz.passportapp.generatepassport.PassportSeva;
import com.xworkz.passportapp.passportdto.PassportDto;

public class PassportRunner {
    public static void main(String[] args) {
        PassportDto passportdto=new PassportDto();

        passportdto.setLocation(Location.postOffice);
        passportdto.setArea(Area.Bengaluru);
        passportdto.setFirstName("sumashree");
        passportdto.setLastName("sampekai");
        passportdto.setBirthDate("22/7/2003");
        passportdto.setEmail("sumashreehm22@gmail.com");
        passportdto.setIsEmailSame(true);
        passportdto.setUserId("sumashreehm22@gmail.com");
        passportdto.setPassword("suma123");
        passportdto.setConfirmPassword("suma123");
        passportdto.setSecurityQuestion("question");
        passportdto.setSecurityAnswer("answer");
        passportdto.setCaptcha("AB7123");
        System.out.println(passportdto.toString());

        PassportSeva passportseva=new PassportSeva();
        passportseva.userRegisterd(passportdto);





    }
}