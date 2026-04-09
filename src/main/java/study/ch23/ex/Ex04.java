package study.ch23.ex;

import java.util.stream.Stream;

public class Ex04 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java","python","c++", "javascript", "go");
        Stream<String> sStream = stream.filter(num -> num.length() >= 4 );
        Stream<String> stringStream = sStream.map(num -> num.toUpperCase());

        System.out.println(stringStream.toList());
    }
}
