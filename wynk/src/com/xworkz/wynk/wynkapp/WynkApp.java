package com.xworkz.wynk.wynkapp;

import com.xworkz.wynk.wynkdto.WynkDto;

public class WynkApp {

        WynkDto dto;

        public void UserRegistered(WynkDto wynkDto) {
            boolean isValid = validateUser(wynkDto);
            boolean isvalid = false;

            if (isValid) {
                isvalid = true;
                dto = wynkDto;
            } else {
                System.out.println("Registration failed.");
            }
        }

        public boolean validateUser(WynkDto wynkDto) {
            boolean isvalid = false;
            boolean isFullNameValid = false;
            boolean isUsernameValid = false;
            boolean isEmailValid = false;
            boolean isPhoneNumberValid = false;
            boolean isPasswordValid = false;

            if (wynkDto.getFullName() != null && !wynkDto.getFullName().isEmpty())
                isFullNameValid = true;

            if (wynkDto.getUsername() != null && !wynkDto.getUsername().isEmpty())
                isUsernameValid = true;

            if (wynkDto.getEmail() != null && wynkDto.getEmail().contains("@"))
                isEmailValid = true;

            if (wynkDto.getPhoneNumber() != null && !wynkDto.getPhoneNumber().isEmpty())
                isPhoneNumberValid = true;

            if (wynkDto.getPassword() != null && !wynkDto.getPassword().isEmpty())
                isPasswordValid = true;

            if (isFullNameValid && isUsernameValid && isEmailValid && isPhoneNumberValid && isPasswordValid)
                isvalid = true;

            return isvalid;
        }

        public void fetchDetails() {
            System.out.println("Full Name: " + dto.getFullName());
            System.out.println("Username: " + dto.getUsername());
            System.out.println("Email: " + dto.getEmail());
            System.out.println("Phone Number: " + dto.getPhoneNumber());
            System.out.println("Password: " + dto.getPassword());
        }
    }


