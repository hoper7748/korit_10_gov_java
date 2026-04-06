package study.ch16;

import lombok.Builder;

@Builder
class UserEntity2{
    private String username;
    private String password;
}

public class BuilderMain {
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity("aaa", "1234", "이름", "AA@gmail.com");
        UserEntity userEntity1 = new UserEntity("aaa", null, null, "aa@gmail.com");
        UserEntity userEntity2 = new UserEntity();
        userEntity2.setUserName("bbb");
        // 생성과정에서 하나하나 쌓아서 만들어가는 과정 Builder 패턴
        UserEntity userEntity4 = UserEntity.builder()
                .username("CCC")
                .password("1111")
                .name("Hello")
                .email("ccc@naver.com")
                .build();
    }
}
