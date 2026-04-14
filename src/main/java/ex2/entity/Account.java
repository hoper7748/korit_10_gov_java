package ex2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.security.PrivateKey;

@Data@AllArgsConstructor
public class Account {
    private int id;
    private String accountNo;
    private String owner;
    private int balance;

    public void update(Account account){
        this.accountNo = account.accountNo;
        this.owner = account.owner;
        this.balance = account.balance;
    }
}
