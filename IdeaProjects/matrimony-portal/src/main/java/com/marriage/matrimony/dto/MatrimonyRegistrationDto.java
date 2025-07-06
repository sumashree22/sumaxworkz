package com.marriage.matrimony.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatrimonyRegistrationDto {

    // Personal Details
    private String fullName;
    private String dob;
    private Integer age;
    private String contact;
    private String email;
    private String address;

    // Family Background
    private String fatherName;
    private String fatherOccupation;
    private String motherName;
    private String motherOccupation;
    private Integer siblings;
    private String siblingsDetails;

    // Education & Career
    private String highestEducation;
    private String qualification;
    private String occupation;
    private String employer;
    private String workLocation;
    private String annualIncome;

    // Partner Preferences
    private String partnerReligion;
    private String partnerCaste;
    private String partnerDiet;
    private String partnerLifestyle;

    // Physical Details (Optional)
    private String height;
    private String weight;
    private String complexion;

    // Family Values
    private String familyValues;
}
