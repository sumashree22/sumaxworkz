package com.xworkz.inshot;

import com.xworkz.inshot.inshotapp.InShotApp;
import com.xworkz.inshot.inshotdto.InShotDto;

public class InshotRunner {



        public static void main(String[] args) {
            InShotDto inShotDto = new InShotDto();
            inShotDto.setFullName("Aditi Singh");
            inShotDto.setUsername("aditi_singh");
            inShotDto.setEmail("aditi.singh@gmail.com");
            inShotDto.setPhoneNumber("9876543210");
            inShotDto.setPassword("aditi123");

            InShotApp inShotApp = new InShotApp();
            inShotApp.UserRegistered(inShotDto);
            inShotApp.fetchDetails();
        }
    }


