package com.xworkz.app.repo;

import com.xworkz.app.dto.AccountDto;

public interface AccountRepo {

    boolean saveUser(AccountDto dto);
}
