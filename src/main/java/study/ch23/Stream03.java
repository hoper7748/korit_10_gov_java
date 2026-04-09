package study.ch23;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
class Student{
    private int studentCode;
    private String name;
    private int score;
}

public class Stream03 {
    public static void main(String[] args) {
        Map<String, Object> studentMap1 = Map.of(
                "studentCode", 2026001,
                "name", "AA",
                "score", 70
        );Map<String, Object> studentMap2 = Map.of(
                "studentCode", 2026002,
                "name", "BB",
                "score", 90
        );Map<String, Object> studentMap3 = Map.of(
                "studentCode", 2026003,
                "name", "AA",
                "score", 60
        );
        List<Map<String,Object>> studentmapList = List.of(
                studentMap1,
                studentMap2,
                studentMap3
        );
//        Student student = new Student(2026001, "AAA", 22);

        List<Student> studentList = studentmapList
                .stream()
                .map(map -> new Student(
                                (Integer) map.get("studentCode"),
                                (String) map.get("name"),
                                (Integer) map.get("score")
                        ))
                .toList();

        System.out.println(studentList);
    }
}
