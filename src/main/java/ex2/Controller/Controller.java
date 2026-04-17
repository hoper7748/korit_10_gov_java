package ex2.Controller;

import ex2.dto.ResponseDto;
import ex2.entity.Account;
import ex2.repository.AccountRepositoryImpl;
import ex2.router.RouterPath;
import ex2.router.Routes;
import ex2.util.Input;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Controller {

    public static ResponseDto<Map<String, Object>> homeController(String selectedMenu) {
        ResponseDto<Map<String, Object>> responseDto = new ResponseDto<>(200, new HashMap<>());
        try {
            if ("1".equals(selectedMenu)) {
                RouterPath.current = Routes.CREATE_ACCOUNT.name();
            } else if ("2".equals(selectedMenu)){
                RouterPath.current = Routes.ACCOUNT.name();
            } else if ("q".equals(selectedMenu)){
                responseDto.setStatus(100);
            } else {
                throw new RuntimeException("해당 입력 값은 유효하지 않습니다. 다시 입력하세요.");
            }
        } catch (RuntimeException e) {
            Map<String, Object> errorMap = Map.of(
                    "message", e.getMessage()
            );
            responseDto = new ResponseDto<>(400, errorMap);
        }

        return responseDto;
    }

    public static ResponseDto<?> getAccountListController() {
        List<Account> accountList = AccountRepositoryImpl.ACCOUNT_REPOSITORY.findAll();
        if (accountList.size() == 0) {
            return new ResponseDto<>(400, "조회된 계좌가 없습니다.");
        }
        return new ResponseDto<>(200, accountList);
    }

    public static ResponseDto<?> selectAccountController(int id) {
        Optional<Account> foundAccountOptional = AccountRepositoryImpl.ACCOUNT_REPOSITORY.findById(id);
        if (foundAccountOptional.isEmpty()) {
            return new ResponseDto<>(400, "해당 ID는 등록되지 않은 계좌정보입니다.");
        }
        return new ResponseDto<>(200, foundAccountOptional.get());
    }

    public static ResponseDto<?> accountMenuController(String selectedMenu) {
        ResponseDto<Map<String, Object>> responseDto = new ResponseDto<>(200, new HashMap<>());
        try {
            if ("1".equals(selectedMenu)) {
                // 거래내역조회
            } else if ("2".equals(selectedMenu)){
                // 입금
            } else if ("3".equals(selectedMenu)){
                // 출금
            } else if ("b".equals(selectedMenu)){
                responseDto.setStatus(100);
            } else {
                throw new RuntimeException("해당 입력 값은 유효하지 않습니다. 다시 입력하세요.");
            }
        } catch (RuntimeException e) {
            Map<String, Object> errorMap = Map.of(
                    "message", e.getMessage()
            );
            responseDto = new ResponseDto<>(400, errorMap);
        }

        return responseDto;
    }

    public static ResponseDto<?> createAccountController(String selectedMenu) {
        ResponseDto<?> responseDto = new ResponseDto<>(200, null);
        if ("1".equals(selectedMenu)) {
            // 계좌 생성
            System.out.println("계좌 생성 각 항목을 작성해주세요.");
            System.out.println("[계좌번호]");
            String accountNo = Input.nextLine();
            System.out.println("[예금주]");
            String owner = Input.nextLine();
            System.out.println("[잔액]");
            int balance = Integer.parseInt(Input.nextLine());
            Account newAccount = new Account(0, accountNo, owner, balance);
            Account savedAccount = AccountRepositoryImpl.ACCOUNT_REPOSITORY.save(newAccount);
            System.out.println("계좌생성완료 - 계좌정보");
            System.out.println(savedAccount);
        } else if ("b".equals(selectedMenu)) {
            responseDto.setStatus(100);
        } else {

        }

        return responseDto;
    }
}