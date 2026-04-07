package study.ch19;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        // 값 추가
        numList.add(100);

        // 해당인덱스에 값 추가
        numList.add(0, 200);

        // 값 조회
        Integer n1 = numList.get(1);
        System.out.println(n1);

        // 한번에 여러값 추가
        ArrayList<Integer> numList2 = new ArrayList<>();
        numList2.add(1000);
        numList2.add(2000);
        numList2.add(3000);
        numList.addAll(numList2);
        System.out.println(numList);
        numList.addAll(1, numList2);

        System.out.println(numList);

        boolean hasFound = numList.contains(4000);

        System.out.println(hasFound);

        for(int i = 0; i < numList.size(); i++) {
            System.out.println(numList.get(i));
        }

        for(Integer num : numList){
            System.out.println(num);
        }
        List<String>strList = new ArrayList<>();

        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");
        strList.add("e");

        List<String> strList2 = new LinkedList<>();

        strList2.add("a");
        strList2.add("b");
        strList2.add("c");
        strList2.add("d");
        strList2.add("e");
        System.out.println(strList2);

        // 추가 수정이 없는 데이터 리스트를 만들 때 사용하는  List.of
        List<String> imStrList = List.of("a", "b", "c", "d");
//        imStrList.add("e");
        System.out.println(imStrList);
        // 이렇게 하면 상수로 만든 imStrList를 얕은 복사하여 nonImStrList에 넣어 가변 List를 만들 수 있게 된다.
        List<String> nonImStrList = new ArrayList<>();
        nonImStrList.addAll(imStrList);
        System.out.println(nonImStrList);

        List<String> nonImStrList2 = new ArrayList<>(List.of("a","b","c","d","e"));
        System.out.println(nonImStrList2);
    }
}
