package com.posh;

public class LinearSearchRange {
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};

        System.out.println(Range(arr,1,4,28));

    }
    static int Range(int[] nums,int start,int end,int target){

        if(nums.length==0){
            return -1;
        }
        for (int i = start; i <= end; i++) {

            if(nums[i]==target){
                return i;
            }

        }
        return -1;

    }
}
