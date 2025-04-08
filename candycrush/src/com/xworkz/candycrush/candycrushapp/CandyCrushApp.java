package com.xworkz.candycrush.candycrushapp;

import com.xworkz.candycrush.candycrushdto.CandyCrushDto;

public class CandyCrushApp {

        CandyCrushDto dto;

        public void UserRegistered(CandyCrushDto candyCrushDto) {
            boolean isValid = validateUser(candyCrushDto);
            boolean isvalid = false;

            if (isValid) {
                isvalid = true;
                dto = candyCrushDto;
            } else {
                System.out.println("Registration failed.");
            }
        }

        public boolean validateUser(CandyCrushDto candyCrushDto) {
            boolean isvalid = false;
            boolean isFullNameValid = false;
            boolean isUsernameValid = false;
            boolean isEmailValid = false;
            boolean isPhoneNumberValid = false;
            boolean isPasswordValid = false;

            if (candyCrushDto.getFullName() != null && !candyCrushDto.getFullName().isEmpty())
                isFullNameValid = true;

            if (candyCrushDto.getUsername() != null && !candyCrushDto.getUsername().isEmpty())
                isUsernameValid = true;

            if (candyCrushDto.getEmail() != null && candyCrushDto.getEmail().contains("@"))
                isEmailValid = true;

            if (candyCrushDto.getPhoneNumber() != null && !candyCrushDto.getPhoneNumber().isEmpty())
                isPhoneNumberValid = true;

            if (candyCrushDto.getPassword() != null && !candyCrushDto.getPassword().isEmpty())
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


