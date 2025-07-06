package com.xworkz.collegeapp.collegeapp;

import com.xworkz.collegeapp.collegedto.CollegeDto;

public class CollegeApp {

        CollegeDto dto;

        public void UserRegistered(CollegeDto collegeDto) {
            boolean isValid = validateUser(collegeDto);
            boolean isvalid = false;

            if (isValid) {
                isvalid = true;
                dto = collegeDto;
            } else {
                System.out.println("Registration failed.");
            }
        }

        public boolean validateUser(CollegeDto collegeDto) {
            boolean isvalid = false;
            boolean isFullNameValid = false;
            boolean isEmailValid = false;
            boolean isPhoneNumberValid = false;
            boolean isCourseValid = false;
            boolean isMarksValid = false;

            if (collegeDto.getFullName() != null && !collegeDto.getFullName().isEmpty())
                isFullNameValid = true;
            else
                System.out.println("Invalid full name. Please try again later.");

            if (collegeDto.getEmail() != null && collegeDto.getEmail().contains("@"))
                isEmailValid = true;
            else
                System.out.println("Invalid email address. Please enter a valid email.");

            if (collegeDto.getPhoneNumber() != null && !collegeDto.getPhoneNumber().isEmpty())
                isPhoneNumberValid = true;
            else
                System.out.println("Invalid phone number. Please try again later.");

            if (collegeDto.getCourseInterested() != null && !collegeDto.getCourseInterested().isEmpty())
                isCourseValid = true;
            else
                System.out.println("Invalid course. Please enter a valid course.");

            if (collegeDto.getMarksInLastExam() >= 0 && collegeDto.getMarksInLastExam() <= 100)
                isMarksValid = true;
            else
                System.out.println("Invalid marks. Please enter marks between 0 and 100.");

            if (isFullNameValid && isEmailValid && isPhoneNumberValid && isCourseValid && isMarksValid)
                isvalid = true;

            return isvalid;
        }

        public void fetchDetails() {
            System.out.println("Full name: " + dto.getFullName());
            System.out.println("Email: " + dto.getEmail());
            System.out.println("Phone number: " + dto.getPhoneNumber());
            System.out.println("Course interested: " + dto.getCourseInterested());
            System.out.println("Marks in last exam: " + dto.getMarksInLastExam());
        }
    }


