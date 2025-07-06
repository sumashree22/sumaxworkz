package com.xworkz.lenscart.lensekartapp;

import com.xworkz.lenscart.lenskartdto.LenskartDto;

public class LenskartApp {

        LenskartDto dto;

        public void UserRegistered(LenskartDto lenskartDto) {
            boolean isValid = validateUser(lenskartDto);
            boolean isvalid = false;

            if (isValid) {
                isvalid = true;
                dto = lenskartDto;
            } else {
                System.out.println("Registration failed.");
            }
        }

        public boolean validateUser(LenskartDto lenskartDto) {
            boolean isvalid = false;
            boolean isFullNameValid = false;
            boolean isUsernameValid = false;
            boolean isEmailValid = false;
            boolean isPhoneNumberValid = false;
            boolean isPasswordValid = false;
            boolean isDateOfBirthValid = false;

            if (lenskartDto.getFullName() != null && !lenskartDto.getFullName().isEmpty())
                isFullNameValid = true;

            if (lenskartDto.getUsername() != null && !lenskartDto.getUsername().isEmpty())
                isUsernameValid = true;

            if (lenskartDto.getEmail() != null && lenskartDto.getEmail().contains("@"))
                isEmailValid = true;

            if (lenskartDto.getPhoneNumber() != null && !lenskartDto.getPhoneNumber().isEmpty())
                isPhoneNumberValid = true;

            if (lenskartDto.getPassword() != null && !lenskartDto.getPassword().isEmpty())
                isPasswordValid = true;

            if (lenskartDto.getDateOfBirth() != null && !lenskartDto.getDateOfBirth().isEmpty())
                isDateOfBirthValid = true;

            if (isFullNameValid && isUsernameValid && isEmailValid && isPhoneNumberValid && isPasswordValid && isDateOfBirthValid)
                isvalid = true;

            return isvalid;
        }

        public void fetchDetails() {
            System.out.println("Full Name: " + dto.getFullName());
            System.out.println("Username: " + dto.getUsername());
            System.out.println("Email: " + dto.getEmail());
            System.out.println("Phone Number: " + dto.getPhoneNumber());
            System.out.println("Password: " + dto.getPassword());
            System.out.println("Date of Birth: " + dto.getDateOfBirth());
        }
    }


