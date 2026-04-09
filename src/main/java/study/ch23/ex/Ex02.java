package study.ch23.ex;

import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        Stream<Integer> resultStream = stream.map(num -> num * num);
        System.out.println(resultStream.toList());
    }
}
