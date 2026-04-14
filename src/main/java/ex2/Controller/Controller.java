package ex2.Controller;

import ex2.dto.ResponseDto;
import ex2.entity.Account;
import ex2.repository.AccountRepositoryImpl;
import ex2.router.RouterPath;
import ex2.router.Routers;
import ex2.util.Input;

import java.util.HashMap;
import java.util.Map;

public class Controller {
    public static ResponseDto<Map<String, Object>> homeController(String selectedMenu){

        ResponseDto<Map<String,Object>> responseDto = new ResponseDto<>(200, new HashMap<>());
        try{
            if("1".equals(selectedMenu)){
                RouterPath.current = Routers.ACCOUNT.name();
//                throw new RuntimeException("계좌등록 실패) 우효한 계좌번호를 입력하세요.");
            }else if("2".equals(selectedMenu)){

            }else if("3".equals(selectedMenu)){

            }else if("4".equals(selectedMenu)){

            }else if("5".equals(selectedMenu)){

            }else if("6".equals(selectedMenu)){

            }else if("q".equals(selectedMenu)){
                responseDto.setStatus(100);
//                responseDto.setData();
            }
            else{
                throw new RuntimeException ("해당 입력 값은 우효하지 않습니다. 다시 입력하세요.");
//            System.out.println("다시 입력하세요.");
            }
        }catch (RuntimeException e){
            Map<String, Object> errorMap = Map.of(
                    "Message", e.getMessage()
            );
            responseDto = new ResponseDto<>(400, errorMap);

        }
        return responseDto;
    }

    public static ResponseDto<?> accountController(String selectedMenu){
        ResponseDto<?> responseDto = new ResponseDto<>(200, null);

        if("1".equals(selectedMenu)){
            // 계좌 생성 로직
            System.out.println("계좌 생성 각 항목을 작성해주세요.");
            System.out.println("[계좌번호]");
            String accountNo = Input.nextLine();
            System.out.println("[예금주]");
            String owner = Input.nextLine();
            System.out.println("[초기잔액]");
            int balance = Integer.parseInt(Input.nextLine());

            Account newAccount = new Account(0, accountNo, owner, balance);
            Account savedAccount = AccountRepositoryImpl.ACCOUNT_REPOSITORY.save(newAccount);
            System.out.println("계좌번호생성 완료 - 개좌정보");
            System.out.println(savedAccount);

        }else if("2".equals(selectedMenu)) {

        }else if("b".equals(selectedMenu)) {
            responseDto.setStatus(100);
        }

        return responseDto;
    }
}
