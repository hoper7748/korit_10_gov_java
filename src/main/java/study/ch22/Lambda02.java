package study.ch22;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class r implements  Runnable{
    @Override
    public void run() {

    }
}

public class Lambda02 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable(){
            @Override
            public void run() {

            }
        };

        Runnable run = () -> {};

        Consumer<String> c1 = str -> {
            System.out.println(str);
        };

        Consumer<List<Integer>> c2 = numList -> {
            for(Integer i : numList){
                System.out.println("i:" + i);
            }
        };

        run.run();
//        c1("hello");
        c1.accept("Hello");
        c2.accept(List.of(1,2,3,4,5,6,7));

        Supplier<Character> s = () -> {
            System.out.println("Supplier 객체 호출");
            return 'a';
        };

        Supplier<Character> s2 = ()-> "abcd".charAt(0);

        System.out.println(s.get());
        System.out.println(s2.get());

        String name = "AAA";
        Supplier<Character> s3 = ()->{
            System.out.println(name);
            return name.charAt(0);
        };

        System.out.println(s3.get());

        Function<String, Integer> parse = strDate ->{
            Integer numData = Integer.parseInt(strDate);
            return numData;
        };

        System.out.println(parse.apply("1000"));

        Predicate<String> p1 = data ->{
            if(data.equals("hello")){
                return true;
            }
            return false;
        };

        System.out.println(p1.test("hello"));

    }
}
