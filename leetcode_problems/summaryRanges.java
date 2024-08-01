package com.posh.leetcode_problems;


import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/summary-ranges/
public class summaryRanges {

    public static void main(String[] args) {
            int[] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        if(nums.length<1){
            return list;
        }
        if(nums.length==1){
            list.add(String.valueOf(nums[0]));
        }
        int start = nums[0];
        int last=nums[0];
        for(int i=0;i<=nums.length-1;i++){
            if(i!=nums.length-1 && nums[i+1]==nums[i]+1){
                last=nums[i+1];
            }
            else{
                if(start!=last){
                    list.add(String.valueOf(start)+"->"+String.valueOf(last));
                }
                else{
                    list.add(String.valueOf(start));
                }
                if(i!=nums.length-1){
                    start=nums[i+1];
                    last=nums[i+1];
                }


            }
        }
//        if(last!=nums[nums.length-1]){
//            list.add(String.valueOf(nums[nums.length-1]));
//        }
        return list;

    }
}
