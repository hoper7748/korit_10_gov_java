package study.ch17;

import lombok.Setter;

public class UserRepository {

    private static UserRepository instance = null;
    private UserRepository() { }
    private Long lastCreateId = 0l;

//    @Setter
    private User[] users ;

    public static UserRepository getInstance() {

        if(instance == null) {
            instance = new UserRepository();
        }

        return instance;
    }

    public void setUsers(User[] users) {
        if (this.users == null) {
            this.users = users;
            return;
        }
        System.out.println("이미 정의된 사용자 배열이 존재합니다.");
    }
    public boolean addUser(User user)
    {
        boolean isSuccess = false;
        for(int i = 0 ; i < users.length; i++)
        {
            if(users[i] == null) {
                user.setId(++lastCreateId);
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

