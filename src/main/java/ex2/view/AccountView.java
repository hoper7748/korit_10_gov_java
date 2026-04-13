package ex2.view;

import ex2.router.RouterPath;
import ex2.router.Routers;
import ex2.util.Input;

public class AccountView implements View{
    @Override
    public void render() {
        accountMenu();
        System.out.print("입력 :");
        String cmd = Input.nextLine();
        if("b".equals(cmd)){
            RouterPath.current = Routers.HOME.name();
        }
    }

    private void accountMenu(){
        System.out.println("=========<< HOME >>=========");
        System.out.println("1. 계좌생성");
        System.out.println("b. 뒤로가기");
        System.out.println("============================");
        System.out.println();
    }
}
