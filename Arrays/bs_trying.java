package com.posh.Arrays;

public class bs_trying {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,9,15};
        System.out.println(bs(arr,2));

    }

    static int bs(int[] arr,int target){

        int s =0;
        int e = arr.length-1;
        boolean isAc = arr[s]<arr[e];
        while(s<=e){
            int mid =(s+e)>>1;
            if(arr[mid]==target){
                return mid;
            }
            if(isAc){
                if(arr[mid]>target){
                    e = mid-1;
                }
                else if(arr[mid]<target){
                    s = mid +1;
                }

            }
            else{
                if(arr[mid]>target){
                    s = mid +1;
                }
                else if(arr[mid]<target){
                    e = mid-1;
                }
            }
        }
        return -1;
    }
}
