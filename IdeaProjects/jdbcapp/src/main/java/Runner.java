import dto.AccountDto;
import service.AccountService;
import service.impl.ServiceImpl;


public class Runner {
    public static void main(String[] args)  {
        AccountDto dto=new AccountDto();
        dto.setAccountHolder("Sumashree");
        dto.setAccountType("savingsAccount");
       AccountService accountService=new ServiceImpl();
       accountService.validateAndSave(dto);
    }
}
