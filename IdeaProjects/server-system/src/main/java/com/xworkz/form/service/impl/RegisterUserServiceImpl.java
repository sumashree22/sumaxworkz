package com.xworkz.form.service.impl;

import com.xworkz.form.dto.UserDto;
import com.xworkz.form.repsitory.RegisterUserRepository;
import com.xworkz.form.repsitory.RegisterUserRepositoryImpl;
import com.xworkz.form.service.RegisterUserService;

public class RegisterUserServiceImpl implements RegisterUserService {

    RegisterUserRepository registerUserRepository;

    public RegisterUserServiceImpl()
    {
        registerUserRepository = new RegisterUserRepositoryImpl();
    }

    @Override
    public boolean validateAndSaveUser(UserDto dto) {
        boolean isuserSaved = false;
        boolean isFirstName = false;
        boolean isLasttName = false;
        boolean isGender = false;
        boolean isDob = false;
        boolean isPassword = false;
        boolean isConfirmPassword = false;

        if(dto.getFirstName() != null && !dto.getFirstName().isEmpty() ){
            isFirstName = true;
        }

        if(dto.getLastName() != null && !dto.getLastName().isEmpty()){
            isLasttName = true;
        }

        if(dto.getGender() != null && !dto.getGender().isEmpty()){
            isGender = true;
        }

        if(dto.getDob() != null && !dto.getDob().isEmpty()){
            isDob = true;
        }

        if(dto.getPassword() != null && dto.getPassword().length() >= 8){
            isPassword = true;
        }

        if(dto.getConfirmPassword() != null && dto.getConfirmPassword() == dto.getPassword()){
            isConfirmPassword = true;
        }

        if(isFirstName && isLasttName && isGender  && isDob && isPassword && isConfirmPassword) {
            isuserSaved = registerUserRepository.saveUser(dto);
        }
        return isuserSaved;
    }
}