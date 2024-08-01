package com.posh;

import java.util.Arrays;

public class RangeofNum {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,9,11,13,15,15,17,17,19,21,23,25,25,27};
        int target=25;
        int a= Range_min(arr,target);
        int b=Range_max(arr,target);
        int[] c={a,b};

        System.out.println(Arrays.toString(c));

    }

    static int Range_max(int[] nums,int target){
        int s=0;
        int e=nums.length-1;
        int mid=0;
        if (nums[e]==target){
           return e;
        }


        while(s<=e){


            mid=s+(e-s)/2;

            if (nums[mid]==target){
                if (nums[mid+1]!=target){
                      return mid;
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
        return -1;
    }

    static int Range_min(int[] nums,int target){

        int s=0;
        int e=nums.length-1;
        int mid=0;
        if (nums[s]==target){
            return s;
        }
        s=1;

        while(s<=e){
            mid=s+(e-s)/2;

            if (nums[mid]==target){
                if(nums[mid-1]!=target){
                    return mid;
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
      return -1;
    }


}
