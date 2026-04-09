package study.ch21.ex;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;


class InvalidScoreException extends Exception{
    public InvalidScoreException(){
        super("점수 범위 오류 (0 ~ 100");
    }
}

class StudentNotFoundException extends  Exception{
    public StudentNotFoundException(){
        super("학생 미존재");
    }
}

@Data
class Student{
    private String name;
    private int score;

    public Student(String name, int score) throws InvalidScoreException {
        this.name = name;
        if(score < 0 || score > 100){
            throw new InvalidScoreException();
        }
        this.score = score;
    }

    public void setScore  (int score) throws   InvalidScoreException{
        this.score = score;
    }
}

interface Manager{
    public void addStudent(String name, int score) throws InvalidScoreException;
    public Student getStudent(String name) throws StudentNotFoundException;
    void updateScore(String name, int score) throws StudentNotFoundException, InvalidScoreException;
    void printAll();
}

class GradeManager implements Manager{
    public static GradeManager instance;
    public Map<String, Student > studentMap = new HashMap<String, Student>();

    public static GradeManager getInstance(){
        if(instance == null) instance = new GradeManager();
        return instance;
    }

    @Override
    public void addStudent(String name, int score) throws InvalidScoreException{
        studentMap.put(name, new Student(name, score));


        //        try{
//        }catch (InvalidScoreException e){
//            e.printStackTrace();
//        }
    }

    @Override
    public Student getStudent(String name) throws StudentNotFoundException{
        Student foundStudent = null;
        for(Student s : studentMap.values()){
            if(s.getName().equals(name)) foundStudent = s;
        }

        if(foundStudent == null) throw new StudentNotFoundException();
        return foundStudent;
    }

    @Override
    public void updateScore(String name, int score) throws StudentNotFoundException, InvalidScoreException {
//        Student foundStudent = getStudent(name);
        getStudent(name).setScore(score);
    }

    @Override
    public void printAll() {
        for(Student s : studentMap.values()){
            System.out.println(s);
        }
    }
}

public class Ex19 {
    public static void main(String[] args) {
        GradeManager gradeManager = GradeManager.getInstance();
        try{
            gradeManager.addStudent("AAA", 101);
            Student foundStudent = gradeManager.getStudent("AAA");
            System.out.println(foundStudent);
            gradeManager.updateScore("BBB", 90);
        }
        catch (InvalidScoreException e){
            e.printStackTrace();
        }
        catch (StudentNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
