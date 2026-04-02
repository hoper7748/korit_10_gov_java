package study.ch12;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal(){
//            @Override
//            public void eat()
//            {
//
//            }
//
//        };
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        // 상속이 없으면 익명 클래스는 존재하지 않는다.
        // Animal은 추상클래스라서 정의할 수 없는데, 이름 없는 객체를 정의/할당하면 업캐스팅이되어 다음과 같이 정의 될 수 있다.
        // Animal을 상속받은 이름없는 클래스가 임시로 정의되는 개념이라 보면 된다.
        animals[2] = new Animal() {
            @Override
            public void eat() {

            }

            public void Hello() // 이건 호출할 수가 없는 개념 임시 클래스라 다운 캐스팅이 불가능하기 때문
            {

            }
        };

    }
}
