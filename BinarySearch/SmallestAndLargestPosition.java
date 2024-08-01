package com.posh;

import java.util.Arrays;

public class SmallestAndLargestPosition {
    public static void main(String[] args) {
        int arr[]={5,7,7,7,7,8,8,10};

        int[] sol= searchRange(arr,25);
        System.out.println(Arrays.toString(sol));


    }

     public static int[] searchRange(int[] arr,int target){
        int[] ans={-1,-1};
        int s =start(arr,target,true);
        int e =start(arr,target,false);
        ans[0]=s;
        ans[1]=e;
        return ans;
    }
    static int start(int[] arr,int target,boolean start){
        int s=0;
        int a=-1;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]>target){
                e=mid-1;
            }
            else if (arr[mid]<target){
                s=mid+1;
            }
            else{
                a=mid;
                if(start){
                    e=mid-1;
                }
                else
                    s=mid+1;
            }
        }
        return a;
    }
}
