package study.ch28;

import java.util.Objects;

// 클래스랑 같은 역할을 함
public record CustomerDto(int id, String name, String phone) {
    public CustomerDto {
        if ( name == null || Objects.equals(name.trim(), "")) {
            throw new IllegalArgumentException("이름 필수");

        }
    }

    public void test() {
        System.out.println("테스트 출력");
//        name = "test";

    }
}
