package study.ch09.Entity;

public class Teacher {
    public String name;
    public int age;
    private int 월급;

    public Teacher()
    {

    }
    public Teacher(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.월급 = 100000;
    }

    public void 월급계산(int pay)
    {
        월급 = (int) (월급 - 월급 * 0.01);
    }

    void printInfo() {
        System.out.println("선생님이름: " + name);
        System.out.println("선생님나이: " + age);
    }

}
