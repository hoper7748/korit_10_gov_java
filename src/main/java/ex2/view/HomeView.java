package ex2.view;

import ex2.Controller.Controller;
import ex2.Ex2Application;
import ex2.dto.ResponseDto;
import ex2.util.Input;

import java.util.Map;

public class HomeView implements View{

    public void render(){
        homeMenu();
        boolean loop;
        System.out.print("입력: ");
        String cmd = Input.nextLine();
        ResponseDto<Map<String, Object>> response = Controller.homeController(cmd);
        if(response.getStatus() == 100){
            Ex2Application.loop = false;
            return;
        }
        if(response.getStatus() != 200) {
            homeError(response.getData().get("message").toString());
            return;
        }
    }
    // 캡슐화
    private void homeMenu() {
        System.out.println("=========<< HOME >>=========");
        System.out.println("1. 계좌생성");
        System.out.println("2. 입금");
        System.out.println("3. 출금");
        System.out.println("4. 계좌조회");
        System.out.println("5. 전체목록");
        System.out.println("6. 거래내역");
        System.out.println("q. 종료");
        System.out.println("============================");
    }

    private void homeError(String message){
        System.out.println("=========<< HOME ERROR >>=========");
        System.out.println("오류 내용[ " + message + " ]");
        System.out.println("==================================");
        System.out.println();
    }


}
