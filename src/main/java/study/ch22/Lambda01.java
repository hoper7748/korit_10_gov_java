package study.ch22;

interface Calc{
    public int add(int a, int b);
}

public class Lambda01 {

    public static void main(String[] args) {
        Calc additionLambda = (int a, int b) -> {
            return a + b;
        };
        Calc additionAnonymous = new Calc() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        Calc additionLambda2 = (a,b) -> a + b;

        int result = additionLambda.add(10, 20);
        int result2 = additionAnonymous.add( 30, 40);

    }
}
