package com.posh;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int min(int[] arr,int s,int e){
        int min=e;
        for (int i = s; i <=e; i++) {
            if (arr[i]<arr[min]){
                min= i;
            }
        }
        return min;
    }

    static int max(int[] arr,int s,int e){

        int max=s;
        for (int i = 1; i <= e; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }

        return max;
    }

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sort(int[] arr){
        // Selection sorting by placing max element of the Range in correct position.
        for (int i = 0; i < arr.length-1; i++) {
            int last=arr.length-i-1;
            int max_index=max(arr,0,last);
             swap(arr,max_index,last);
        }

         // Selection sorting by placing min element of the Range in correct position.
//        for (int i = 0; i < arr.length-1; i++) {
//            int min_index=min(arr,i,arr.length-1);
//            int s=i;
//             swap(arr,min_index,i);
//        }
    }
}
