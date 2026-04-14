package ex3.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Getter
@Setter
public class Account {
    // 하 씨 맵으로 모든 유저의 정보를 관리하고 싶었어
    private static Account instance = null;
    public static Account getInstance(){
        return instance == null ? (instance = new Account()) : instance;
    }
    // 자 계정 정보는 어떤 데이터가 필요할까?
    // 계정 UID, 사용자명, 잔고, 입출력 로그가 있으면 좋겠지?

    private UUID uID = null ;
    private String name = null;
    private long money = 0;
    private Map<LocalDateTime, String> log = new HashMap<>();

    public Account() {

    }

    public void Diposit(long amount){
        money += amount;
    }
    public void WithDraw(long amount){
        money -= amount;
    }

    public void LogUpdate(LocalDateTime date, String str){
        log.put(date, str);
    }
}
