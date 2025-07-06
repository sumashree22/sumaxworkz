package com.xworkz.passportapp.repo;

import com.xworkz.passportapp.dto.UserRegistrationDto;

public interface GetAllUsersRepository {
    UserRegistrationDto[] fetchAllUsers() ;

}
