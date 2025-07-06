package com.xworkz.jobapplication.service;

import com.xworkz.jobapplication.dto.RegisterUserDto;

public interface RegisterUserService {
    boolean ValidateAndSave(RegisterUserDto registerUserDto);
}
