package repo;

import dto.AccountDto;

public interface AccountRepo {
    boolean saveAccountDetails(AccountDto dto);
}
