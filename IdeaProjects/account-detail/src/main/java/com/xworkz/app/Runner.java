package com.xworkz.app;

import com.xworkz.app.dto.AccountDto;
import com.xworkz.app.service.AccountService;
import com.xworkz.app.service.impl.AccountServiceImpl;

public class Runner {

    static AccountService accountService;
    public static void main(String[] args) {

        AccountDto accountDto = new AccountDto();
        accountDto.setAccountName("Raji");
        accountDto.setAccountType("Current");
        accountDto.setAccountAddress("Hosur");

        accountService = new AccountServiceImpl();
        accountService.validateUser(accountDto);
    }
}
