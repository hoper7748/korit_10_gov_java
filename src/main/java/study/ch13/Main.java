package study.ch13;

abstract class Person{
    private String lastName;
    private String firstName;

    public abstract void showName();
}

interface  iPerson{
    public String lastName = "";
    public String firstName = "";

    public abstract void showName();
    default void showName2(){

    }
}

class Student extends Person{
    @Override
    public void showName() {

    }
}
class Student2 implements iPerson{
    @Override
    public void showName() {

    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Student();
        iPerson p2 = new Student2();
    }
}
