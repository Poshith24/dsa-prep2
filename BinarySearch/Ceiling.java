package com.posh;

public class Ceiling {
    public static void main(String[] args) {

        int[] arr={2,3,5,9,14,16,18};
        int target=19;
        int ans=search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] arr,int target){
        int s=0;
        int e=arr.length-1;

        if(target > arr[e]){
            return -1;
        }
//
//        if(target<arr[s]){
//            return -1;
//        }
        while (s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return target;
            }

            if (arr[mid]>target){
                e=mid-1;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
        }

        // When while loop ends: end, target, start .. So the next big no after target is start element..
        // return arr[s]; // return ceiling: It returns smallest number which is greater than target.

        // When while loop ends:  end, target, start .. So the previous smallest no before target is end element..

        return e; // return floor : It returns biggest number which is smaller than target.
    }
}
