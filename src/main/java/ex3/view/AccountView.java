package ex3.view;

import ex3.controller.AccountController;
import ex3.controller.Controller;

import java.util.Scanner;

public class AccountView implements View{
    Controller accountController ;

    public AccountView(){
        accountController = new AccountController();
    }

    @Override
    public void ShowView() throws InterruptedException{
        AccountMenu();
        Scanner scanner = new Scanner(System.in);
        String cmd = scanner.nextLine();
        accountController.Input(cmd);


    }

    private void AccountMenu(){

        System.out.println("===========< Main >===========");
        System.out.println("1. 계좌생성");
        System.out.println("b. 뒤로가기");
        System.out.println("==============================");
    }
}
