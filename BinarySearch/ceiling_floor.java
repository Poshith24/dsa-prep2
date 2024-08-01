package com.posh;

import java.util.Arrays;

public class ceiling_floor {
    public static void main(String[] args) {
        int[] arr={1,5,8,11,17,17,25,28};
        int target=17;
        int a=min(arr,target);
        int b=max(arr,target);
        int[] ans={a,b};
        int[] out=ans(arr,target);
        System.out.println("By using ceiling and floor function output is:");
        System.out.println(Arrays.toString(ans));
        System.out.println("By using a single function:");
        System.out.println(Arrays.toString(out));
    }

    static int[] ans(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        int[] ans=new int[2];
        while (s<=e){
            int mid=s+(e-s)/2;

            if (arr[mid]==target){
                ans[1]=mid;
                break;
            }
            if (arr[mid]>target){
                e=mid-1;
            }
            if (arr[mid]<target){
                s=mid+1;
            }

        }
        if (s>e){
            ans[1]=s;
        }

        s=0;
        e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;

            if (arr[mid]==target){
                ans[0]=mid;
                break;
            }
            if (arr[mid]>target){
                e=mid-1;
            }
            if (arr[mid]<target){
                s=mid+1;
            }
        }
        if (s>e){
            ans[0]=e;
        }

        return ans;



    }

    static int max(int[] arr,int target){

        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;

            if (arr[mid]==target){
                return mid;
            }
            if (arr[mid]>target){
                e=mid-1;
            }
            if (arr[mid]<target){
                s=mid+1;
            }
        }
        return s;

    }

    static int min(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (arr[mid]>target){
                e=mid-1;
            }
            if (arr[mid]<target){
                s=mid+1;
            }
        }
        return e;
    }


}
