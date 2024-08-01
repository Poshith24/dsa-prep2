package com.posh;

public class CharCeiling {
    public static void main(String[] args) {

        char[] arr={ 'a','c','e','g','i'};
         char target='t';
        int ans=search(arr,target);
        System.out.println(ans);
    }

    static int search(char[] arr,char target){
        int s=0;
        int e=arr.length-1;

        if(target >= arr[e]){
            return s;
        }
//
//        if(target<arr[s]){
//            return -1;
//        }
        while (s<=e){
            int mid=s+(e-s)/2;


            if (arr[mid]>target){
                e=mid-1;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
        }

        // When while loop ends: end, target, start .. So the next big no after target is start element..
         return s; // return ceiling: It returns smallest number which is greater than target.

        // return s%N; N:no of char in char array.
        // When while loop ends:  end, target, start .. So the previous smallest no before target is end element..

//        return e; // return floor : It returns biggest number which is smaller than target.
    }
}
