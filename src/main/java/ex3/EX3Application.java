package ex3;

import ex3.router.Router;
import ex3.router.RouterPath;

import java.util.zip.CheckedOutputStream;

public class EX3Application {
    public static boolean running = true;
    public static void main(String[] args) {
        System.out.println("프로그램 실행");
        while(running){
            try{
                Router.valueOf(RouterPath.current).getView().ShowView();

            } catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
