package com.xworkz.vtuconnect.vtuconnect;

import com.xworkz.vtuconnect.vtuconnectdto.VTUConnectDto;

public class VTUConnectApp {

        VTUConnectDto dto;

        public void UserRegistered(VTUConnectDto vtuConnectDto) {
            boolean isValid = validateUser(vtuConnectDto);
            boolean isvalid = false;

            if (isValid) {
                isvalid = true;
                dto = vtuConnectDto;
            } else {
                System.out.println("Registration failed.");
            }
        }

        public boolean validateUser(VTUConnectDto vtuConnectDto) {
            boolean isvalid = false;
            boolean isFullNameValid = false;
            boolean isUsernameValid = false;
            boolean isEmailValid = false;
            boolean isPhoneNumberValid = false;
            boolean isPasswordValid = false;
            boolean isDepartmentValid = false;
            boolean isStudentIdValid = false;

            if (vtuConnectDto.getFullName() != null && !vtuConnectDto.getFullName().isEmpty())
                isFullNameValid = true;

            if (vtuConnectDto.getUsername() != null && !vtuConnectDto.getUsername().isEmpty())
                isUsernameValid = true;

            if (vtuConnectDto.getEmail() != null && vtuConnectDto.getEmail().contains("@"))
                isEmailValid = true;

            if (vtuConnectDto.getPhoneNumber() != null && !vtuConnectDto.getPhoneNumber().isEmpty())
                isPhoneNumberValid = true;

            if (vtuConnectDto.getPassword() != null && !vtuConnectDto.getPassword().isEmpty())
                isPasswordValid = true;

            if (vtuConnectDto.getDepartment() != null && !vtuConnectDto.getDepartment().isEmpty())
                isDepartmentValid = true;

            if (vtuConnectDto.getStudentId() != null && !vtuConnectDto.getStudentId().isEmpty())
                isStudentIdValid = true;

            if (isFullNameValid && isUsernameValid && isEmailValid && isPhoneNumberValid && isPasswordValid && isDepartmentValid && isStudentIdValid)
                isvalid = true;

            return isvalid;
        }

        public void fetchDetails() {
            System.out.println("Full Name: " + dto.getFullName());
            System.out.println("Username: " + dto.getUsername());
            System.out.println("Email: " + dto.getEmail());
            System.out.println("Phone Number: " + dto.getPhoneNumber());
            System.out.println("Password: " + dto.getPassword());
            System.out.println("Department: " + dto.getDepartment());
            System.out.println("Student ID: " + dto.getStudentId());
        }
    }


