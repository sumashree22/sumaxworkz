package com.xworkz.candycrush;

import com.xworkz.candycrush.candycrushapp.CandyCrushApp;
import com.xworkz.candycrush.candycrushdto.CandyCrushDto;

public class CandycrushRunner {

        public static void main(String[] args) {
            CandyCrushDto candyCrushDto = new CandyCrushDto();
            candyCrushDto.setFullName("Anil Kumar");
            candyCrushDto.setUsername("anil_123");
            candyCrushDto.setEmail("anil.kumar@gmail.com");
            candyCrushDto.setPhoneNumber("9999888777");
            candyCrushDto.setPassword("anil@123");

            CandyCrushApp candyCrushApp = new CandyCrushApp();
            candyCrushApp.UserRegistered(candyCrushDto);
            candyCrushApp.fetchDetails();
        }
    }


