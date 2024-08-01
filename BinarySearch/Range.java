package com.posh;

import java.util.Arrays;

public class Range {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,5,7,7,9,9,23,25,25,29};
        int target=30;

        int a=min(arr,target);
        int b=max(arr,target);
        int[] ans={a,b};
        System.out.println(Arrays.toString(ans));

    }
    static int max(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        if (arr[e]==target){
            return e;
        }
        if (arr[s]>target){
            return -1;
        }
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]==target){
                if (arr[mid+1]!=target){
                    return mid;

                }
                else
                    s=mid+1;
            }
            if (arr[mid]>target){
                e=mid-1;
            }
            if (arr[mid]<target){
                s=mid+1;
            }
        }

        return s;
    }
    static int min(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        if (arr[s]==target){
            return s;
        }
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]==target){
                if (arr[mid-1]!=target){
                    return mid;
                }
                else
                    e=mid-1;
            }
            if (arr[mid]>target){
                e=mid-1;
            }
            if (arr[mid]<target){
                s=mid+1;
            }
        }
        return e;

    }
}
