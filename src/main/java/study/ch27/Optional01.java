package study.ch27;

import java.util.Optional;

public class Optional01 {
    public static void main(String[] args) {
        // Optional 생성
        Optional<String> name = Optional.empty();
//        System.out.println(name.isPresent());
        System.out.println(name.isEmpty());
    }
}
