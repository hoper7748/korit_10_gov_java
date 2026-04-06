package study.ch16;

import lombok.*;

import java.util.Arrays;
import java.util.Random;
import java.util.UUID;


@Data
@AllArgsConstructor
class User{
    private Long id;
    private String username;
    private String password;

}

class UserRepository{
    private final User[] users;
    private Long lastCreated = 0l;

//    public static UserRepository instance = null;
//
    public UserRepository(User[] users)
    {
        this.users = users ;
//
//        if(instance == null)
//            instance = new UserRepository();
//        return;
    }

    public boolean addUser(User user)
    {
        boolean isSuccess = false;
        for(int i = 0 ; i < users.length; i++)
        {
            if(users[i] == null) {
                user.setId(++lastCreated);
                users[i] = user;
                isSuccess = true;
                break;
            }
        }

        if(!isSuccess){
            System.out.println("사용자 추가 실패.\n원인은 알아서 찾으세요 *^^*");
            return isSuccess;
        }
        System.out.println("사용자 추가 성공");
        System.out.println("추가된 사용자 정보: " + user);
        return isSuccess;
    }

    public User FindUsername(String username) {
        for(User user : users) {
            if(user == null ) continue;
            if(user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
    public void printUsers(){



        System.out.println("사용자 전체 조회");
        for(User user : users) {
            System.out.println(user);
        }
    }

}

class UserService{

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public int signup(String username, String password) {
        // 성공: 200;
        // 실패: 400; => 중복 아이디
        // 공간 부족: 500;

        User  FoundUser = userRepository.FindUsername(username);
        if(FoundUser != null)
            return 400;
        User newUser = new User(0l, username, password);
        boolean isSuccess = userRepository.addUser(newUser);
        if(!isSuccess)
            return 500;

        userRepository.printUsers();
        return 200;

    }
}

class UserController{
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    public void postMapping(String username, String password) {
        int status = userService.signup(username, password);
//        userService->
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


public class Main2 {
    public static void main(String[] args) {
        String[] usernames = new String[500];
        String[] passwords = new String[500];

        for(int i = 0 ; i < 500; i++) {
            Random random = new Random();
            usernames[i] = "";
            for(int j = 0; j < 10; j++)
            {
                int r = random.nextInt(26) + 97;
                usernames[i] += (char)r;

            }
            usernames[i] += "@gmail.com";
            passwords[i] = UUID.randomUUID().toString().replaceAll("-", "");
        }
        System.out.println(Arrays.toString(usernames));
        System.out.println(Arrays.toString(passwords));

        User[] users = new User[100];
        UserRepository repository = new UserRepository(users);
        UserService service = new UserService(repository);

        UserController userController = new UserController(service);
        for(int i =0; i < 500; i++) {
            userController.postMapping(usernames[i], passwords[i]);
        }
    }
}
