package study.ch17;


public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    public void postMapping(String username, String password) {
        int status = userService.signup(username, password);

        switch (status) {
            case 200:
                System.out.println("회원 등록 성공");
                break;
            case 400:
                System.out.println("중복된 사용자 이름입니다.");
                break;
            case 500:
                System.out.println("데이터를 더이상 추가할 수 없습니다.");
                break;
        }
    }
}
