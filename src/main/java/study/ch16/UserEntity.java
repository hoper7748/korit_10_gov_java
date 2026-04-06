package study.ch16;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    private String userName;
    private String passWord;
    private String name;
    private String email;

    static class UserBuilder{
        private String username;
        private String password;
        private String name;
        private String email;

        public UserEntity build(){
            return new UserEntity(username, password, name, email);
        }

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }
        public UserBuilder password(String password ) {
            this.password = password;
            return this;
        }
        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }
        public UserBuilder email(String email ) {
            this.email = email;
            return this;
        }
    }

    public static UserBuilder builder(){
        return new UserBuilder();

    }
}
