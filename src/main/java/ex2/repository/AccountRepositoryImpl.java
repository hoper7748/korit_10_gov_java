package ex2.repository;


import ex2.entity.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public enum AccountRepositoryImpl implements AccountRepository{
    ACCOUNT_REPOSITORY;

    private static int autoincrementId;
    private List<Account> accountList ;
    private AccountRepositoryImpl(){
        accountList = new ArrayList<>();
    }

    @Override
    public Account save(Account account) {
        findById(account.getId()).ifPresentOrElse(
                foundAccount -> foundAccount.update(account),
                ()-> {
                    account.setId(++autoincrementId);
                    accountList.add(account);
                }
        );
        return account;
    }

    @Override
    public Optional<Account> findById(int id) {
        // optional로 Account를 가져올 것이다.
        return accountList.stream().filter(account -> account.getId() == id ).findFirst();
    }

    @Override
    public Optional<Account> findByAccountNo(String accountNo) {

        return accountList.stream().filter(account -> account.getAccountNo().equals(accountNo) ).findFirst();
    }

    @Override
    public List<Optional<Account>> findAll() {
        return accountList  .stream().map(account -> Optional.of(account)).toList();
    }
}
