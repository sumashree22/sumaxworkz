package com.xworkz.passportapp.service.impl;

import com.xworkz.passportapp.dto.UserRegistrationDto;
import com.xworkz.passportapp.repo.GetAllUsersRepository;
import com.xworkz.passportapp.repo.impl.GetAllUsersRepositoryImpl;
import com.xworkz.passportapp.service.GetAllUserService;

public class GetAllUserServiceImpl implements GetAllUserService {

    GetAllUsersRepository getAllUsersRepository;
    public GetAllUserServiceImpl(){
        getAllUsersRepository=new GetAllUsersRepositoryImpl();
    }
    public UserRegistrationDto[] getAllUsers() {
        return getAllUsersRepository.fetchAllUsers();
    }
}
