package com.posh;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/
public class PeakOfMountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,4,3,2};
        int ans=PIndex2(arr);
        System.out.println(ans);
    }

    static int PIndex2(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if (arr[mid]>arr[mid+1]){
                // we are in descending part of array
                e=mid; //coz mid value is greater than mid+1
            }
            else {
                // we are in ascending part of array
                s = mid + 1; // coz mid+1 is greater so no need to check from mid
            }
        }
        // After this while loop s=e condition hits so the peak of array is arr[s]=arr[e]=peak.
         return s;// Using s and e we are indirectly trying to find out max of array which is our peak.
    }

    static int PIndex(int[] arr ){
        int s=0;
        int e=arr.length-1;
        int a,b;
        while(s<=e){
            int mid=s+(e-s)/2;
            if (mid==0){
                a=arr[mid+1];
                b=arr[mid+2];
                if(a>arr[mid] && a>b){
                    return mid+1;
                }
            }
            if (mid==arr.length-1){
                a=arr[mid-1];
                b=arr[mid-2];
                if (a>arr[mid] && a>b){
                    return mid-1;
                }
            }
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (arr[mid]<arr[mid-1]){
                e=mid-1;
            }
            else if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }
        }
        return -1;
    }
//    static int Index(int[] arr){
//        for (int i = 1; i < arr.length-1; i++) {
//
//            if (arr[i]>arr[i+1] && arr[i]>arr[i-1]){
//                    return i;
//            }
//        }
//        return -1;
//    }


//    static int PeakIndex(int[] arr ){
//        int s=0;
//        int e=arr.length-1;
//        while(s<=e){
//            int mid=s+(e-s)/2;
//
//            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
//                return mid;
//            }
//            if (arr[mid]<arr[mid-1]){
//                e=mid-1;
//            }
//            else if(arr[mid]<arr[mid+1]){
//                s=mid+1;
//            }
//        }
//        return -1;
//    }
}

