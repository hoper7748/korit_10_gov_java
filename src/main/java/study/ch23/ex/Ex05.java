package study.ch23.ex;

import java.util.List;
import java.util.Map;

public class Ex05 {
    public static void main(String[] args) {
        List<Map<String,Object>> people = List.of(
                Map.of("name","김자바","age",25),
                Map.of("name","이파이","age",30),
                Map.of("name","박고랭","age",22)
        );

        List<String> result = people.stream().map(num -> (String)num.get("name")).toList();
        System.out.println(result);
    }
}
