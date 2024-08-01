package com.posh;
// https://leetcode.com/problems/first-missing-positive/
import java.util.Arrays;

public class Missing_Smallest_Positive_Number {

    public static void main(String[] args) {
        int[] arr={2,2};
        int ans=Missing(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int Missing(int[] nums){
        if (nums.length==1){
            if(nums[0] != 1){
                return 1;
            }
            else{
                return 2;
            }
        }
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if (nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct]) {
               swap(nums,i,correct);
            }
            else {
                 i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] !=j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
}
