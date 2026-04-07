package study.ch18.example;

import java.util.ArrayList;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for(int i =0 ; i < 20; i++)
        {
            arrayList.add(i + 1);
        }

        for(int i = arrayList.size() - 1; i >= 0; i--)
        {
            if(arrayList.get(i) % 3 == 0)
                System.out.println(arrayList.get(i));
        }
    }
}
