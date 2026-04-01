package study.ch10;

public class Array04 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40};

//        System.out.println(nums [0]);
//        System.out.println(nums [1]);
//        System.out.println(nums [2]);
//        System.out.println(nums [3]);
        System.out.println("배열의 크기: " + nums.length);

        for(int num : nums)
        {
            System.out.println(num);
        }

        // 새로운 nums2 배열을 비어있는 크기 4로 생성
        // nums에 있는 값들을 각 인덱스에 맞게 10씩 곱하여 대입 후 전체 출력
        int[] nums2 = new int[4];
        for(int i =0 ; i < nums.length; i++)
        {
            nums2[i] = nums[i] * 10;
        }
        for(int i =0 ; i < nums.length; i++)
        {
            System.out.println(nums2[i]);
        }
    }
}
