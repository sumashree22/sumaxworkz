package com.xworkz.blinkitapp;

import com.xworkz.blinkitapp.blinkit.BlinkitApp;
import com.xworkz.blinkitapp.blinkitDto.BlinkitDto;

public class BlinkitRunner {
        public static void main(String[] args) {
            BlinkitDto blinkitDto = new BlinkitDto();
            blinkitDto.setFullName("Ravi Sharma");
            blinkitDto.setUsername("ravi_89");
            blinkitDto.setEmail("ravi.sharma@example.com");
            blinkitDto.setPhoneNumber("8887766555");
            blinkitDto.setPassword("ravi@123");

            BlinkitApp blinkitApp = new BlinkitApp();
            blinkitApp.UserRegistered(blinkitDto);
            blinkitApp.fetchDetails();
        }
    }


