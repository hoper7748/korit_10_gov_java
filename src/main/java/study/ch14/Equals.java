package study.ch14;

import java.util.Objects;

class Teacher{
    private String name;
    private int age;

    public Teacher(){

    }

    public Teacher( String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }

    @Override
    public boolean equals(Object o) {
//        if (!(o instanceof Teacher teacher)) return false;
//        return age == teacher.age && Objects.equals(name, teacher.name);
        if(!(o instanceof Teacher teacher))
        {
            return false;
        }  // 다운 캐스팅
        return this.age == teacher.age && this.name.equals(teacher.name);

    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
}

public class Equals {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("AA", 3);
        Teacher t2 = new Teacher("AA", 3);
        System.out.println(t1.equals(t2));
        System.out.println(t1 == t2);

    }
}
