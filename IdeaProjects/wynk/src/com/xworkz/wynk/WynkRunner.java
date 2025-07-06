package com.xworkz.wynk;

import com.xworkz.wynk.wynkapp.WynkApp;
import com.xworkz.wynk.wynkdto.WynkDto;

public class WynkRunner {
        public static void main(String[] args) {
            WynkDto wynkDto = new WynkDto();
            wynkDto.setFullName("Priya Singh");
            wynkDto.setUsername("priya_singh");
            wynkDto.setEmail("priya@gmail.com");
            wynkDto.setPhoneNumber("9876543210");
            wynkDto.setPassword("priya@123");

            WynkApp wynkApp = new WynkApp();
            wynkApp.UserRegistered(wynkDto);
            wynkApp.fetchDetails();
        }
    }


