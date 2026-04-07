package study.ch19;

import lombok.Getter;

import java.util.Arrays;

@Getter
public class SimpleArrayList {
    private String[] strs;

    public SimpleArrayList()
    {
        strs = new String[0];
    }

    public void add(String str) {
        String[] newStrs = new String[strs.length + 1];
        for (int i =0; i < strs.length; i++) {
            newStrs[i] = strs[i];
        }
        newStrs[strs.length] = str;

        this.strs = newStrs;
    }

    public String pop(){
        String target;
        if(strs.length == 0)
        {
            System.out.println("Pop을 수행할 데이터가 존재하지 않습니다.\n다시 한번 확인해 주세요.");
            return null;
        }
        String[] newStrs = new String[strs.length - 1];
        target = strs[strs.length - 1];
        for(int i = 0 ; i < strs.length - 1; i++){
            newStrs[i] = strs[i];
        }
        this.strs = newStrs;
        return target;
    }

    public void add(int index, String str) {
        if(index > strs.length ) {
            System.out.println("추가할 수 없는 위치에 삽입된 데이터입니다.");
        }
        String[] newStrs = new String[strs.length + 1];
        /**
        for(int i = 0, j = 0; i < strs.length + 1; i++, j++) {
            if(i == index) newStrs[j++] = str;
            else newStrs[j] = strs[i];
        }
        **/
        // 강사님 정답
        for(int i = 0; i < strs.length; i++)
        {
            int currentIndex = i < index ? i : i + 1;
            newStrs[currentIndex] = strs[i];
        }
        newStrs[index] = str;
        strs = newStrs;
    }

    public void remove(int index) {
        if (strs.length < 1){
            return;
        }
        String[] newStrs = new String[strs.length - 1];
        for(int i = 0 ; i < strs.length - 1; i++) {
            int currentIndex = i < index ? i : i + 1;
            newStrs[i] = strs[currentIndex];

        }
        this.strs = newStrs;
    }

    public void remove(String str)
    {
        int index = 0;
        for(index = 0; index < strs.length; index++) {
            if(strs[index].equals(str)) break;
        }
        if(index == strs.length) {
            System.out.println("해당 값이 존재하지 않습니다");
            return; // 해당 값이 존재하지 않음
        }
        remove(index);

//        String[] newStrs = new String[strs.length - 1];
//        for(int i = 0 ; i < strs.length - 1; i++) {
//            int currentIndex = i < index ? i : i + 1;
//            newStrs[i] = strs[currentIndex];
//
//        }
    }
}


class SimpleArrayListMain{
    public static void main(String[] args) {
        SimpleArrayList list = new SimpleArrayList();
        list.add("1");
        list.add("2");
        list.add(1, "3");
        list.add("4");
        System.out.println(Arrays.toString(list.getStrs()));
        list.pop();
        System.out.println(Arrays.toString(list.getStrs()));
        list.remove(2);
        System.out.println(Arrays.toString(list.getStrs()));

    }
}
