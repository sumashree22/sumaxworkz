package com.xworkx.googleapp;

import com.xworkx.googleapp.generategoogle.GoogleApp;
import com.xworkx.googleapp.googledto.GoogleDto;

public class GoogleAppRunner {
    public static void main(String[] args) {
        GoogleDto googleDto =new GoogleDto();
        googleDto.setUserName("sumashree");
        googleDto.setPhoneNumber("8861938137");
        googleDto.setAddress("banglore");
        googleDto.setPassword("suma@123");
        googleDto.setConfirmPassword("suma@123");
        GoogleApp googleApp=new GoogleApp();
        googleApp.UserRegisterd(googleDto);
        googleApp.fetcDetails();

    }
}
