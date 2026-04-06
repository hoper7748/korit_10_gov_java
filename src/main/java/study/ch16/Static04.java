package study.ch16;


import lombok.*;
//import lombok.Getter;

// 클래스 안에 클래스를 선언하는 것을 내부 클래스라고 한다
class AA{
    @Getter
    @AllArgsConstructor
    static class BB{
        private String name;
    }

    @Getter
    @AllArgsConstructor
    class CC{
        private String str;
    }
}

public class Static04 {
    public static void main(String[] args){
        AA a = new AA();
        AA.BB b = new AA.BB("이름");
        AA.CC c = (new AA()).new CC("문자열");
        AA.CC c2 = a.new CC("문자열");

        b.getName();
        c.getStr();
    }
}
