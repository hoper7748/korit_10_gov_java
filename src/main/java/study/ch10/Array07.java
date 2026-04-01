package study.ch10;

import java.util.Arrays;

public class Array07 {

    public static void BubbleSorting(int[] array)
    {
        int j, i;
        int temp;
        for(i =0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }



    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 4, 1};
        int[] sortedNums = nums.clone();

        BubbleSorting(sortedNums);

        System.out.println(Arrays.stream(nums).boxed().toList());
        System.out.println(Arrays.stream(sortedNums).boxed().toList());
    }
}
