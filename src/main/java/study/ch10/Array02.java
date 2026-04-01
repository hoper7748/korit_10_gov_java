package study.ch10;

public class Array02 {

    public static void main(String[] args) {
        int[] iArr ={1,2,3,4,5};
        char[] cArr = {'a', 'b', 'c'};
        boolean[] bArr = {true, false, false, true};
        double[] dArr = {1.0, 3.14, 5.5};
        String[] sArr = {"Hello", "World"};

        class Student{
            private String name;
            Student(){}
            Student(String name)
            {
                this.name =name;
            }

            public String GetName()
            {
                return name;
            }

            public void SetName(String name)
            {
                this.name = name;
            }
        }

        Student[] students = {
                new Student("H"),
                new Student("I"),
                new Student("G")
        };

        Student[] students2 = {new Student(), new Student(), new Student()};
        students2[0].SetName("J");
        students2[1].SetName("K");
        students2[2].SetName("L");


    }
}
