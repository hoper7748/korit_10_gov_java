package study.ch18;

import study.ch17.User;

public class Main {
    public static void main(String[] args) {
//        ErrorResponse er = ErrorResponse.builder()
//                .code(400)
//                .body(User.builder().build())
//                .build();
        ErrorResponse er = new ErrorResponse(400, User.builder().build());

        User user = (User) er.getBody();
        System.out.println(user.getUsername());
        System.out.println(((User)er.getBody()).getUsername());

        // 제네릭을 선언하게 되면 다운 캐스팅은 생략해도 된다.
        SuccessResponse<User> sr= new SuccessResponse<>(200, User.builder().build());
        User user2 = sr.getBody();
        System.out.println(user2.getUsername());

        // 이를 제네릭 메서드라고 한다.
        ErrorResponse.print(User.builder().username("test").password("1234").build());
        ErrorResponse.print((10));
        ErrorResponse.print(("문자열 데이터"));

        String result = ErrorResponse.print2(1100, "반환 데이터");
        System.out.println(result);

        // 주의해야할 점
        SuccessResponse<String> sr2 = new SuccessResponse<>(200, "성공"); // "성공"이 제네릭타입으로 들어온 String 변수
        SuccessResponse<Integer> sr3 = new SuccessResponse<>(200, 100000);
        Integer i = sr3.getBody();
        SuccessResponse<Double> sr4 = new SuccessResponse<>(200, 10000.0);
        SuccessResponse<Character> sr5 = new SuccessResponse<>(200, 'a');
        SuccessResponse<Boolean> sr6 = new SuccessResponse<>(200, true);

    }
}
