package ex2.view;

import ex2.Controller.Controller;
import ex2.dto.ResponseDto;
import ex2.router.RouterPath;
import ex2.router.Routes;
import ex2.util.Input;

import java.util.Map;

public class CreateAccountView implements View {


    @Override
    public void render() {
        createAccountMenu();
        String cmd = Input.nextLine();
        ResponseDto<?> response = Controller.createAccountController(cmd);
        if (response.getStatus() == 100) {
            RouterPath.current = Routes.HOME.name();
        }
    }

    private void createAccountMenu() {
        System.out.println("======<< CREATE_ACCOUNT >>======");
        System.out.println("1. 계좌생성하기");
        System.out.println("b. 뒤로가기");
        System.out.println("======================");
        System.out.println();
    }

}