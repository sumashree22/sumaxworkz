package com.xworkz.collegeapp.collegedto;

public class CollegeDto {

        private String fullName;
        private String email;
        private String phoneNumber;
        private String courseInterested;
        private double marksInLastExam;


        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getFullName() {
            return fullName;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setCourseInterested(String courseInterested) {
            this.courseInterested = courseInterested;
        }

        public String getCourseInterested() {
            return courseInterested;
        }

        public void setMarksInLastExam(double marksInLastExam) {
            this.marksInLastExam = marksInLastExam;
        }

        public double getMarksInLastExam() {
            return marksInLastExam;
        }
    }


