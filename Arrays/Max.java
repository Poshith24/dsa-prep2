package com.posh;

public class Max {
    public static void main(String[] args) {

        int[] arr={22,3,9,72,25};
        System.out.println(maxRange(arr,0,2));

    }

    static int maxRange(int[] nums,int start,int end){
        int max=nums[start];
        for (int i = start; i <= end; i++) {
            if(nums[i]>max){
                max=nums[i];
            }
        }

        return max;
    }



    static int max(int[] nums){
        int max=nums[0];
        for (int i = 1; i < nums.length; i++) {
             if(nums[i]>max){
                 max=nums[i];
             }
        }

        return max;
    }
}
