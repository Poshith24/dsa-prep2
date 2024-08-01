package com.posh;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={35,-1,0,2,-38};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

//    static void insertion(int[] arr){
//
//        for (int i = 1; i < arr.length; i++) {
//            int index=i;
//            for (int j = 0; j < index; j++) {
//                if (arr[index]<arr[j]){
//                    swap(arr,index,j);
//                }
//            }
//        }
//    }

    static void insertion(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) {
           int j=i+1;
           while(j>0){
               if (arr[j]<arr[j-1]){
                   swap(arr,j,j-1);
                   j--;
               }
               else{
                   break;
               }
           }
        }
    }
}
