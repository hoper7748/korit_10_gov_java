package study.ch23.ex;

import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(5, 12, 3, 8, 20, 1);
        Stream<Integer> resultStream = stream.filter(num -> num > 10);
        System.out.println(resultStream.toList());

    }
}
