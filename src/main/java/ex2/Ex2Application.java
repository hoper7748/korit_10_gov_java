package ex2;

import ex2.router.RouterPath;
import ex2.router.Routes;

public class Ex2Application {
    public static boolean running = true;

    public static void main(String[] args) {

        System.out.println("프로그램 실행");

        while (running){
            //current에 할당된 데이터를 바탕으로 Routers Enum 객체를 가지고 온다.
            Routes.valueOf(RouterPath.current).getView().render();
        }
        System.out.println("프로그램 종료");

    }
}
