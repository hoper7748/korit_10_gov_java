package study.ch19;

import java.util.HashSet;
import java.util.Set;


public class SetMain {
    public static void main(String[] args) {
        // Set -> 집합 자료형 트리에 데이터 유무를 따질 때 사용
        Set<String> strSet = new HashSet<>();
        // 값 추가(중복 X)
        strSet.add("a");
        strSet.add("b");
        strSet.add("c");
        strSet.add("c");
        System.out.println(strSet);

        Set<User> userSet    = new HashSet<>(Set.of(
                new User(1, "aaa"),
                new User(2, "aaa"),
                new User(3, "aaa"),
                new User(4, "aaa")
        ));
        System.out.println(userSet);

        int id = 3;
        for(User user : userSet)
        {
            if(user.getId() == id)
            {
                System.out.println("아이디 찾음");
                System.out.println(user);
            }
        }
    }
}
