package ra.service;

import ra.model.Account;

public class AccountService implements IGeneric<Account,String>{
    @Override
    public Account[] findAll() {
        return new Account[0];
    }

    @Override
    public Account findById(String id) {
        return null;
    }

    @Override
    public void save(Account account) {

    }

    @Override
    public void delete(String id) {

    }
}
