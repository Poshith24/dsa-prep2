package com.posh.Recursions.Arrays;

public class BSRotated {
    public static void main(String[] args) {
        int[] arr={10,20,30,45,50,60,4,6};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr){
        int s=0;
        int e = arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
           if (m>0 && m< arr.length-1){
               if (arr[m]>arr[m-1] && arr[m]>arr[m+1]){
                   return arr[m+1];
               }
           }
            if (m>0){
                if (arr[m]<arr[m-1]){
                    e=m-1;
                }
            }
            if (m<arr.length-1){
                if (arr[m]<arr[m+1]){
                    s=m+1;
                }
            }
        }
        return -1;
    }
}
