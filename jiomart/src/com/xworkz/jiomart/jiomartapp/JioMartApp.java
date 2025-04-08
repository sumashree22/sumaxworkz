package com.xworkz.jiomart.jiomartapp;

import com.xworkz.jiomart.jiomartdto.JioMartDto;

public class JioMartApp {

        JioMartDto dto;

        public void UserRegistered(JioMartDto jioMartDto) {
            boolean isValid = validateUser(jioMartDto);
            boolean isvalid = false;

            if (isValid) {
                isvalid = true;
                dto = jioMartDto;
            } else {
                System.out.println("Registration failed.");
            }
        }

        public boolean validateUser(JioMartDto jioMartDto) {
            boolean isvalid = false;
            boolean isFullNameValid = false;
            boolean isEmailValid = false;
            boolean isPhoneNumberValid = false;
            boolean isPasswordValid = false;
            boolean isConfirmPasswordValid = false;

            if (jioMartDto.getFullName() != null && !jioMartDto.getFullName().isEmpty())
                isFullNameValid = true;

            if (jioMartDto.getEmail() != null && jioMartDto.getEmail().contains("@"))
                isEmailValid = true;

            if (jioMartDto.getPhoneNumber() != null && !jioMartDto.getPhoneNumber().isEmpty())
                isPhoneNumberValid = true;

            if (jioMartDto.getPassword() != null && !jioMartDto.getPassword().isEmpty())
                isPasswordValid = true;

            if (jioMartDto.getPassword().equals(jioMartDto.getConfirmPassword()))
                isConfirmPasswordValid = true;

            if (isFullNameValid && isEmailValid && isPhoneNumberValid && isPasswordValid && isConfirmPasswordValid)
                isvalid = true;

            return isvalid;
        }

        public void fetchDetails() {
            System.out.println("Full Name: " + dto.getFullName());
            System.out.println("Email: " + dto.getEmail());
            System.out.println("Phone Number: " + dto.getPhoneNumber());
            System.out.println("Password: " + dto.getPassword());
        }
    }


