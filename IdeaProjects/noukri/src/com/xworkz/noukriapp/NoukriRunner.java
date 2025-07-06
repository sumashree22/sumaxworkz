package com.xworkz.noukriapp;

import com.xworkz.noukriapp.noukri.NaukriApp;
import com.xworkz.noukriapp.noukridto.NaukriDto;

public class NoukriRunner {
        public static void main(String[] args) {
            NaukriDto naukriDto = new NaukriDto();
            naukriDto.setFullName("vishal");
            naukriDto.setMobileNumber("9876543210");
            naukriDto.setEmail("vishal.sharma@gmail.com");
            naukriDto.setPassword("vishal@123");
            naukriDto.setCurrentLocation("pune, India");
            naukriDto.setSkills("Java, Python, SQL");
            naukriDto.setEducation("B.E in information Science");

            NaukriApp naukriApp = new NaukriApp();
            naukriApp.UserRegistered(naukriDto);
            naukriApp.fetchDetails();
        }
    }


