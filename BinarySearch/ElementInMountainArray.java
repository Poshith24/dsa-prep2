package com.posh;
// https://leetcode.com/problems/find-in-mountain-array/
public class ElementInMountainArray {
    public static void main(String[] args) {
        int[] arr={3,5,3,2,0};
        search(arr,2);

    }

  static void search(int[] arr,int target){

        int peak=PeakOfMountain(arr);


        int firstTry=BinarySearch(arr,target,0,peak);
        int SecondTry=BinarySearch(arr,target,peak,arr.length-1);
        if (firstTry!=-1){
            System.out.println(firstTry);
        }
        else
            System.out.println(SecondTry);

    }

   static int BinarySearch(int[] arr,int target,int s,int e){

        boolean isAc=arr[s]<arr[e];
        while (s<=e){
            int mid=s+(e-s)/2;
            if (isAc==true){
                if (arr[mid]>target){
                    e=mid-1;
                }
                else if (arr[mid]<target){
                    s=mid+1;
                }
            }
            else {
                if (arr[mid]<target){
                    e=mid-1;
                }
                else if (arr[mid]>target){
                    s=mid+1;
                }
            }
            if (arr[mid]==target){
                return mid;
            }

        }
        return -1;
    }

    static int PeakOfMountain(int[] arr){
        int s=0;
        int e=arr.length-1;

        while(s<e){
            int mid=s+(e-s)/2;
            if (arr[mid]>arr[mid+1]){
                e=mid;
            }
            else{
                s=mid+1;
            }
        }
        return s;
    }
}
