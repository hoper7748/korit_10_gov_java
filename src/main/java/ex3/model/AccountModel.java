package ex3.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// 데이터 접근 권한을 확인할 수 있도록 해야함.
public class AccountModel {
    private static AccountModel instance = null ;

    @Getter
    @Setter
    // 주민번호까지 같아버리면 어떻게 찾을 것인지도 고민해야함.
    private Map<UUID, Account> accountMap= new HashMap<>();

    public static AccountModel getInstance(){
        if(instance == null) instance = new AccountModel();
        return instance;
    }

    private AccountModel(){

    }




}
