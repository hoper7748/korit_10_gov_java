package ex3.controller;

import ex3.EX3Application;
import ex3.model.Account;
import ex3.router.Router;
import ex3.router.RouterPath;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class MainController implements Controller{
    // 메인 컨트롤러 룸.
    public void Input(String input) throws InterruptedException{

        if("1".equals(input)) {
            RouterPath.current = Router.ACCOUNT.name();
        } else if("2".equals(input)) {
            if(Account.getInstance().getUID() == null){
                // try catch로 뺄 예정
                System.out.println("계좌가 존재하지 않습니다.");
            }
            else {
                RouterPath.current = Router.DIPOSIT.name();
            }
        } else if("3".equals(input)) {
            if(Account.getInstance().getUID() == null){
                // try catch로 뺄 예정
                System.out.println("계좌가 존재하지 않습니다.");
            }
            else {
                RouterPath.current = Router.WITHDRAW.name();
            }

        } else if("4".equals(input)) {
            if(Account.getInstance().getUID() == null){
                // try catch로 뺄 예정
                System.out.println("계좌가 존재하지 않습니다.");
            }else{
                System.out.println("계좌주: " + Account.getInstance().getName() + " 소지금: " + Account.getInstance().getMoney());
                Thread.sleep(2000);
            }

        } else if("5".equals(input)) {
            if(Account.getInstance().getUID() == null){
                // try catch로 뺄 예정
                System.out.println("계좌가 존재하지 않습니다.");
            }

        } else if("6".equals(input)) {
            if(Account.getInstance().getUID() == null) {
                System.out.println("계좌가 존재하지 않습니다.");
            }
            else{
                for(String log : Account.getInstance().getLog().values()){
                    System.out.println(log);
                }
                try{
                    System.in.read();
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        } else if("q".equals(input)) {
            EX3Application.running = false;
        } else {
            // 전혀 다른 문자를 입력했기 때문에 재 입력을 하라고 요구.
        }

    }
}
