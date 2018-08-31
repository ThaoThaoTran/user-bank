package wit.userbank.services;

import org.springframework.stereotype.Service;
import wit.userbank.dao.models.Bank;
import wit.userbank.dao.models.User;

import java.util.List;

@Service
public class UserBankServiceImpl implements UserBankService{
    @Override
    public String createUser(User user) {
        return null;
    }

    @Override
    public String createBank(Bank bank) {
        return null;
    }

    @Override
    public String updateUser(User user) {
        return null;
    }

    @Override
    public String updateBank(Bank bank) {
        return null;
    }

    @Override
    public String remote(long id) {
        return null;
    }

    @Override
    public List<User> listUser() {
        return null;
    }

    @Override
    public List<Bank> listBank() {
        return null;
    }
}
