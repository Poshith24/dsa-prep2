package com.posh.Recursions.Arrays;

public class RotatedSearch {
    public static void main(String[] args) {
        int[] arr ={5,6,7,8,9,1,2,3};
        System.out.println(RotatedBS(arr,34,0,arr.length-1));
    }

    static int RotatedBS(int[] arr,int target,int s,int e){
        if (s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (arr[mid]>=arr[s]){
            if (arr[s]<=target && arr[mid]>=target){
               return  RotatedBS(arr,target,s,mid);
            }
            else{
                return RotatedBS(arr,target,mid+1,e);
            }
        }

            if (arr[mid]<=target && arr[e]>=target){
               return  RotatedBS(arr,target,mid,e);
            }

               return RotatedBS(arr,target,s,mid-1);


    }
}
