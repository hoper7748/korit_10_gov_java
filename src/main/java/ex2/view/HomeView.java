package ex2.view;

import ex2.Ex2Application;
import ex2.Controller.Controller;
import ex2.dto.ResponseDto;
import ex2.util.Input;

import java.util.HashMap;
import java.util.Map;

public class HomeView implements View {

//    @Override
//    public void basicLayout(Map<String, Object> prop) {
//
//    }

    @Override
    public void render() {
        homeMenu();
        String cmd = Input.nextLine();
        ResponseDto<Map<String, Object>> response = Controller.homeController(cmd);
        if (response.getStatus() == 100) {
            Ex2Application.running = false;
            return;
        }
        if (response.getStatus() != 200) {
            homeError(response.getData().get("message").toString());
            return;
        }
    }

    private void homeMenu() {
        Map<String, String> props = new HashMap<>();
        props.put("title", "Home");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1. 계좌생성\n");
        stringBuilder.append("2. 은행 서비스 이용하기\n");
        stringBuilder.append("q. 프로그램 종료\n");
        props.put("body", stringBuilder.toString());
//        props.put("footer", "Home");
        basicLayout(props);
//        System.out.println("======<< HOME >>======");
//        System.out.println("1. 계좌생성");
//        System.out.println("2. 계좌조회");
//        System.out.println("q. 종료");
//        System.out.println("======================");
//        System.out.println();
    }

    private void homeError(String message) {
        Map<String, String> props = new HashMap<>();
        props.put("title", "문제발견");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("오류메세지: ");
        stringBuilder.append(message);
        stringBuilder.append("\n");
        props.put("body", stringBuilder.toString());
        basicLayout(props);
        Input.nextWait();
//        System.out.println("======<< HOME ERROR >>======");
//        System.out.println("오류 내용[ " + message + "]");
//        System.out.println("============================");
//        System.out.println();
    }


}