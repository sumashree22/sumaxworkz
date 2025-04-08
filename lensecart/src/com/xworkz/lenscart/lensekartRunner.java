package com.xworkz.lenscart;

import com.xworkz.lenscart.lensekartapp.LenskartApp;
import com.xworkz.lenscart.lenskartdto.LenskartDto;

public class lensekartRunner {

        public static void main(String[] args) {
            LenskartDto lenskartDto = new LenskartDto();
            lenskartDto.setFullName("Ravi Kumar");
            lenskartDto.setUsername("ravi_92");
            lenskartDto.setEmail("ravi.kumar@example.com");
            lenskartDto.setPhoneNumber("9876543210");
            lenskartDto.setPassword("ravi@123");
            lenskartDto.setDateOfBirth("1992-10-25");

            LenskartApp lenskartApp = new LenskartApp();
            lenskartApp.UserRegistered(lenskartDto);
            lenskartApp.fetchDetails();
        }
    }


