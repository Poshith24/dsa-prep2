package com.posh;
// https://leetcode.com/problems/find-the-duplicate-number/
import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        int ans=findDuplicate(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static int findDuplicate(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=i+1){
                if (nums[i]==nums[correct]){
                    return nums[i];
                }
                else{
                    swap(nums,i,correct);
                }
            }
            else{
                i++;
            }
        }
        return -1;
//        int ans=0;
//        for (int j = 0; j < nums.length; j++) {
//            if (nums[j]!=j+1){
//                ans=nums[j];
//            }
//        }
//        return ans;
    }
}

