package com.xworkz.instagram;

import com.xworkz.instagram.instagramapp.InstagramApp;
import com.xworkz.instagram.instagramdto.InstagramDto;

public class InstagramRunner {
        public static void main(String[] args) {
            InstagramDto instagramDto = new InstagramDto();
            instagramDto.setFullName("Aryan Kumar");
            instagramDto.setUsername("aryan_k");
            instagramDto.setEmail("aryan@outlook.com");
            instagramDto.setPhoneNumber("9876543210");
            instagramDto.setPassword("aryan@123");

            InstagramApp instagramApp = new InstagramApp();
            instagramApp.UserRegistered(instagramDto);
            instagramApp.fetchDetails();
        }
    }


