package service;

import dto.AccountDto;

public interface AccountService {
    boolean validateAndSave(AccountDto dto);

}
