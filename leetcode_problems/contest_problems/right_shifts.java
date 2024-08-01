package com.posh.leetcode_problems.contest_problems;

import java.util.*;

public class right_shifts {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        System.out.println(minimumRightShifts(nums));

    }

    public static int minimumRightShifts(List<Integer> nums) {
        int s = 0;
        int e = nums.size();
        int x = s+e>>1;
        while(s<=e){
            int m = s+e>>1;
            if(m!=0 && m!=nums.size()-1){

                if(nums.get(m)>nums.get(m-1) && nums.get(m)>nums.get(m+1)){
                    x=m;
                    break;
                }
                else{
                    s++;
                    e--;
                }
            }

        }
        if(check_sorted(nums,0,nums.size()-1)){
            return 0;
        }
        else if(check_sorted(nums,0,x) && check_sorted(nums,x+1,nums.size()-1)){
            return nums.size()-x-1;
        }
        return -1;
    }

    public static boolean check_sorted(List<Integer> list,int startIndex,int endIndex){
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;

    }
}
