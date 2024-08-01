package com.posh.Recursions;

public class Binary_Search {
    public static void main(String[] args) {

        int[] arr={25,36,89,115,245,399};
        System.out.println(Search(arr,245,0,arr.length-1));
    }

    static int Search(int[] arr,int target,int s,int e){

        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;

        if (arr[mid]== target){
            return mid;
        }
        if(arr[mid]> target){
            return Search(arr,target,s,mid-1);
        }
        return Search(arr,target,mid+1,e);

    }
}
