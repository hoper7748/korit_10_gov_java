package study.ch18;

import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Data
@Builder
public class ErrorResponse {
    private int code;
    private Object body; // Object는 여러 자료형을 넣을 수 있다.

    // 이렇게 선언하는 방법은
    public static <T> void print(T data){
        System.out.println(data);
    }
    public static <T, R> R print2(T data, R returnData){
        System.out.println(data);
        return returnData;
    }

}
