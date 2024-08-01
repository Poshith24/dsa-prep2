package com.posh.DP;
import java.util.*;
// https://www.naukri.com/code360/problems/maximum-sum-of-non-adjacent-elements_843261?interviewProblemRedirection=true
public class non_adj_sum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(1);
        list.add(9);
        System.out.println(func(list));
    }

    public static int func(ArrayList<Integer> nums){

        int res = Integer.MIN_VALUE;
        for(int i=0;i<nums.size()-2;i++){
            int sum =nums.get(i);
            for(int j=i+2;j<nums.size();j+=2){
                sum+=nums.get(j);
            }
            res = Math.max(res,sum);
        }
        return res;
    }
}

