package Programmers;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        String s = "A                          ";
        String answer = "";
//        String[] strs = temp.split(" ");
//        System.out.println(strs.length);
        s = s.toLowerCase();
        char a;
        for(int i = 0 ;i < s.length(); i++){
            a = (s.charAt(i));
            if(i == 0){
                a -= a >= 'a' && a <= 'z' ? 32 : 0;
            } else if(s.charAt(i - 1) == ' '
                    && (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')){
                a -= a >= 'a' && a <= 'z' ? 32 : 0;
            }
            answer += a;
        }
//        int a = Integer.MIN_VALUE;
//        for(String str : strs){
//            for(int i = 0; i < str.length(); i++){
//                char c = str.charAt(i);
//                if(i == 0){
//                    if(c >= 'a' && c <= 'z'){
//                        answer += (char)(c - 32);
//                        System.out.println(1 + " "+ answer);
//                    } else {
//                        answer += c;
//                        System.out.println(2 + " " + answer);
//                    }
//                }else {
//                    if(c >= 'A' && c <= 'Z'){
//                        answer += (char)(c + 32);
//                        System.out.println(3 + " " + answer);
//                    } else {
//                        answer += c;
//                        System.out.println(4 + " " + answer);
//                    }
//                }
//            }
//            if(!strs[strs.length - 1].equals(str))
//                answer += " ";
//        }
        System.out.println(answer);

    }
}
