package study.ch14;

import java.util.Arrays;

class Student
{
    @Override
    public String toString() {
        return "이름" + name + " 점수: " + score;
    }

    private String name;
    private int score;

    public Student(){}
    public Student(String name, int score){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ToString {
    public static void main(String[] args) {
        Student student = new Student("AA", 90);
        System.out.println(student.toString());
        System.out.println(student);
        String a = student + "AA";
        System.out.println(a);
        int[] nums = {1,2,3,4};
        System.out.println(nums);

        System.out.println(Arrays.toString(nums));
    }
}
