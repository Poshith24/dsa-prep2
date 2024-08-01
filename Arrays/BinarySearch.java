package com.posh.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
       int ans=search(arr,2) ;
        System.out.println(ans);
    }

    static int search(int[] a,int target){
        int s=0;
        int e=a.length-1;
        boolean isAc =a[s]<a[e];
         while(s<=e){
            int mid=(s+e)/2;

             if (a[mid] == target) {
                 return mid;
             }

            if (isAc) {

                if (target > a[mid]) {
                    s = mid + 1;
                } else if (a[mid] > target) {
                    e = mid - 1;
                }
            }
            else
            {
                if(target >a[mid]){
                    e=mid-1;
                }
                else if(a[mid]> target){
                    s=mid+1;
                }
            }
        }
         return -1;
    }
    // first program for every coder will be definitely hello world but some much more interesting things
    // will come in near future. finish it off faster become busy.
    /* Hello everyone my name is Poshith Kumar I am a 3rd year undergrad.
     */


}
