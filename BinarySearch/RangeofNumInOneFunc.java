package com.posh;

import java.util.Arrays;

public class RangeofNumInOneFunc {
    public static void main(String[] args) {
        int[] arr={1,1,3,5,5,7,9,9,10};
        int target=1;
        int[] ans=Range_max(arr,target);
//        int a= Range_min(arr,target);
//        int b=Range_max(arr,target);
//        int[] c={a,b};
//
        System.out.println(Arrays.toString(ans));

    }

    static int[] Range_max(int[] nums,int target){
        int s=0;
        int e=nums.length-1;
        int mid=0;
        int[] a= {-1,-1};

        if (nums[e]==target){
             a[1]=e;
        }
        while(s<=e){
            mid=s+(e-s)/2;
            if (nums[mid]==target){
                if (nums[mid+1]!=target){
                    a[1]=mid;
                    break;
                }
                else{
                    s=mid+1;
                }
            }
            if (nums[mid]>target){
                e=mid-1;
            }
            if(nums[mid]<target){
                s=mid+1;
            }
        }
        s=0;
         e=nums.length-1;
          mid=0;
        if (nums[s]==target){
             a[0]=s;
        }
        s=1;
        while(s<=e){
            mid=s+(e-s)/2;
            if (nums[mid]==target){
                if(nums[mid-1]!=target){
                     a[0]=mid;
                     break;
                }
                else
                {
                    e=mid-1;
                }
            }
            if (nums[mid]>target){
                e=mid-1;
            }
            if (nums[mid]<target){
                s=mid+1;
            }
        }
        return a;
    }
}
