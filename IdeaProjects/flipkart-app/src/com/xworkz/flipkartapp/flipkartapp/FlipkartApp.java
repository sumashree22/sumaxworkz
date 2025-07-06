package com.xworkz.flipkartapp.flipkartapp;

import com.xworkz.flipkartapp.flipkartdto.FlipkartDto;

public class FlipkartApp {
        FlipkartDto dto;

        public void UserRegistered(FlipkartDto flipkartDto) {
            boolean isValid = validateUser(flipkartDto);
            boolean isvalid = false;

            if (isValid) {
                isvalid = true;
                dto = flipkartDto;
            } else {
                System.out.println("Registration failed");
            }
        }

        public boolean validateUser(FlipkartDto flipkartDto) {
            boolean isvalid = false;
            boolean isFullNameValid = false;
            boolean isPhoneNumberValid = false;
            boolean isEmailValid = false;
            boolean isAddressValid = false;
            boolean isPasswordValid = false;
            boolean isConfirmPasswordValid = false;
            boolean isDobValid = false;
            boolean isPinCodeValid = false;
            boolean isGenderValid = false;

            if (flipkartDto.getFullName() != null && !flipkartDto.getFullName().isEmpty())
                isFullNameValid = true;
            else
                System.out.println("Invalid full name. Please try again later.");

            if (flipkartDto.getPhoneNumber() != null && !flipkartDto.getPhoneNumber().isEmpty())
                isPhoneNumberValid = true;
            else
                System.out.println("Invalid phone number. Please try again later.");

            if (flipkartDto.getEmail() != null && flipkartDto.getEmail().contains("@"))
                isEmailValid = true;
            else
                System.out.println("Invalid email address. Please enter a valid email.");

            if (flipkartDto.getAddress() != null && !flipkartDto.getAddress().isEmpty())
                isAddressValid = true;
            else
                System.out.println("Invalid address. Please enter a valid address.");

            if (flipkartDto.getPassword() != null && !flipkartDto.getPassword().isEmpty())
                isPasswordValid = true;
            else
                System.out.println("Invalid password.");

            if (flipkartDto.getPassword().equals(flipkartDto.getConfirmPassword()))
                isConfirmPasswordValid = true;
            else
                System.out.println("Current password does not match with the previous one.");

            if (flipkartDto.getDob() != null && !flipkartDto.getDob().isEmpty())
                isDobValid = true;
            else
                System.out.println("Invalid Date of Birth.");

            if (flipkartDto.getPinCode() != null && flipkartDto.getPinCode().length() == 6)
                isPinCodeValid = true;
            else
                System.out.println("Invalid Pin Code. Please enter a valid Pin Code.");

            if (flipkartDto.getGender() != null && !flipkartDto.getGender().isEmpty())
                isGenderValid = true;
            else
                System.out.println("Invalid gender. Please select a valid gender.");

            if (isFullNameValid && isPhoneNumberValid && isEmailValid && isAddressValid && isPasswordValid && isConfirmPasswordValid && isDobValid && isPinCodeValid && isGenderValid)
                isvalid = true;

            return isvalid;
        }

        public void fetchDetails() {
            System.out.println("Full name is: " + dto.getFullName());
            System.out.println("User phone number is: " + dto.getPhoneNumber());
            System.out.println("User email is: " + dto.getEmail());
            System.out.println("User address is: " + dto.getAddress());
            System.out.println("User password is: " + dto.getPassword());
            System.out.println("User Date of Birth is: " + dto.getDob());
            System.out.println("User Pin Code is: " + dto.getPinCode());
            System.out.println("User gender is: " + dto.getGender());
        }
    }


