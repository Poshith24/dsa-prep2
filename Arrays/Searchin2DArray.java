package com.posh;

import java.util.Arrays;

import static java.lang.Integer.MIN_VALUE;

public class Searchin2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {3,42,1},
                {48,25,39,58},
                {5,68,20,25,40}
        };
//        int target=40;
       int  ans=max(arr);
       int max=34;
        System.out.println(ans);
        System.out.println(MIN_VALUE);
    }

    static int max(int[][] arr){

        int max=MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }

            }
        }
        return max;

    }


//    static int[] search(int[][] arr,int target){
//
//        for (int rowno = 0; rowno < arr.length; rowno++) {
//            for (int colno = 0; colno < arr[rowno].length; colno++) {
//                if (arr[rowno][colno]==target){
//                    return new int[]{rowno,colno} ;
//
//                }
//
//            }
//        }
//        return new int[]{-1,-1};
//
//    }
}
