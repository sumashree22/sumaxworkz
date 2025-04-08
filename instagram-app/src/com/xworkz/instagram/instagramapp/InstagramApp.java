package com.xworkz.instagram.instagramapp;

import com.xworkz.instagram.instagramdto.InstagramDto;

public class InstagramApp {
        InstagramDto dto;

        public void UserRegistered(InstagramDto instagramDto) {
            boolean isValid = validateUser(instagramDto);
            boolean isvalid = false;

            if (isValid) {
                isvalid = true;
                dto = instagramDto;
            } else {
                System.out.println("Registration failed.");
            }
        }

        public boolean validateUser(InstagramDto instagramDto) {
            boolean isvalid = false;
            boolean isFullNameValid = false;
            boolean isUsernameValid = false;
            boolean isEmailValid = false;
            boolean isPhoneNumberValid = false;
            boolean isPasswordValid = false;

            if (instagramDto.getFullName() != null && !instagramDto.getFullName().isEmpty())
                isFullNameValid = true;

            if (instagramDto.getUsername() != null && !instagramDto.getUsername().isEmpty())
                isUsernameValid = true;

            if (instagramDto.getEmail() != null && instagramDto.getEmail().contains("@"))
                isEmailValid = true;

            if (instagramDto.getPhoneNumber() != null && !instagramDto.getPhoneNumber().isEmpty())
                isPhoneNumberValid = true;

            if (instagramDto.getPassword() != null && !instagramDto.getPassword().isEmpty())
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


