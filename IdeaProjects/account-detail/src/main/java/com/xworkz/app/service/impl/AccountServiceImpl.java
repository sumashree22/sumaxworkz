package com.xworkz.app.service.impl;

import com.xworkz.app.dto.AccountDto;
import com.xworkz.app.repo.AccountRepo;
import com.xworkz.app.repo.impl.AccountRepoImpl;
import com.xworkz.app.service.AccountService;

public class AccountServiceImpl implements AccountService {

    AccountRepo accountRepo;

    public AccountServiceImpl(){
        accountRepo = new AccountRepoImpl();
    }
    @Override
    public boolean validateUser(AccountDto dto) {
        boolean isValid = false;

        boolean isAccountNameValid = false;
        boolean isAccountTypeValid = false;
        boolean isAccountAddressValid = false;

        if (dto.getAccountName() != null && !dto.getAccountName().isEmpty()){
            isAccountNameValid = true;
        }else System.out.println("Please provide valid details");
        if (dto.getAccountType() != null && !dto.getAccountType().isEmpty()){
            isAccountTypeValid = true;
        }else System.out.println("Please provide valid details");
        if (dto.getAccountAddress() !=null && !dto.getAccountAddress().isEmpty()){
            isAccountAddressValid = true;
        }else System.out.println("Please provide valid details");

        if (isAccountNameValid && isAccountTypeValid && isAccountAddressValid){
           isValid = accountRepo.saveUser(dto);
        }

        return isValid;
    }
}
