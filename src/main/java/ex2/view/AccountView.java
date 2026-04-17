package ex2.view;

import ex2.Ex2Application;
import ex2.Controller.Controller;
import ex2.dto.ResponseDto;
import ex2.entity.Account;
import ex2.router.RouterPath;
import ex2.router.Routes;
import ex2.util.Input;
import ex2.view.component.Table;

//import java.lang.reflect.Field;
import java.lang.reflect.Field;
import java.util.*;

public class AccountView implements View {
    private Account currentAccount;


    @Override
    public void render() {
        if (currentAccount == null) {
            ResponseDto<?> accountListResponse = Controller.getAccountListController();
            if (accountListResponse.getStatus() == 400) {
                notFoundAccount(accountListResponse.getData().toString());
                RouterPath.current = Routes.HOME.name();
                return;
            }
            selectAccount((List<Account>) accountListResponse.getData());
            System.out.println("======<< 계좌 ID선택 >>======");
            int selectedId = Integer.parseInt(Input.nextLine());
            ResponseDto<?> response = Controller.selectAccountController(selectedId);
            if (response.getStatus() == 400) {
                notFoundAccount(response.getData().toString());
                return;
            }
            currentAccount = (Account) response.getData();
        }
        accountMenu();
        String cmd = Input.nextLine();
        ResponseDto<?> menuResponse = Controller.accountMenuController(cmd);
        if (menuResponse.getStatus() == 100) {
            currentAccount = null;
            RouterPath.current = Routes.HOME.name();
            return;
        }
        if (menuResponse.getStatus() == 400) {
            menuError(menuResponse.getData().toString());
        }
    }

    private void menuError(String message) {
        Map<String, String> props = new HashMap<>();
        props.put("title", "Menu Error");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("오류메세지: ");
        stringBuilder.append(message);
        stringBuilder.append("\n");
        props.put("body", stringBuilder.toString());
        basicLayout(props);
        Input.nextWait();
//        System.out.println("======<< MENU ERROR >>======");
//        System.out.println("오류 내용[ " + message + "]");
//        System.out.println("============================");
//        System.out.println();
    }

    private void notFoundAccount(String message) {
        Map<String, String> props = new HashMap<>();
        props.put("title", "계좌 조회 실패");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("오류메세지: ");
        stringBuilder.append(message);
        stringBuilder.append("\n");
        props.put("body", stringBuilder.toString());
        basicLayout(props);
        Input.nextWait();
    }

    private void selectAccount(List<Account> accountList) {
        Map<String, String> props = new HashMap<>();
        props.put("title", "계좌 목록");

//        int maxOfAccountNoLength = accountList.stream()
//                .map(account -> account.getAccountNo().length())
//                .max(Comparator.comparingInt(prev -> prev))
//                .get();
//
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("| ID |");
//        for(int i = 0 ; i < (maxOfAccountNoLength - "계좌번호". length()) / 2; i++){
//            stringBuilder.append(" ");
//        }
//
//        stringBuilder.append("계좌번호");
//        for(int i = 0 ; i < (maxOfAccountNoLength - "계좌번호". length()) / 2; i++){
//            stringBuilder.append(" ");
//        }
//        stringBuilder.append("| 예금주 |\n");
//
//        accountList.forEach(account -> {
//            stringBuilder.append(String.format("| %d | %s | %s |\n", account.getId(), account.getAccountNo(), account.getOwner()));
//        });

//        props.put("body", stringBuilder.toString());

        List<List<Object>> rows = accountList.stream().map(account -> {
            List<Object> fields = new ArrayList<>();
            Field[] fieldArray =  account.getClass().getDeclaredFields();
            for(Field f : fieldArray){
                try{
                    f.setAccessible(true);
                    fields.add(f.get(account));
                }catch (IllegalAccessException e){
                    System.out.println(e.getMessage());
                }
//                f.get()
            }
            return fields;
        }).toList();
        System.out.println(rows);
        props.put("body", new Table(List.of("ID", "AccountNo", "Owner", "Balance"), rows).getTable());
        basicLayout(props);
    }

    private void accountMenu() {
        Map<String, String> props = new HashMap<>();
        props.put("title",String.format("선택계좌: %s", currentAccount.getAccountNo()));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1. 거래내역조회\n");
        stringBuilder.append("2. 입금\n");
        stringBuilder.append("2. 출금\n");
        stringBuilder.append("q. 뒤로가기\n");
        props.put("body", stringBuilder.toString());
//        props.put("footer", "Home");
        basicLayout(props);
    }

}