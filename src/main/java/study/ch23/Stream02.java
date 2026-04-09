package study.ch23;

import java.util.stream.Stream;

public class Stream02 {

    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.of(10, 20, 30, 40);
//        System.out.println(numStream.toList());
        Stream<Integer> numStream2 = numStream.map(num -> num * 10);

        Stream<Integer> numStream3 = numStream2.filter(num -> num % 3 != 0);

        System.out.println(numStream2.toList());
    }
}
