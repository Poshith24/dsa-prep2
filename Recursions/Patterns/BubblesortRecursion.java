package com.posh.Recursions.Patterns;

import java.util.Arrays;

public class BubblesortRecursion {
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        BubbleRecursion2(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleRecursion(int[] arr,int i,int j,int last){
        if (last==0){
            return;
        }
        if (i<last){
             if (arr[i]>arr[j]){
                     int temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
            }
            BubbleRecursion(arr,i+1,j+1,last);
        }
        else{
            BubbleRecursion(arr,0,1,last-1);
        }


    }

    static void BubbleRecursion2(int[] arr,int i,int last){
        if (last==0){
            return;
        }
        if (i<last){
            if (arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            BubbleRecursion2(arr,i+1,last);
        }
        else{
            BubbleRecursion2(arr,0,last-1);
        }


    }
}
