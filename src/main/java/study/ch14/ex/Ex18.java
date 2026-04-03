package study.ch14.ex;

import java.util.Arrays;

interface Sortable {
    void sort();
    void printResult();
}

class NumberSorter implements Sortable {

    int[] ints;
    public NumberSorter(){}
    public NumberSorter(int[] ints)
    {
        this.ints = ints;
    }

    @Override
    public void sort() {
        for(int i = 0 ; i < ints.length; i++)
        {
            for(int j = i + 1 ; j < ints.length; j++)
            {
                int temp = 0;
                if(ints[i] > ints[j])
                {
                    temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
    }

    @Override
    public void printResult() {
        System.out.println(Arrays.toString(ints));
    }
}
class StringSorter implements Sortable{
    private String[] strings;

    public StringSorter(){}
    public StringSorter(String[] strings)
    {
        this.strings = strings;
    }

    @Override
    public void sort() {
        Arrays.sort(strings);
    }

    @Override
    public void printResult() {
        System.out.println(Arrays.toString(strings));
    }
}

public class Ex18 {

    public static void main(String[] args) {
        int[] ints = {3, 2, 5, 1, 4, 7, 6};
        String[] strs = {"BB", "CC", "HH", "GG", "AA", "DD", "EE"};
        NumberSorter nsort = new NumberSorter(ints);
        StringSorter ssort = new StringSorter(strs);

        nsort.sort();;
        nsort.printResult();
        ssort.sort();
        ssort.printResult();
    }
}
