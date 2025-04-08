package com.xworkz.collegeapp;

import com.xworkz.collegeapp.collegeapp.CollegeApp;
import com.xworkz.collegeapp.collegedto.CollegeDto;

public class CollegeAppRunner {
        public static void main(String[] args) {
            CollegeDto collegeDto = new CollegeDto();
            collegeDto.setFullName("Ananya Sharma");
            collegeDto.setEmail("ananya@outlook.com");
            collegeDto.setPhoneNumber("9876543210");
            collegeDto.setCourseInterested("B.Tech");
            collegeDto.setMarksInLastExam(85.5);

            CollegeApp collegeApp = new CollegeApp();
            collegeApp.UserRegistered(collegeDto);
            collegeApp.fetchDetails();
        }
    }


