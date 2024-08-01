package com.posh;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicates_in_Array {

    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        List<Integer> ans =findDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static List<Integer> findDuplicates(int[] nums) {
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
                ans.add(nums[j]);
            }
        }
        return ans;
    }
}
