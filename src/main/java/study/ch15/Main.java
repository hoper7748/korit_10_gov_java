package study.ch15;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
//        student.setName("이름");
//        student.setAge(11);
        student.setAddress("진구");
        System.out.println(student);
        Student student2 = new Student("네임", 22, "사직동");
        System.out.println(student2);

        final String data = "임시데이터";
//        data ="test"; // 상수이므로 데이터를 변경할 수 없는 상황이다 const 같은 개념.
        System.out.println(data);

        final String data2;     // 상수 선언
        data2 = "test";         // 초기화

        Student student3 = new Student("이름3", 33);
    }
}
