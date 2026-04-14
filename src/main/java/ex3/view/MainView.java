package ex3.view;

import ex3.controller.Controller;
import ex3.controller.MainController;
import ex3.model.Account;

import java.util.Scanner;

public class MainView implements View {

    Controller controller;

    public MainView(){
        controller = new MainController();
    }

    @Override
    public void ShowView()  throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        MainMenu();
        // 인풋은 어떻게? 컨트롤러를 통해서 진행하자.
        System.out.print("입력: ");
        String cmd = scanner.nextLine();
        // 데이터를 컨트롤러에게 보내자
        controller.Input(cmd);


    }

    //
    public void MainMenu(){
        System.out.println("===========< Main >===========");
        if(Account.getInstance().getUID() != null){
            System.out.println("계좌주: " + Account.getInstance().getName() + " 소지금: " + Account.getInstance().getMoney());
        }
        System.out.println("1. 계좌생성");
        System.out.println("2. 입금");
        System.out.println("3. 출금");
        System.out.println("4. 계좌조회");
        System.out.println("5. 전체목록");
        System.out.println("6. 거래내역");
        System.out.println("q. 종료");
        System.out.println("==============================");
    }

    public void FailedMenu(){
        System.out.println("===========< Error >===========");

        System.out.println("===============================");
    }
}
