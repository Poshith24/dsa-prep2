package com.posh.sorting;

import java.util.Arrays;

public class insertion {

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int i,int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void insertion(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i]<arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }
}
