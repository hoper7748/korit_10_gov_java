package study.ch19.ex;


import java.util.ArrayList;
import java.util.List;

public class ex01 {
    public static void main(String[] args) {
        List<Integer> scoreList = new ArrayList<Integer>(List.of(85,92,78,96,88));
        // 합 계산
        int sumResult = 0 ;
        double average = 0;
        int higher = 0;
        for(int i = 0 ; i < scoreList.size(); i++)
        {
            if(higher < scoreList.get(i)) {
                higher = scoreList.get(i);
            }
            sumResult += scoreList.get(i);
        }
        average = (double)sumResult / scoreList.size();
        System.out.println("평균: "+ average);
        System.out.println("최고 점수: " + higher);
    }

}
