package com.xworkz.form.repsitory;

import com.xworkz.form.dto.UserDto;

public interface RegisterUserRepository {

    boolean saveUser(UserDto dto);

}