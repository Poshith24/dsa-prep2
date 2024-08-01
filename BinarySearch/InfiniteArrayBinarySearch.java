package com.posh.BinarySearch;

public class InfiniteArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int m=ans(arr,10);
        System.out.println(m);
    }

    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp= end+1;
            end=end+2*(end-start+1);
            start=temp;
        }
        return  Search(arr,target,start,end);
    }

    static int Search(int[] arr,int target,int s,int e){
        while(s<=e){
            int mid=s+(e-s)/2;

            if (arr[mid]>target){
                e=mid-1;
            }
            else if (arr[mid]<target){
                s=mid+1;
            }
            else
                return mid;
        }
        return -1;
    }
}
