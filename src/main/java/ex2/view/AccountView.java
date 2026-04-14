package ex2.view;

import ex2.Controller.Controller;
import ex2.dto.ResponseDto;
import ex2.router.RouterPath;
import ex2.router.Routers;
import ex2.util.Input;
import ex3.router.Router;

public class AccountView implements View{
    @Override
    public void render() {
        accountMenu();
        System.out.print("입력 :");
        String cmd = Input.nextLine();
        ResponseDto<?> responseDto = Controller.accountController((cmd));
        if(responseDto.getStatus() == 100){
            RouterPath.current = Router.HOME.name();
        }
//        if("b".equals(cmd)){
//            RouterPath.current = Routers.HOME.name();
//        }
    }

    private void accountMenu(){
        System.out.println("=========<< HOME >>=========");
        System.out.println("1. 계좌생성");
        System.out.println("b. 뒤로가기");
        System.out.println("============================");
        System.out.println();
    }
}
