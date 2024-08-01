package com.posh;

import java.util.Arrays;

public class circle {
    public static void main(String[] args) {
        int[] arr={5,4,2,1};
        circleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void circleSort(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=i+1;
//        }
        int i=0;
        while(i<arr.length){
            int correct_index=arr[i]-1;
            if (i == correct_index){
                 i++;
            }
            else{

                swap(arr,i,correct_index);
            }
        }
    }
}
