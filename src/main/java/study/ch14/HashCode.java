package study.ch14;

import java.util.Objects;

class Dog
{
    private String name;
    private int age;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dog dog)) return false;
        return age == dog.age && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
//        return Objects.hash(name, age);
        return Objects.hash(this.name, this.age); // 해시 값을 더해서 새로운 해시 값을 만들어내어 리턴을 함.
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name = " +name +'\'' +
                "age = " + age + "}";
    }
}

public class HashCode {
    public static void main(String[] args) {
        Dog dog = new Dog("AA", 11);
        Dog dog2 = new Dog("AA", 11);
        System.out.println(dog.hashCode());
        System.out.println(dog2.hashCode());
        Dog[] dogs = {
                new Dog ("AA", 11),
                new Dog ("BB", 12),
                new Dog ("CC", 13),
                new Dog ("DD", 14),
                new Dog ("EE", 15),};

        int hashCode = Objects.hash("AA", 11);
        Dog foundDog = null;
        for(Dog d : dogs)
            if(d.hashCode()== hashCode){
                foundDog = d;
                break;
            }
        System.out.println(foundDog);
    }

}
