package ex1.controller;

import ex1.model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentManager {
    private static StudentManager instance;

    public static StudentManager getInstance() {
        if (instance == null)
            instance = new StudentManager();
        return instance;
    }

    List<Student> students;

    private StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        if(students.contains(s)){
            System.out.println("해당 학생이 존재함");
            return;
        }
        students.add(s);
    }

    public Student findByName(String name) {
        for(Student s : students){
            if(s.getName().equals(name))
                return s;
        }
        return null;
    }

    public List<Student> getHonorStudents() {       // 평균 80 이상
        List<Student> honorStudent = new ArrayList<>();

        for(Student s : students){
            if(s.getAverage() >= 80){
                honorStudent.add(s);
            }
        }
        return honorStudent;
    }

    public List<Student> getSortedByAverage() {     // 내림차순 정렬s
        List<Student> sortedAverage = new ArrayList<>(students);

        sortedAverage.sort(Comparator.comparingDouble(Student::getAverage));

        return sortedAverage;
    }

    public double getClassAverage() {               // 전체 평균
        double avg = 0.0;
        for(Student s : students){
            avg += s.getAverage();
        }
        return avg / students.size();
    }
}