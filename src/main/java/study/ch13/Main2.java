package study.ch13;

abstract class AbstractAnimal{
    private String name;
    public AbstractAnimal() {}
    public AbstractAnimal(String name ){this. name = name;}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

interface Flyable{
    public abstract void fly();
}

interface Swimmable{
    public abstract void swim();

}

class Duck extends AbstractAnimal implements  Flyable, Swimmable{
    // implements는 extends의 확장과는 달리 구현의 의미를 둠. 인터페이스로 원하는 기능을 추가하여 사용 가능하다.

    public Duck()
    {
        super();
    }

    public Duck(String name)
    {
        super(name);
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}

public class Main2 {
    public static void main(String[] args) {
        // 생성은 다양한 형식으로 가능
        Duck duck = new Duck();
        AbstractAnimal animal = new Duck();
        Flyable flyable = new Duck();
        Swimmable swimmable = new Duck();

        duck.fly();
        duck.swim();
        duck.setName("우리집오리");
        System.out.println(duck.getName());

        animal.setName("옆집오리");
        System.out.println(animal.getName());

        flyable.fly();

        swimmable.swim();
    }

}
