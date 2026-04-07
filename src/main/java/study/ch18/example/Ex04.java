package study.ch18.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(5, 2, 8));
        List<Integer> list2 = new ArrayList<>(List.of(3, 9, 1));

        list1.addAll(list2);
        Collections.sort(list1);
        System.out.println(list1);
    }
}
