package com.xworkz.app.service;

import com.xworkz.app.dto.AccountDto;

public interface AccountService {

    boolean validateUser(AccountDto dto);
}
