package com.posh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class Missed_numbers_cyclesort {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        List<Integer> ans =Missing(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static List<Integer> Missing(int[] nums){
       int i=0;
       while(i<nums.length){
           int correct=nums[i]-1;
           if (nums[i]!=nums[correct]){
               swap(nums,i,correct);
           }
           else{
                i++;
           }
       }
       List<Integer> ans=new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=j+1){
                 ans.add(j+1);
            }
        }
        return ans;
//       int count=0;
//        for (int j = 0; j < nums.length; j++) {
//            if (nums[j]!=j+1){
//                count++;
//            }
//        }
//        int[] ans=new int[count];
//        int l=0;
//        for (int k = 0; k < nums.length; k++) {
//            if (nums[k]!=k+1){
//                ans[l]=k+1;
//                l++;
//            }
//        }
//        return ans;
    }
}
