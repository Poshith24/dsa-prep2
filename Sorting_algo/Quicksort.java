package com.posh.Sorting_algo;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
//        quicksort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
    }
    static void quicksort(int[] arr,int s,int e){
        int low =s;
        int high =e;
        if (e-s==0 || e-s==1){
            return;
        }
        int mid=s+(e-s)/2;
        int pivot = arr[mid];
        while(s<=e){
            // also a reason why if its already sorted it will not swap.
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if (s<=e){
                    int temp=arr[s];
                    arr[s]=arr[e];
                    arr[e]=temp;
                    s++;
                    e--;
            }
        }
        quicksort(arr,low,e);
        quicksort(arr,s,high);
    }
}
