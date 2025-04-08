package com.xworkz.blinkitapp.blinkit;

import com.xworkz.blinkitapp.blinkitDto.BlinkitDto;

public class BlinkitApp {

        BlinkitDto dto;

        public void UserRegistered(BlinkitDto blinkitDto) {
            boolean isValid = validateUser(blinkitDto);
            boolean isvalid = false;

            if (isValid) {
                isvalid = true;
                dto = blinkitDto;
            } else {
                System.out.println("Registration failed.");
            }
        }

        public boolean validateUser(BlinkitDto blinkitDto) {
            boolean isvalid = false;
            boolean isFullNameValid = false;
            boolean isUsernameValid = false;
            boolean isEmailValid = false;
            boolean isPhoneNumberValid = false;
            boolean isPasswordValid = false;

            if (blinkitDto.getFullName() != null && !blinkitDto.getFullName().isEmpty())
                isFullNameValid = true;

            if (blinkitDto.getUsername() != null && !blinkitDto.getUsername().isEmpty())
                isUsernameValid = true;

            if (blinkitDto.getEmail() != null && blinkitDto.getEmail().contains("@"))
                isEmailValid = true;

            if (blinkitDto.getPhoneNumber() != null && !blinkitDto.getPhoneNumber().isEmpty())
                isPhoneNumberValid = true;

            if (blinkitDto.getPassword() != null && !blinkitDto.getPassword().isEmpty())
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


