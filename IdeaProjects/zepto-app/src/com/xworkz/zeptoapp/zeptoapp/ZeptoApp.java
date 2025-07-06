package com.xworkz.zeptoapp.zeptoapp;

import com.xworkz.zeptoapp.zeptodto.ZeptoDto;

public class ZeptoApp {

        ZeptoDto dto;

        public void UserRegistered(ZeptoDto zeptoDto) {
            boolean isValid = validateUser(zeptoDto);
            boolean isvalid = false;

            if (isValid) {
                isvalid = true;
                dto = zeptoDto;
            } else {
                System.out.println("Registration failed.");
            }
        }

        public boolean validateUser(ZeptoDto zeptoDto) {
            boolean isvalid = false;
            boolean isFullNameValid = false;
            boolean isUsernameValid = false;
            boolean isEmailValid = false;
            boolean isPhoneNumberValid = false;
            boolean isPasswordValid = false;

            if (zeptoDto.getFullName() != null && !zeptoDto.getFullName().isEmpty())
                isFullNameValid = true;

            if (zeptoDto.getUsername() != null && !zeptoDto.getUsername().isEmpty())
                isUsernameValid = true;

            if (zeptoDto.getEmail() != null && zeptoDto.getEmail().contains("@"))
                isEmailValid = true;

            if (zeptoDto.getPhoneNumber() != null && !zeptoDto.getPhoneNumber().isEmpty())
                isPhoneNumberValid = true;

            if (zeptoDto.getPassword() != null && !zeptoDto.getPassword().isEmpty())
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


