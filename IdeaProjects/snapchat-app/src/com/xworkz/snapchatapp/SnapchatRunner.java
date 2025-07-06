package com.xworkz.snapchatapp;

import com.xworkz.snapchatapp.snap.snapchatApp;
import com.xworkz.snapchatapp.snapchatdto.SnapchatDto;

public class SnapchatRunner {

        public static void main(String[] args) {
            SnapchatDto snapchatDto = new SnapchatDto();
            snapchatDto.setFullName("Neha");
            snapchatDto.setUsername("neha_yt");
            snapchatDto.setEmail("neha@gmail.com");
            snapchatDto.setPhoneNumber("9876543210");
            snapchatDto.setPassword("neha@123");

            snapchatApp snapchatApp = new snapchatApp();
            snapchatApp.UserRegistered(snapchatDto);
            snapchatApp.fetchDetails();
        }
    }


