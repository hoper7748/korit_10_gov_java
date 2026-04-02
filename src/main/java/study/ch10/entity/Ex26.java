package study.ch10.entity;

import java.util.Arrays;

public class Ex26 {
    public static void main(String[] args) {
        int[][] nums = new int[3][3];
        int[] colSums = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                nums[i][j] = j + 1 + (i * nums[i].length);
            }
        }

        for(int i =0 ; i < nums.length;i ++)
        {
            System.out.println(Arrays.toString(nums[i]));
        }

        int[][] nums2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        for(int i =0 ; i < nums2.length; i++)
        {
            for(int j = 0; j < nums2[i].length;j++)
            {
                colSums[j] += nums2[i][j];
            }
        }
        System.out.println(Arrays.toString(colSums));

    }
}
