package study.ch17;

import java.util.Random;
import java.util.UUID;

public class Main {
    public static String[][] createUsernamesAndPasswords(){
        String[][] usernamesAndPasswords = new String[2][60];
        String[] usernames = usernamesAndPasswords[0];
        String[] passwords = usernamesAndPasswords[1];

        for(int i = 0 ; i < 60; i++) {
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


        return usernamesAndPasswords;
    }

    public static void main(String[] args) {
        String[] usernames = Main.createUsernamesAndPasswords()[0];
        String[] passwords = Main.createUsernamesAndPasswords()[1];

        User[] users = new User[50];

        UserRepository userRepository = UserRepository.getInstance();
        userRepository.setUsers(users);

        UserService userService = new UserService(userRepository);
        UserController userController = new UserController(userService);

        for(int i = 0 ; i < 60; i++){
            userController.postMapping(usernames[i], passwords[i]);
        }

    }
}
