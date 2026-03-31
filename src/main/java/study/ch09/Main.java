package study.ch09;

import study.ch09.Entity.Teacher;
import study.ch09.Entity.User;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1. name = "AAA";
        s1.age = 33;
        s1.printInfo();

        Teacher t1 = new Teacher("BBB", 33);

        /*t1.월급 = */t1.월급계산(200000);
        t1.name = "CCC";
        t1.age = 34;


        User user = new User("korit001");
        user.SetPassword("12345");
        user.SetName("Jihun");
        System.out.println(user.GetUsername());
    }
}
