package ex2.dto;

import lombok.Data;

@Data
public class ResponseDto<T> {
    // Kono Dio Samada!
    private int status;
    private T data;

    public ResponseDto(int status, T data) {
        this.status = status;
        this.data = data;
    }

//    public static ResponseDto<?> homeController(String selectedMenu){
//        if("1".)
//    }

}
