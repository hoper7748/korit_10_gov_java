package study.ch11;

import javax.swing.*;

class Animal {
    private String name;
    // 기본 생성자 (NoArgumentsConstructor)
    public Animal(){

    }
    // 전체 생성자 (AllArgumentsConstructor)
    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(getName() + "이가 밥을 먹습니다.");
    }

    public String getName() {
        return name;
    }

    public void showInfo(){
        System.out.println("이름: " + name);
    }
}

class Dog extends Animal {
//    private String name;
    private String breed;

    public Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }

    public void bark(){
        System.out.println(super.getName() + "이(가) 짖습니다.");
    }
    public void showInfo(){
//        System.out.println("이름: " + super.getName());
        super.showInfo();
        System.out.println("종: " + breed);
    }
}

class Cat extends Animal
{
    private String color;
    public Cat(String name, String color){
        super(name);
        this.color = color;
    }

    public void grooming(){
        System.out.println(super.getName() + "이(가) 그루밍을 합니다.");
    }
    public void showInfo(){
//        System.out.println("이름: " + super.getName());
        super.showInfo();
        System.out.println("색상: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal   = new Animal();
        Dog dog = new Dog("야옹이", "진돗개");
        Cat cat = new Cat("멍멍이", "검은색");

        dog.eat();
        cat.eat();
        dog.bark();
        cat.grooming();
        dog.showInfo();
        cat.showInfo();

        Animal[] animals = new Animal[6];
        animals[0] = new Animal("누구A");
        animals[1] = new Dog("멍A","시고르");
        animals[2] = new Dog("멍B","자브종");
        animals[3] = new Animal("누구B");
        animals[4] = new Cat("냥A","주");
        animals[5] = new Cat("냥B","노");

        for(Animal a : animals) {

            if(a instanceof Dog) {
                ((Dog) a).bark();
                System.out.println("강아지다");
            }
            else if(a instanceof Cat) {
                ((Cat)a).grooming();
                System.out.println("고먐미다");
            }
            else {
                System.out.println("누구세요?");
            }
        }
    }
}
