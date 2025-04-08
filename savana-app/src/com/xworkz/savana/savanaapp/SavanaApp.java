package com.xworkz.savana.savanaapp;

import com.xworkz.savana.svanadto.SavanaDto;

public class SavanaApp {

        SavanaDto dto;

        public void UserRegistered(SavanaDto savanaDto) {
            boolean isValid = validateUser(savanaDto);
            boolean isvalid = false;

            if (isValid) {
                isvalid = true;
                dto = savanaDto;
            } else {
                System.out.println("Registration failed.");
            }
        }

        public boolean validateUser(SavanaDto savanaDto) {
            boolean isvalid = false;
            boolean isFullNameValid = false;
            boolean isUsernameValid = false;
            boolean isEmailValid = false;
            boolean isPhoneNumberValid = false;
            boolean isPasswordValid = false;
            boolean isShippingAddressValid = false;

            if (savanaDto.getFullName() != null && !savanaDto.getFullName().isEmpty())
                isFullNameValid = true;

            if (savanaDto.getUsername() != null && !savanaDto.getUsername().isEmpty())
                isUsernameValid = true;

            if (savanaDto.getEmail() != null && savanaDto.getEmail().contains("@"))
                isEmailValid = true;

            if (savanaDto.getPhoneNumber() != null && !savanaDto.getPhoneNumber().isEmpty())
                isPhoneNumberValid = true;

            if (savanaDto.getPassword() != null && !savanaDto.getPassword().isEmpty())
                isPasswordValid = true;

            if (savanaDto.getShippingAddress() != null && !savanaDto.getShippingAddress().isEmpty())
                isShippingAddressValid = true;

            if (isFullNameValid && isUsernameValid && isEmailValid && isPhoneNumberValid && isPasswordValid && isShippingAddressValid)
                isvalid = true;

            return isvalid;
        }

        public void fetchDetails() {
            System.out.println("Full Name: " + dto.getFullName());
            System.out.println("Username: " + dto.getUsername());
            System.out.println("Email: " + dto.getEmail());
            System.out.println("Phone Number: " + dto.getPhoneNumber());
            System.out.println("Password: " + dto.getPassword());
            System.out.println("Shipping Address: " + dto.getShippingAddress());
        }
    }


