package ex2.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    public static String nextLine(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try{
            return bufferedReader.readLine();
        }catch (IOException e){
            return null;
        }
        //
        // 하하하 막내야 또 속았구나
    }
}
