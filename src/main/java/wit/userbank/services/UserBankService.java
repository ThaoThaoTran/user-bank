package wit.userbank.services;

import wit.userbank.dao.models.Bank;
import wit.userbank.dao.models.User;

import java.util.List;

public interface UserBankService  {
    String createUser(User user);
    String createBank(Bank bank);
    String updateUser(User user);
    String updateBank(Bank bank);
    String remote(long id);
    List<User> listUser();
    List<Bank> listBank();
}
