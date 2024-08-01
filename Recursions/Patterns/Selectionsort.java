package com.posh.Recursions.Patterns;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        selection2(arr,0,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static int max(int[] arr,int last){
        int max=0;
        for (int i = 1; i <= last; i++) {
            if (arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

    static void selection(int[] arr,int last){
        if (last==0){
            return;
        }
        int m=max(arr,last);
        swap(arr,m,last);
        selection(arr,last-1);
    }

    static void selection2(int[] arr,int i,int m,int last){
        if (last==0){
            return;
        }
       if (i<=last){
           if (i==last){
               swap(arr,m,last);
               selection2(arr,0,0,last-1);
           }
           else if (arr[i]>arr[m]){
               m=i;
           }
           selection2(arr,i+1,m,last);
       }
    }
}
