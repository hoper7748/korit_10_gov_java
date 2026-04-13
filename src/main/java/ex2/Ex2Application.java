package ex2;

import ex2.Controller.Controller;
import ex2.dto.ResponseDto;
import ex2.router.RouterPath;
import ex2.router.Routers;
import ex2.util.Input;
import ex2.view.HomeView;

import java.util.Map;

public class Ex2Application {
    public static boolean loop = true;

    public static void main(String[] args) {

        System.out.println("프로그램 실행");

        while (loop){
            //current에 할당된 데이터를 바탕으로 Routers Enum 객체를 가지고 온다.
            Routers.valueOf(RouterPath.current).getView().render();
        }
        System.out.println("프로그램 종료");

    }
}
