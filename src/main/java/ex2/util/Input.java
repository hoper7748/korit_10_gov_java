package ex2.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    public static String nextLine(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.print("입력: ");
            return bufferedReader.readLine();
        }catch (IOException e){
            return null;
        }
        //
        // 하하하 막내야 또 속았구나
    }

    public static void nextWait(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("계속 하시려면 아무키나 입력하세요...");
            bufferedReader.readLine();
        }catch (IOException e){
        }
        //
        // 하하하 막내야 또 속았구나
    }
}
