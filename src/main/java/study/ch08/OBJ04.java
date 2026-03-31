package study.ch08;

import java.util.Arrays;

public class OBJ04 {

    public static void main(String[] args) {

        class Addition
        {
            void add (int a){}
            void add (double b){}
            void add (int a, double b) {}
            void add (double a, int b) {}
            int add (int a ,int b, int c) {return a + b + c;}
        }

        Addition aaa = new Addition();
        aaa.add(10);
    }

}
