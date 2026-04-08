package study.ch19.ex;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Getter
@Builder
class Student1 {
    private int id;
    private String name;
    private int score;
}

interface Manager{
    public void addStudent(int id, String s, int a) ;
    Student1 findById(int id);
    List <Student1> findByMinScore(int min);
    double getAverage();
    void printAll();

}

class StudentManager implements  Manager{

    Map<Integer, Student1> studentMap;

    public StudentManager(){
        studentMap = new HashMap<>();

    }

    @Override
    public void addStudent(int id, String str, int score) {
        studentMap.put(id, Student1.builder().name(str).score(score).build());
    }

    @Override
    public Student1 findById(int id) {
        return studentMap.get(id);
    }

    @Override
    public List<Student1> findByMinScore(int min) {
        return studentMap.values().stream().filter(student -> student.getScore() > min).toList();
    }

    @Override
    public double getAverage() {
        double avg = 0.0;
        for(Student1 std : studentMap.values()){
            avg += std.getScore();
        }

        return avg / studentMap.size();

//        return studentMap.values().stream()
//                .map(student -> (double) student.getScore())
//                .reduce(0.0, Double::sum) / studentMap.size();
//        return Arrays.stream(studentMap.values().stream().toArray()).average
    }

    @Override
    public void printAll() {
        System.out.println(studentMap);
    }
}

public class Ex17 {
    public static void main(String[] args) {
        Manager studentManager =new  StudentManager();
        studentManager.addStudent(2026001, "AA", 90);
        studentManager.addStudent(2026002, "BB", 60);
        studentManager.addStudent(2026003, "CC", 40);
        studentManager.addStudent(2026004, "DD", 10);

        Student1 foundS = studentManager.findById((2026001));
        System.out.println(foundS);
        System.out.println(studentManager.findByMinScore(60));
        System.out.println(studentManager.getAverage());
    }
}
