package com.posh.leetcode_problems;

// https://leetcode.com/problems/reverse-integer/

import java.util.Arrays;

public class rev_no {

    public static int rev(int x){
        int[] arr = {1,5,89,2,111};
        Arrays.sort(arr);
        System.out.println();
        long ans =0;
        boolean flag=false;
        int count=0;
        if(x<0){
            flag=true;
            x*=-1;
        }
        int n=x;
        while(n>0){
            n/=10;
            count++;
        }
        while(x>0){
            int rem = x%10;
            ans+=rem*pow(10,count-1);
            count--;
            x=x/10;
        }
        if(flag){
            ans*=-1;
        }
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE){
            return 0;
        }
        return (int)ans;
    }

    private static long pow(int a, int b) {
        long y =1;
         for(int i=0;i<b;i++){
             y*=a;
         }
         return y;
    }


    public static void main(String[] args) {
        int z = 1534236469;

        System.out.println(rev(1534236469));
//        if( z>Integer.MAX_VALUE || z< Integer.MIN_VALUE){
//            System.out.println("yes");
//        }
    }
}
