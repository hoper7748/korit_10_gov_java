package study.ch10.entity;

import java.util.Arrays;

public class Ex31 {

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9,10, 11, 12}, {13,14,15,16}};

        for(int i= 0 ; i < nums.length; i++)
        {
            for(int j = 0 ; j < nums[i].length; j++)
            {
                // 아피차야 차이파따마
                nums[i][j] = i + 1 + (j * nums.length);
            }
        }

        for(int i = 0; i < nums.length ;i++)
        {
            System.out.println(Arrays.toString(nums[i]));
        }

    }
}
