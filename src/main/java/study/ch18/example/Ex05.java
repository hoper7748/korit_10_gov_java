package study.ch18.example;

import java.util.ArrayList;
import java.util.List;




public class Ex05 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>(List.of("사과","바나나","포도","딸기"));
        int i = strList.indexOf("포도");
        if(i > -1)
            strList.set(i, "망고");
        strList.addFirst("체리");
        strList.remove("딸기");

        System.out.println(strList );
    }
}
