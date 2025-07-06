package com.xworkz.passportapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationDto {
    private String registerAt;
    private String passportOffice;
    private String givenName;
    private String  surName;
    private String dob;
    private String email;
    private String sameEmail;
    private String  loginId;
    private String password;
    private String confirmPassword;
    private String hintQuestion;
    private String hintAnswer;


}
