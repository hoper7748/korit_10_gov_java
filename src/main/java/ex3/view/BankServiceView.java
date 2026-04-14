package ex3.view;

import ex3.controller.BankServiceController;

import java.util.Scanner;

public class BankServiceView implements View{
    BankServiceController BankServiceController ;
    String type = null;

    public BankServiceView(String type){
        BankServiceController = new BankServiceController(type);
        this.type = type;
    }

    @Override
    public void ShowView()  throws InterruptedException{
        if(type.equals("입금"))
            DipositMenu();
        else if (type.equals("출금")){
            WithDrawMenu();
        }
        Scanner scanner = new Scanner(System.in);
        String cmd = scanner.nextLine();
        BankServiceController.Input(cmd);

    }

    private void DipositMenu(){
        System.out.println("=========< Deposit >=========");

        System.out.println("b. 초기 메뉴로 돌아가기");
        System.out.println("입금할 금액: ");
        System.out.println("=============================");
    }

    private void WithDrawMenu(){
        System.out.println("=========< WithDraw >=========");

        System.out.println("b. 초기 메뉴로 돌아가기");
        System.out.println("출금할 금액: ");
        System.out.println("==============================");

    }
}
