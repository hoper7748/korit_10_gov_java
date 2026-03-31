package study.ch08;

import java.util.HashMap;

public class OBJ03 {
    public static void main(String[] args) {
        class Student{
            String name;
            int age;

            Student(String name, int age)
            {
                this.name = name;
                this.age = age;
                System.out.println("학생 생성");
            }
        }

//        Student s1 = new Student();

        Student s1 = new Student("일", 1);
        Student s2 = new Student("이", 2);

        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
    }

}
