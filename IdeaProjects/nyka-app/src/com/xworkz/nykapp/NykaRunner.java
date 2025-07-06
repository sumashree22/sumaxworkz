package com.xworkz.nykapp;

import com.xworkz.nykapp.nyka.NykaApp;
import com.xworkz.nykapp.nykadto.NykaDto;

public class NykaRunner {
        public static void main(String[] args) {
            NykaDto nykaDto = new NykaDto();
            nykaDto.setFullName("Priya");
            nykaDto.setMobileNumber("9123456789");
            nykaDto.setEmail("priya.verma@gmail.com");
            nykaDto.setPassword("priya@123");
            nykaDto.setShippingAddress("Bangalore, India");
            nykaDto.setGender("Female");

            NykaApp nykaaApp = new NykaApp();
            nykaaApp.UserRegistered(nykaDto);
            nykaaApp.fetchDetails();
        }
    }


