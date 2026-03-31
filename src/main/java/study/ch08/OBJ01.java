package study.ch08;

import java.util.HashMap;

public class OBJ01 {
    /**
     * 학생 정보 100개를 저장하세요
     * 이름, 나이, 학년, 주소, 연락처
     */
    private String Name;
    private int Age;
    private int Level;
    private int Address;
    private String PhoneNumber;

    OBJ01(String name, int age, int level, int addr, int phoneNumber)
    {

    }


    public static void main(String[] args) {
        class 학생{
            String Name;
            int Age;

            public void printInfo()
            {
                System.out.println("name:" + Name);
                System.out.println("age:" + Age);
            }

            public void increaseAge()
            {
                System.out.println("1년이란 세월이 흘러...\n" + (Age) + " => " + (Age + 1));

                Age ++;
            }
        }

        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();



        학생 학생1 = new 학생();
        학생1.Name = "성지훈";
        학생1.Age = 11;
        학생1.printInfo();
        학생1.increaseAge();
        학생1.printInfo();

        학생 학생2 = new 학생();
        학생2.Name = "성지훈";
        학생2.Age = 11;
    }
}
