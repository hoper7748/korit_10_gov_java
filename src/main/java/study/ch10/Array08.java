package study.ch10;

public class Array08 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        for(int i = 0; i < nums.length; i++)
        {
            int num = nums[i];
            System.out.println(num);
        }

        for(int num : nums)
        {
            System.out.println(num);
        }

        String[] names = {"Hello", "World", "!"};

        for(String str : names)
        {
            System.out.println(str);
        }

        for(int i =0 ; i < nums.length; i++)
        {
            nums[i] = nums[i] * 10;
        }

        for(int num : nums)
        {
            num *= 1000;
        }

        for(int num : nums)
        {
            System.out.println(num);
        }

    }
}
