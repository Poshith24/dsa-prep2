package com.posh.Arrays;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {

        int[] arr={25,3,71,49,33};
        System.out.println(Arrays.toString(arr));


        swap(arr);
//        for (int i = 0; i < 3; i++) {
//            swap(arr,i,4-i);
//        }
        System.out.println( Arrays.toString(arr));

    }

    static void swap(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] nums,int a,int b){
       int temp= nums[a];
       nums[a]=nums[b];
       nums[b]=temp;
    }
}
