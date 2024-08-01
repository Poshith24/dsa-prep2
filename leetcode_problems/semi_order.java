package com.posh.leetcode_problems;

public class semi_order {
    public static void main(String[] args) {
        System.out.println(semiOrderedPermutation(new int[]{2,1}));
    }

    public static int semiOrderedPermutation(int[] nums) {
        int e= nums.length-1;
        int i,j;
        if(nums[0]==1 && nums[e]==e+1){
            return 0;
        }
        else if(nums[0]==1 && nums[e]!=e+1){
            j=getIndex(nums,e+1);
            return e-j;
        }
        else if(nums[0]!=1 && nums[e]==e+1){
            i=getIndex(nums,1);
            return i;
        }
        else if(nums[0]==e+1 && nums[e]==1){
            return nums.length;
        }
        else{
            for(int k=0;k<e;k++){
                if(nums[k]==e+1 && nums[k+1]==1){
                    return e;
                }
                else if(nums[k]==1 && nums[k+1]== e+1){
                    return e-1;
                }
            }
        }
        return -1;
    }

    public static int getIndex(int[] nums,int val){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                return i;
            }
        }
        return -1;
    }
}
