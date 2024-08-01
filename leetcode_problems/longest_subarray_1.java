package com.posh.leetcode_problems;

import java.util.ArrayList;

// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
public class longest_subarray_1 {

    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{1,1,0,1}));
    }

    public static int longestSubarray(int[] nums) {
        boolean flag = false;
        boolean zeroflag = false;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=1){
                flag=true;
            }
            else{
                zeroflag = true;
            }
        }
        if(!zeroflag){
            return 0;
        }
        if(flag){
            ArrayList<Integer> sum = new ArrayList();
            int count=0;
            int zerocount =0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    if(count>0){
                        sum.add(count);
                        count=0;
                    }
                    else{
                        zerocount++;
                    }
                }
                else{
                    if(zerocount>0){
                        sum.add(0);
                        zerocount=0;
                    }
                    count++;
                }
            }
                if(count>0){
                    sum.add(count);
                }
            if(sum.size()==1){
                return sum.get(0);
            }
            int max =0;
            for(int i=0;i<sum.size()-1;i++){
                if(sum.get(i)+sum.get(i+1)>max){
                    max = sum.get(i)+sum.get(i+1);
                }
            }
            return max;
        }
        return nums.length-1;

    }
}
