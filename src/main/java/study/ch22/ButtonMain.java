package study.ch22;

import java.awt.*;

class HomeButton implements ButtonClick{
    @Override
    public void OnClick() {
        System.out.println("홈으로 이동");
    }
}

class BackButton implements  ButtonClick{
    @Override
    public void OnClick() {
        System.out.println("뒤로 이동");
    }

}

class LoginButton implements  ButtonClick{


    @Override
    public void OnClick() {
        System.out.println("로그인 요청");
    }
}


public class ButtonMain {
    public static void main(String[] args) {
        ButtonClick btn1 = new HomeButton();
        ButtonClick btn2 = new BackButton();
        ButtonClick btn3 = new LoginButton();
ButtonClick btn4 = new ButtonClick() {
    @Override
    public void OnClick() {
        System.out.println("로그인 요청");
    }
};
        ButtonClick btn5 = () -> System.out.println("로그인 요청");

        btn1.OnClick();
        btn2.OnClick();
        btn3.OnClick();
        btn4.OnClick();
    }


}
