package study.ch08;

import java.sql.SQLOutput;

public class OBJ02 {

    public static void main(String[] args) {
        class Addication
        {
            int defaultNumber =10;
            int add(int a, int b)
            {
                System.out.println("변수 a: " + a);
                System.out.println("변수 b: " + b);
                System.out.println("기본값: " + defaultNumber);
                return a + b + defaultNumber;
            }
        }

        Addication add1 = new Addication();
        int num = 1000;
        int num2 = add1.add(100, 200);
        System.out.println(num + num2);
    }


}
