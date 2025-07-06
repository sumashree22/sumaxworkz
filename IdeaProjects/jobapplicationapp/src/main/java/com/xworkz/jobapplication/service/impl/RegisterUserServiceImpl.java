package com.xworkz.jobapplication.service.impl;

import com.xworkz.jobapplication.Repo.RegisterUserRepo;
import com.xworkz.jobapplication.Repo.impl.RegisterUserRepoImpl;
import com.xworkz.jobapplication.dto.RegisterUserDto;
import com.xworkz.jobapplication.service.RegisterUserService;

public class RegisterUserServiceImpl implements RegisterUserService {
    RegisterUserRepo registerUserRepo=new RegisterUserRepoImpl();
    @Override
    public boolean ValidateAndSave(RegisterUserDto registerUserDto) {
        boolean isUserValid=false;
        boolean isnameValid=false;
        boolean isEmailIdValid=false;
        boolean isAgeValid=false;
        boolean isGenderValid=false;
        if(registerUserDto.getName()!=null&&!registerUserDto.getName().isEmpty())
            isnameValid=true;
        if(registerUserDto.getEmailId()!=null&&!registerUserDto.getEmailId().isEmpty())
            isEmailIdValid=true;
        if(registerUserDto.getAge()!=null&&!registerUserDto.getAge().isEmpty())
            isAgeValid=true;
        if(registerUserDto.getGender()!=null&&!registerUserDto.getGender().isEmpty())
            isGenderValid=true;
        if(isnameValid&&isEmailIdValid&& isAgeValid&&isGenderValid)
            isUserValid=registerUserRepo.saveUser(registerUserDto);


        return  isUserValid;

    }
}
