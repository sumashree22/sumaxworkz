package com.xworkz.passportapp.repo;

import com.xworkz.passportapp.dto.UserRegistrationDto;

public interface UserRegistrationRepository {
boolean saveUser(UserRegistrationDto dto);
}
