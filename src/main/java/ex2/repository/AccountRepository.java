package ex2.repository;


import ex2.entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {
    public Account save(Account account);

    public Optional<ex2.entity.Account> findById(int id);
//    public Optional<Account>

    public Optional<ex2.entity.Account> findByAccountNo(String accountNo);

    public List<Optional<ex2.entity.Account>> findAll();
}
