package com.xworkz.jobapplication.Repo;

import com.xworkz.jobapplication.dto.RegisterUserDto;

public interface RegisterUserRepo {
    boolean saveUser(RegisterUserDto registerUserDto);
}
