package com.xworkz.inshot.inshotapp;

import com.xworkz.inshot.inshotdto.InShotDto;

public class InShotApp {

        InShotDto dto;

        public void UserRegistered(InShotDto inShotDto) {
            boolean isValid = validateUser(inShotDto);
            boolean isvalid = false;

            if (isValid) {
                isvalid = true;
                dto = inShotDto;
            } else {
                System.out.println("Registration failed.");
            }
        }

        public boolean validateUser(InShotDto inShotDto) {
            boolean isvalid = false;
            boolean isFullNameValid = false;
            boolean isUsernameValid = false;
            boolean isEmailValid = false;
            boolean isPhoneNumberValid = false;
            boolean isPasswordValid = false;

            if (inShotDto.getFullName() != null && !inShotDto.getFullName().isEmpty())
                isFullNameValid = true;

            if (inShotDto.getUsername() != null && !inShotDto.getUsername().isEmpty())
                isUsernameValid = true;

            if (inShotDto.getEmail() != null && inShotDto.getEmail().contains("@"))
                isEmailValid = true;

            if (inShotDto.getPhoneNumber() != null && !inShotDto.getPhoneNumber().isEmpty())
                isPhoneNumberValid = true;

            if (inShotDto.getPassword() != null && !inShotDto.getPassword().isEmpty())
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


