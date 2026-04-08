package study.ch21;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception01 {
    public static void unchecked() {
        System.out.println("프로그램 실행");
        int a = 10/ 0;
        System.out.println(a);
        System.out.println("프로그램 종료");
    }

    public static void checked(){
        System.out.println("프로그램 실행");
        try{
            FileReader fileReader = new FileReader("Text.txt");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("finally");
        }
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args){
        checked();
        unchecked();
    }
}
