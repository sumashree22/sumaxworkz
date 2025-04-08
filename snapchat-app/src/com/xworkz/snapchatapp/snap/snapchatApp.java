package com.xworkz.snapchatapp.snap;

import com.xworkz.snapchatapp.snapchatdto.SnapchatDto;

public class snapchatApp {

        SnapchatDto dto;

        public void UserRegistered(SnapchatDto snapchatDto) {
            boolean isValid = validateUser(snapchatDto);
            boolean isvalid = false;

            if (isValid) {
                isvalid = true;
                dto = snapchatDto;
            } else {
                System.out.println("Registration failed.");
            }
        }

        public boolean validateUser(SnapchatDto snapchatDto) {
            boolean isvalid = false;
            boolean isFullNameValid = false;
            boolean isUsernameValid = false;
            boolean isEmailValid = false;
            boolean isPhoneNumberValid = false;
            boolean isPasswordValid = false;

            if (snapchatDto.getFullName() != null && !snapchatDto.getFullName().isEmpty())
                isFullNameValid = true;

            if (snapchatDto.getUsername() != null && !snapchatDto.getUsername().isEmpty())
                isUsernameValid = true;

            if (snapchatDto.getEmail() != null && snapchatDto.getEmail().contains("@"))
                isEmailValid = true;

            if (snapchatDto.getPhoneNumber() != null && !snapchatDto.getPhoneNumber().isEmpty())
                isPhoneNumberValid = true;

            if (snapchatDto.getPassword() != null && !snapchatDto.getPassword().isEmpty())
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


