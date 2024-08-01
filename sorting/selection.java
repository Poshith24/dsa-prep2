package com.posh.sorting;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
         selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int i,int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int max_in = max(arr,arr.length-i-1);
            if(max_in != arr.length-i-1){
                swap(arr,max_in,arr.length-i-1);
            }
        }
    }

    static int max(int[] arr,int j){

        int max_in =0;
        for (int i = 1; i < j; i++) {
            if(arr[max_in]<arr[i]){
                max_in = i;
            }
        }
        return max_in;
    }
}
