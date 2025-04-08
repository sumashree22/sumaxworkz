package com.xworkz.phonepay.phonepeapp;

import com.xworkz.phonepay.phonepedto.PhonePeDto;

public class PhonePeApp {

        PhonePeDto dto;

        public void UserRegistered(PhonePeDto phonePeDto) {
            boolean isValid = validateUser(phonePeDto);
            boolean isvalid = false;

            if (isValid) {
                isvalid = true;
                dto = phonePeDto;
            } else {
                System.out.println("Registration failed.");
            }
        }

        public boolean validateUser(PhonePeDto phonePeDto) {
            boolean isvalid = false;
            boolean isFullNameValid = false;
            boolean isPhoneNumberValid = false;
            boolean isEmailValid = false;
            boolean isPasswordValid = false;
            boolean isConfirmPasswordValid = false;
            boolean isBankAccountValid = false;
            boolean isIfscCodeValid = false;

            if (phonePeDto.getFullName() != null && !phonePeDto.getFullName().isEmpty())
                isFullNameValid = true;

            if (phonePeDto.getPhoneNumber() != null && !phonePeDto.getPhoneNumber().isEmpty())
                isPhoneNumberValid = true;

            if (phonePeDto.getEmail() != null && phonePeDto.getEmail().contains("@"))
                isEmailValid = true;

            if (phonePeDto.getPassword() != null && !phonePeDto.getPassword().isEmpty())
                isPasswordValid = true;

            if (phonePeDto.getPassword().equals(phonePeDto.getConfirmPassword()))
                isConfirmPasswordValid = true;

            if (phonePeDto.getBankAccountNumber() != null && !phonePeDto.getBankAccountNumber().isEmpty())
                isBankAccountValid = true;

            if (phonePeDto.getIfscCode() != null && !phonePeDto.getIfscCode().isEmpty())
                isIfscCodeValid = true;

            if (isFullNameValid && isPhoneNumberValid && isEmailValid && isPasswordValid && isConfirmPasswordValid && isBankAccountValid && isIfscCodeValid)
                isvalid = true;

            return isvalid;
        }

        public void fetchDetails() {
            System.out.println("Full Name: " + dto.getFullName());
            System.out.println("Phone Number: " + dto.getPhoneNumber());
            System.out.println("Email: " + dto.getEmail());
            System.out.println("Bank Account Number: " + dto.getBankAccountNumber());
            System.out.println("IFSC Code: " + dto.getIfscCode());
        }
    }


