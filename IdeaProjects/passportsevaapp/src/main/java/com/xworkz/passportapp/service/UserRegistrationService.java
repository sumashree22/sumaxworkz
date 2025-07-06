package com.xworkz.passportapp.service;

import com.xworkz.passportapp.dto.UserRegistrationDto;

public interface UserRegistrationService {
    boolean validateUser(UserRegistrationDto dto);
}
