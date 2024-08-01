package com.posh;

public class Min {
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        System.out.println("The minimum of the array is "+min(arr));

    }
    static int min(int[] nums){

        int min=nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}
