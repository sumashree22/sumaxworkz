package com.job.applicationJob.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobDto {

    // Basic Info
    private String position;
    private String name;
    private String gender;
    private String postalAddress;
    private String permanentAddress;
    private String phone;
    private String alternatePhone;
    private String email;
    private String dob;
    private String maritalStatus;

    // Education
    private String qualification;
    private String university;
    private String passingYear;

    // Experience / Skills
    private String internships;
    private String skills;
    private String languages;

    // Job Preferences
    private String relocate;
    private String jobLocation;
    private String joiningDate;

}
