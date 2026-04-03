package study.ch14;

class Animal {

}


public class Main {

    public static void main(String[] args) {
        // 최상위 객체 (object)
        Object a = 10;
        Object b = 3.14;
        Object c = "Str";
        Object d = 'a';
        Object e = new Animal();

        // Wrapper Class (래퍼 클래스)
        Integer integer = (Integer)10;  // 일반 자료형 -> 클래스 자료형 (Boxing)
        int i = (int)integer;           // 클래스 자료형 -> 일반 자료형 (UnBoxing)
        // 자바는 Boxing과 unBoxing이 자동. -> AutoBoxing 이라고 한다.


        // int는 객체가 아니기 때문에 null을 대입할 수 없다.(대입 시 0을 대입해야함)
        // 그러나 Integer는 null을 삽입할 수 있는 상태로 생성이 된다.

//        System.out.println(a + b);                  // => 실행 불가
        System.out.println(((int)a) + ((double)b)); // => Object에서 자료형으로 다운캐스팅 되면서 언박싱이 일어난다.
    }
}
