package study.ch10.entity;

import java.util.Arrays;

public class Ex30 {
    public static void main(String[] args) {
        // 대각선의 합
        int[][] nums = {{1, 2, 3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int mainCross = 0;
        int subCross = 0;
        for(int i =0, j= 0; i < nums.length && j < nums[i].length; i++, j++)
        {
            mainCross += nums[i][j];
        }
        for(int i = nums.length - 1, j= 0; i >= 0 && j < nums[i].length; i--, j++)
        {
            subCross += nums[i][j];
        }

        for(int i =0 ; i < nums.length; i++)
        {
            System.out.println(Arrays.toString(nums[i]));
        }
        System.out.println(mainCross);
        System.out.println(subCross);
    }
}
