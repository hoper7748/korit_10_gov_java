package study.ch18;

import study.ch17.User;

class Person{

}

class Student extends Person{

}

class HighStudent extends Student{

}

public class Wildcard {
    // ? extends Object 와 같다 / 상 - 하한 제한 없는 와일드카드
    public static void print(SuccessResponse<?> sr){
        System.out.println(sr);
    }

    // 이런 제네릭를 매개변수로 받는 함수는 오버로딩이 안됨.
    // Extends 는 상속관계의 아래쪽 객체만을 제네릭으로 받아들이는 방식 / 상한 제한 와일드카드
    public static void print2(SuccessResponse<? extends Student> sr)
    {
        System.out.println(sr);
    }

    // Super는 상속관계의 위쪽 객체만을 제네릭으로 받아들이는 방식 / 하한 제한 와일드카드
    public static void print3(SuccessResponse<? super Student> sr)
    {
        System.out.println(sr);
    }

    public static void main(String[] args) {
        SuccessResponse<User> sr1 = new SuccessResponse<>(200, User.builder().build());
        SuccessResponse<String> sr2 = new SuccessResponse<>(200, "문자열");

        Wildcard.print(sr1);
        Wildcard.print(sr2);

//        Wildcard.print2(new SuccessResponse<>(200, new Person()));
        Wildcard.print2(new SuccessResponse<>(200, new Student()));
        Wildcard.print3(new SuccessResponse<>(201, new Student()));
        Wildcard.print3(new SuccessResponse<>(201, new Person()));
        // 자동으로 업캐스팅이 되어버리네?
//        Wildcard.print3(new SuccessResponse<HighStudent>(201, new HighStudent()));


    }
}
