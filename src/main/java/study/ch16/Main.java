package study.ch16;

import lombok.*;

@Data
@Getter
@Setter
@EqualsAndHashCode
@ToString(onlyExplicitlyIncluded = true)        // Include 선언한 필드만 tostring으로 출력해라!
class Student{
    @ToString.Include
    private String name;
    @ToString.Include
    private static String schooleName;

    public static void setSchoolName(String schoolName){
        Student.schooleName = schoolName;
    }

    public static String getSchoolName(){
        return schooleName;
    }

    public static Student getInstance(String name)
    {
//        this.name = name;
        Student student = new Student();
        student.setName(name);
        return student;
    }

}
public class Main {
    public static void main(String[] args) {
//        Student student = new Student();
        Student.setSchoolName("Hello");
        System.out.println(Student.getSchoolName());

        Student student = new Student();
        student.setName("123");

        System.out.println(student.toString());

        Student student2 = Student.getInstance("456");

    }
}
