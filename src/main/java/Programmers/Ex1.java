package Programmers;

import java.util.Arrays;
import java.util.Map;

public class Ex1 {

    // red 1, green 2, yellow 3;
    public int solution(int[][] signals) {
        int answer = 0;
        int max = 1;

        // 최대 공배수 구하기
        for(int i = 0; i < signals.length; i++){
            int sum = signals[i][0] + signals[i][1] + signals[i][2];
            max = getLCM(max, sum);
        }

        for(int i = 0; i < max; i++){
            boolean check = true;
            for(int j = 0; j < signals.length; j++){
                int result = i % (signals[i][0] + signals[i][1] + signals[i][2]);
                if(!(signals[i][0] <= result && result < signals[i][0] + signals[i][1])){
                    check = false;
                    break;
                }
            }
        }

        if(answer == 0)
            answer = -1;

        return answer;
    }

    public static int getGCD(int a,int b){
        while(b != 0){
            int r = a /b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int getLCM(int a, int b){
        return a * b / getGCD(a, b);
    }












    public static void main(String[] args) {
//        String s = "A                          ";
//        String answer = "";
////        String[] strs = temp.split(" ");
////        System.out.println(strs.length);
//        s = s.toLowerCase();
//        char a;
//        for(int i = 0 ;i < s.length(); i++){
//            a = (s.charAt(i));
//            if(i == 0){
//                a -= a >= 'a' && a <= 'z' ? 32 : 0;
//            } else if(s.charAt(i - 1) == ' '
//                    && (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')){
//                a -= a >= 'a' && a <= 'z' ? 32 : 0;
//            }
//            answer += a;
//        }
//        System.out.println(answer);



    }
}
