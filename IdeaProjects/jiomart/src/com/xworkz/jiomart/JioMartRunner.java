package com.xworkz.jiomart;

import com.xworkz.jiomart.jiomartapp.JioMartApp;
import com.xworkz.jiomart.jiomartdto.JioMartDto;

public class JioMartRunner {

        public static void main(String[] args) {
            JioMartDto jioMartDto = new JioMartDto();
            jioMartDto.setFullName("Ravi Kumar");
            jioMartDto.setEmail("ravi.kumar@gmail.com");
            jioMartDto.setPhoneNumber("9876543210");
            jioMartDto.setPassword("ravi123");
            jioMartDto.setConfirmPassword("ravi123");

            JioMartApp jioMartApp = new JioMartApp();
            jioMartApp.UserRegistered(jioMartDto);
            jioMartApp.fetchDetails();
        }
    }


