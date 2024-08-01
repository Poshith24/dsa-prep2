package com.posh;
// https://leetcode.com/problems/set-mismatch/submissions/
import java.util.Arrays;

public class mismatch {
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        int[] ans=findErrorNums(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int[] findErrorNums(int[] nums){

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
        int[] ans=new int[2];
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=j+1){
                ans[0]=nums[j];
                ans[1]=j+1;
            }
        }
        return ans;
    }
}
