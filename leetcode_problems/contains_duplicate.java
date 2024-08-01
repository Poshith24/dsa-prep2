package com.posh.leetcode_problems;

public class contains_duplicate {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,2,3,4,5},3,0));
    }

    static boolean containsNearbyDuplicate(int[] nums, int k,int val_diff) {
        int t = k;
        while(val_diff>=0){
        while(t>0){

                for(int i=0;i<nums.length-t;i++){
                    if(Math.abs(nums[i]-nums[i+t])<=val_diff){
                        return true;
                    }
                }
            t--;

            }
            val_diff--;


        }


        return false;
    }
}
