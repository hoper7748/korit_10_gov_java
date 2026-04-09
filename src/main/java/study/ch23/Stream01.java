package study.ch23;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.zip.CheckedOutputStream;


@AllArgsConstructor
class CustomStream<T, R>{
    private List<T> list;
    public List<R> map(Function<T, R> function){
        List<R> newList = new ArrayList<>();
        for ( T data : list){
            newList.add(function.apply(data));
        }

        return newList;
    }
}

public class Stream01 {
    public static void main(String[] args) {
        List<String> strNums = List.of("1","2","3","4","5");

        List<Integer> nums = new ArrayList<>();
        for(String str : strNums)
        {
            nums.add(Integer.parseInt(str));
        }

        System.out.println(nums);

        System.out.println(strNums.stream().map(str -> Integer.parseInt(str) * 10).toList());


        CustomStream<String, Integer> customStream = new CustomStream<>(strNums);
        Function<String, Integer> f=  str->Integer.parseInt(str )* 10;
        List<Integer> num2 = customStream.map(f);
        System.out.println(new CustomStream<>(strNums).map(str->  Integer.parseInt(str) + 10));

        CustomStream<String, String> customStream2 = new CustomStream<>(List.of("AA","BB","CC"));

        System.out.println(customStream2.map (name -> "A" + name));
        System.out.println(List.of("AA","BB","CC").stream().map(name->"A" + name).toList());

    }
}
