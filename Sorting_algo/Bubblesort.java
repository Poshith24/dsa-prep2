package com.posh.Sorting_algo;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            for (int j = 0; j < arr.length-(i+1); j++) {
                 int k=j+1;
                 if (arr[k]<arr[j]){
                     int temp=arr[k];
                     arr[k]=arr[j];
                     arr[j]=temp;
                     swapped=true;
                 }
            }
            if (!swapped){
                break;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
