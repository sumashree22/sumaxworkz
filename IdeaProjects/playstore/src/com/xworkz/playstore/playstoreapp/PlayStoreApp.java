package com.xworkz.playstore.playstoreapp;

import com.xworkz.playstore.playstoredto.PlayStoreDto;

public class PlayStoreApp {

        PlayStoreDto dto;

        public void UserRegistered(PlayStoreDto playStoreDto) {
            boolean isValid = validateUser(playStoreDto);
            boolean isvalid = false;

            if (isValid) {
                isvalid = true;
                dto = playStoreDto;
            } else {
                System.out.println("Registration failed.");
            }
        }

        public boolean validateUser(PlayStoreDto playStoreDto) {
            boolean isvalid = false;
            boolean isFullNameValid = false;
            boolean isEmailValid = false;
            boolean isPhoneNumberValid = false;
            boolean isPasswordValid = false;
            boolean isConfirmPasswordValid = false;

            if (playStoreDto.getFullName() != null && !playStoreDto.getFullName().isEmpty())
                isFullNameValid = true;

            if (playStoreDto.getEmail() != null && playStoreDto.getEmail().contains("@"))
                isEmailValid = true;

            if (playStoreDto.getPhoneNumber() != null && !playStoreDto.getPhoneNumber().isEmpty())
                isPhoneNumberValid = true;

            if (playStoreDto.getPassword() != null && !playStoreDto.getPassword().isEmpty())
                isPasswordValid = true;

            if (playStoreDto.getPassword().equals(playStoreDto.getConfirmPassword()))
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


