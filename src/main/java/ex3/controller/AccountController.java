package ex3.controller;

import ex3.EX3Application;
import ex3.model.Account;
import ex3.model.AccountModel;
import ex3.router.Router;
import ex3.router.RouterPath;
import lombok.extern.java.Log;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class AccountController implements Controller{

    @Override
    public void Input(String input)  throws InterruptedException{
        try {
            if ("1".equals(input)) {
                System.out.println("계좌 생성 시퀸스 시작");
                if(! CreateAccount()){
                    System.out.println("계좌 생성 취소");
                } else {
                    System.out.println("계좌 생성 완료");
                }
                RouterPath.current = Router.HOME.name();
            } else if ("b".equals(input)) {
                RouterPath.current = Router.HOME.name();
            } else {
                // 전혀 다른 문자를 입력했기 때문에 재 입력을 하라고 요구.
                System.out.println("할당되지 않은 키 입력. 재 입력하세요.");
            }
        }catch (Exception e){
            System.out.println("쓰레드 생성 오류");
        }
    }

    public boolean CreateAccount(){
        Scanner scanner = new Scanner(System.in);
        // 받아야할 것은 이름만
        System.out.println("계좌주 명을 입력하세요 (취소 esc): ");

        String name = scanner.nextLine();
        if(name.equals("esc")) {
            System.out.println("계좌 생성을 취소했습니다.");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("AccountController -> Thread.Sleep 오류 [Line: 50]");
            }
            return false;
        }
//        Random rand = new Random();
        UUID uid = UUID.randomUUID();

        Account.getInstance().setUID(uid);
        Account.getInstance().setName(name);
//        Account.builder()
//                .uID(uid)
//                .name("AAA")
//                .money(0)
//                .log(new HashMap<>())
//                .build();
//        AccountModel.getInstance()
//                .getAccountMap()
//                .put(uid,
//                        Account.builder()
//                        .uID(uid)
//                        .name(name)
//                        .money(0)
//                        .log(new HashMap<>())
//                        .build());

        return true;
    }
}
