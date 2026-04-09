package study.ch23.ex;

import java.util.stream.Stream;

public class Ex03 {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(3, 7, 2, 9, 4, 11, 6);
        Stream<Integer> higher = stream.filter(num -> num > 5);
        Stream<Integer> mult = higher.map(num -> num * 3);
        System.out.println(mult.toList());
    }
}
