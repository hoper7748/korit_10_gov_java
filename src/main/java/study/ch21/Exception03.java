package study.ch21;

import java.util.List;

public class Exception03 {
    public static void main(String[] args) {

        List<String> usernames = List.of("Aaa", "Bbb", "Ccc", "Ddd");

        String username = null;
        try {
            if(username == null){
                throw new NullPointerException();
            }
            else{
                boolean isEmpty = usernames.stream().filter(str -> str.equals(username)).count() == 0;
                try{
                    if(isEmpty) throw new UsernameNotFoundException();
                }
                catch (UsernameNotFoundException e){
                    System.out.println("사용자 아이디를 찾지 못했습니다.");
                }
            }
        }
        catch (NullPointerException e){
            System.out.println("username가 NULL");
        }

        System.out.println("프로그램 정상 종료!!!!!!!");
    }
}
