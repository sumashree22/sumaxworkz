package service.impl;

import dto.AccountDto;
import repo.AccountRepo;
import repo.Accountrepoimpl;
import service.AccountService;

public class ServiceImpl implements AccountService {
    AccountRepo accountRepo;
    public  ServiceImpl(){
        accountRepo= new Accountrepoimpl();
    }

    public boolean validateAndSave(AccountDto dto){
        boolean isAccountValid=false;
        boolean isAccountHolderValid=false;
        boolean isAccountTypeValid=false;
        if(dto.getAccountHolder()!=null&&!dto.getAccountHolder().isEmpty()){
            isAccountHolderValid=true;

        }
        if(dto.getAccountType()!=null&&!dto.getAccountType().isEmpty()){
            isAccountTypeValid=true;

        }
        if(isAccountHolderValid&&isAccountTypeValid){
            isAccountValid=accountRepo.saveAccountDetails(dto);
        }


    return isAccountValid;
    }
}
