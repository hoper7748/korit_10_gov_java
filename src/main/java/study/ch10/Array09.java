package study.ch10;

import study.ch10.entity.Student;

import java.util.HashMap;

public class Array09 {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student("AAA", 90);
        students[1] = new Student("BBB", 78);
        students[2] = new Student("CCC", 100);

        for(int i = 0; i < students.length; i++)
        {
            System.out.println(students[i].toString());
        }

        for(int i =0 ; i < students.length; i++)
        {
            students[i].setScore(students[i].getScore()- 5);
        }

        for (Student std : students)
        {
            System.out.println(std.toString());
        }

        String searchName = "AAA";
        Student fundStudent = null;

        for(int i= 0 ; i < students.length; i++)
        {
            if(searchName.equals(students[i].getName()))
            {
               fundStudent = students[i];
            }
        }

        if(fundStudent == null)
        {
            System.out.println("해당 이름의 학생이 존재하지 않습니다.");
            return;
        }
        else {
            System.out.println("[ 찾은 학생 정보 ]");
            System.out.println("이름: " + fundStudent.getName());
            System.out.println("점수: " + fundStudent.getScore());
        }

    }
}
