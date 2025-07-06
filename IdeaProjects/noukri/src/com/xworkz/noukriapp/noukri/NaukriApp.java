package com.xworkz.noukriapp.noukri;

import com.xworkz.noukriapp.noukridto.NaukriDto;

public class NaukriApp {
        NaukriDto dto;

        public void UserRegistered(NaukriDto naukriDto) {
            boolean isValid = validateUser(naukriDto);
            boolean isvalid = false;

            if (isValid) {
                isvalid = true;
                dto = naukriDto;
            } else {
                System.out.println("Registration failed");
            }
        }

        public boolean validateUser(NaukriDto naukriDto) {
            boolean isvalid = false;
            boolean isFullNameValid = false;
            boolean isMobileNumberValid = false;
            boolean isEmailValid = false;
            boolean isPasswordValid = false;
            boolean isCurrentLocationValid = false;
            boolean isSkillsValid = false;
            boolean isEducationValid = false;

            if (naukriDto.getFullName() != null && !naukriDto.getFullName().isEmpty())
                isFullNameValid = true;
            else
                System.out.println("Invalid full name. Please try again later.");

            if (naukriDto.getMobileNumber() != null && !naukriDto.getMobileNumber().isEmpty())
                isMobileNumberValid = true;
            else
                System.out.println("Invalid mobile number. Please try again later.");

            if (naukriDto.getEmail() != null && naukriDto.getEmail().contains("@"))
                isEmailValid = true;
            else
                System.out.println("Invalid email address. Please enter a valid email.");

            if (naukriDto.getPassword() != null && !naukriDto.getPassword().isEmpty())
                isPasswordValid = true;
            else
                System.out.println("Invalid password.");

            if (naukriDto.getCurrentLocation() != null && !naukriDto.getCurrentLocation().isEmpty())
                isCurrentLocationValid = true;
            else
                System.out.println("Invalid current location.");

            if (naukriDto.getSkills() != null && !naukriDto.getSkills().isEmpty())
                isSkillsValid = true;
            else
                System.out.println("Please provide skills.");

            if (naukriDto.getEducation() != null && !naukriDto.getEducation().isEmpty())
                isEducationValid = true;
            else
                System.out.println("Please provide education details.");

            if (isFullNameValid && isMobileNumberValid && isEmailValid && isPasswordValid && isCurrentLocationValid && isSkillsValid && isEducationValid)
                isvalid = true;

            return isvalid;
        }

        public void fetchDetails() {
            System.out.println("Full name is: " + dto.getFullName());
            System.out.println("User mobile number is: " + dto.getMobileNumber());
            System.out.println("User email is: " + dto.getEmail());
            System.out.println("User current location is: " + dto.getCurrentLocation());
            System.out.println("User password is: " + dto.getPassword());
            System.out.println("User skills are: " + dto.getSkills());
            System.out.println("User education is: " + dto.getEducation());
        }
    }


