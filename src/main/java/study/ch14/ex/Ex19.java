package study.ch14.ex;

import java.time.LocalTime;

interface ButtonClickListener {
    void onClick(String buttonName);

}

class Button {
    private String name;
    ButtonClickListener listener;

    public Button (String name) {
        this.name = name;
    }

    public void setListener(ButtonClickListener l){
        listener = l;
    }

    public void Click() {
        listener.onClick(name);
    }
}

class AlertListener implements ButtonClickListener{
    @Override
    public void onClick(String buttonName) {
        System.out.println("[경고] " + buttonName + " 클릭됨!");
    }
}

class LogListener implements  ButtonClickListener {
    @Override
    public void onClick(String buttonName) {
        System.out.println("[로그] " + buttonName + " 클릭됨 at " + LocalTime.now());
    }
}

public class Ex19 {
    public static void main(String[] args) {
        Button btn = new Button("저장");
        btn.setListener(new AlertListener());
        btn.Click();
        btn.setListener(new LogListener());
        btn.Click();
    }
}
