package study.ch18.example;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>(List.of(85, 92, 78, 96, 88));
        System.out.println("전체 점수: " + scores);

        double average = 0;
        int max = scores.get(0);
        for (int s : scores) {
            average += s;
            if (s > max) max = s;
        }
        average /= scores.size();

        System.out.printf("평균: %.1f%n", average);
        System.out.println("최고 점수: " + max);
    }
}
