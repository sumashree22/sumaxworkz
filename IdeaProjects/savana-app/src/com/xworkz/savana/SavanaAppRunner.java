package com.xworkz.savana;

import com.xworkz.savana.savanaapp.SavanaApp;
import com.xworkz.savana.svanadto.SavanaDto;

public class SavanaAppRunner {

        public static void main(String[] args) {
            SavanaDto savanaDto = new SavanaDto();
            savanaDto.setFullName("Anjali");
            savanaDto.setUsername("anjali_22");
            savanaDto.setEmail("anjali@gmail.com");
            savanaDto.setPhoneNumber("8888777666");
            savanaDto.setPassword("anjali@123");
            savanaDto.setShippingAddress("123, MG Road, Bengaluru, Karnataka");

            SavanaApp savanaApp = new SavanaApp();
            savanaApp.UserRegistered(savanaDto);
            savanaApp.fetchDetails();
        }
    }


