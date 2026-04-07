package study.ch18.example;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {

    public static void main(String[] args) {
        // List.of("Java", "Python", "Java", "C++", "Python", "Go")
        List<String> strList = new ArrayList<>(List.of("Java", "Python", "Java", "C++", "Python", "Go"));
        List<String> newList = new ArrayList<>();
        for (String str : strList){
            if(!newList.contains(str)) {
                newList.add(str);
            }
        }
        System.out.println(newList);
    }
}
