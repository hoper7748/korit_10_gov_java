package ex3.controller;

import ex3.model.Account;
import ex3.router.Router;
import ex3.router.RouterPath;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class BankServiceController implements Controller{
    private String type = null;

    public BankServiceController(String type){
        this.type = type;
    }

    @Override
    public void Input(String input)  throws InterruptedException{
        // 입금할 금액을 숫자를 입력하거나, 문자b를 입력하면 초기 메뉴르 돌아감.
        if("b".equals(input)){
            RouterPath.current = Router.HOME.name();
        } else {
            try{
                // 점심 머먹지? <-- 샐러드 먹어야게따
                long money = Long.parseLong(input);

                if(type.equals("입금")){
                    Account.getInstance().Diposit(money);

                    Account.getInstance().LogUpdate(LocalDateTime.now(),
                            LocalDateTime.now() + " 입금 [ " + (Account.getInstance().getMoney() - money) + " -> " + Account.getInstance().getMoney() + " ]")  ;
                }
                else if(type .equals("출금")){
                    if(Account.getInstance().getMoney() < money){
                        // try catch로 빼야함
                        System.out.println("금액이 부족합니다.");
                        Thread.sleep(1000);
                        System.out.println("초기메뉴로 돌아갑니다..");
                        Thread.sleep(1000);
                    } else{
                        Account.getInstance().WithDraw(money);
                        Account.getInstance().LogUpdate(LocalDateTime.now(),
                                LocalDateTime.now() + " 출금 [ " + (Account.getInstance().getMoney() + money) + " -> " + Account.getInstance().getMoney() + " ]")  ;
                    }
                }
                RouterPath.current = Router.HOME.name();
            }catch (NumberFormatException e){
                System.out.println("숫자가 아닌 값이 들어왔습니다.\n초기메뉴로 돌아갑니다.");
                RouterPath.current = Router.HOME.name();
            }
        }
    }
}
