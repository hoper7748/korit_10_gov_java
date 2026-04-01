package study.ch10;

import java.util.Random;

public class Array06 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Random random = new Random();
        for(int i = 0 ; i < nums.length; i++)
        {
            nums[i] = random.nextInt(100) + 1;
        }

        for(int n : nums)
        {
            System.out.println(n);
        }

        int max  =0, min = 9999;
        // nums에 저장된 랜덤한 숫자 중 최대값과 최소값을 각각 구하시오
//        for(int n : nums)
//        {
//            max = n > max ? n : max;
//            min = n < min ? n : min;
//        }

//        for(int i =0 ; i < nums.length; i++)
//        {
//            max = nums[i] > nums[i + 1]
//                    ? nums[i] > nums[i + 2]
//                    ? nums [i] > nums[i + 3]
//                    ? nums[i] : nums[i + 3] : nums[i + 2] : nums[i + 1];
//        }

        System.out.println("최대값: " +max);
        System.out.println("최대값: " +min);
    }
}
