package study.ch19.ex;

import lombok.Builder;
import lombok.Data;

import java.sql.Array;
import java.util.*;

@Data
@Builder
class Student{
    private String name;
    private int year;
    private int korScore;
    private int engScore;
    private int mathScore;
}


public class Ex06 {
    public static void main(String[] args) {
        int currentStudentCode = 20260000;
        List<Student> studentList = List.of(
                Student.builder().name("AA").year(1).korScore(80).engScore(90).mathScore(100).build(),
                Student.builder().name("BB").year(2).korScore(70).engScore(80).mathScore(90).build(),
                Student.builder().name("CC").year(1).korScore(90).engScore(80).mathScore(70).build(),
                Student.builder().name("DD").year(2).korScore(60).engScore(70).mathScore(80).build()
        );
        Map<Integer, List<Student>> studentMap = Map.of(
                1, new ArrayList<>(),
                2, new ArrayList<>()
        );
        // 반복문으로 각 학년에 맞게 리스트에 넣어라

        for (Student student : studentList) {
            studentMap.get(student.getYear()).add(student);
        }


        for (Map.Entry<Integer, List<Student>> std : studentMap.entrySet()) {
            System.out.println(std);
        }

        Map<String, Double> scoreMap = new HashMap<>(Map.of(
                "korScore", 0.0,
                "engScore", 0.0,
                "mathScore", 0.0
        ));

        double kor = 0, math = 0, eng = 0;
        for (Student std : studentList) {
            kor += std.getKorScore();
            eng += std.getEngScore();
            math += std.getMathScore();
        }

        kor /= studentList.size();
        eng /= studentList.size();
        math /= studentList.size();

        scoreMap.replace("korScore", kor);
        scoreMap.replace("mathScore", math);
        scoreMap.replace("engScore", eng);

        System.out.println(scoreMap);

        Map<String, Integer> totalScoreMap = new HashMap<>();
        // 키값이 학생 이름이고 총점이 벨류
        for(Student student : studentList){
            totalScoreMap.put(student.getName(), student.getKorScore() + student.getEngScore() + student.getMathScore());
        }

        System.out.println(totalScoreMap);
    }
}
