package com.posh.leetcode_problems.daily_leetcode;

public class minops_20_09_23 {
    public static void main(String[] args) {

        int[] nums = {3,2,20,1,1,3};
        System.out.println(minOperations(nums,10));
    }

    public static int minOperations(int[] nums, int x) {
//        int z = minops(nums,x,0,0,nums.length-1,0);
//        return z==Integer.MAX_VALUE? -1:z;
        int numsum = 0;
        for (int num : nums) {
            numsum += num;
        }
        int ans = nums.length + 1;
        int targetSum = numsum - x;

        int windowStart = 0;
        int windowSum = 0;
        int minWindowSize = nums.length + 1;

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd];

            while (windowSum > targetSum && windowStart <= windowEnd) {
                windowSum -= nums[windowStart];
                windowStart++;
            }

            if (windowSum == targetSum) {
                int windowSize =nums.length-( windowEnd - windowStart + 1);
                if (windowSize < minWindowSize) {
                    minWindowSize = windowSize;
                }
            }
        }

        // if (minWindowSize != nums.length + 1) {
        //     ans = minWindowSize;
        // }

        return minWindowSize==nums.length+1?-1:minWindowSize;
    }

    private static int minops(int[] nums,int x,int sum,int s,int e,int count){

        int count1 = Integer.MAX_VALUE;
        int count2 = Integer.MAX_VALUE;
        if(s<nums.length){
            if(sum+nums[s]==x){
                count1 = count+1;
            }
            else if(sum+nums[s]<x){

                count1 = minops(nums,x,sum+nums[s],++s,e,++count);
            }

        }
        System.out.println(sum);

        if(e>=0){
            if(sum+nums[e]==x){
                count2 = count+1;
            }
            else if(sum+nums[e]<x){
                count2 = minops(nums,x,sum+nums[e],s,--e,++count);
            }
        }
        return Math.min(count1,count2);
    }
}
