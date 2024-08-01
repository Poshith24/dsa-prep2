package com.posh;
// https://leetcode.com/problems/missing-number/
import java.util.Arrays;

public class MissingCircleSort {
    public static void main(String[] args) {
        int[] arr={4,0,2,1};
        int ans=Missing(arr);
        System.out.println( ans);
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int Missing(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i];

            if (correct == nums.length || i==correct) {
                i++;
            }
            else {
               swap(nums,i,correct);
            }
        }
        int x=0,y=0 ;
        int ans=0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=j){
                ans=j;
                break;
            }
            if(nums[j]==nums.length){
                x++;
            }
        }
        if (x==0){
             ans=nums.length;
        }
        return ans;
    }
}
