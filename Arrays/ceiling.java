package com.posh.Arrays;

import java.util.Arrays;

public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int tar = 15;
//        int ans =ceiling_sol(arr,tar);
//        System.out.println(ans);
        int[] ans = ceil_floor(arr,tar);
        System.out.println(Arrays.toString(ans));
    }

    static int ceiling_sol(int[] arr,int tar){
        int s =0;
        int e = arr.length-1;
        if(arr.length==0){
            return -1;
        }
        while(s<=e){
            int m = s+e>>1;
            if(arr[m]>tar){
                e=m-1;
            }
            else if(arr[m]<tar){
                s=m+1;
            }
            else{
                return m;
            }
        }
        return s;
    }

    static int floor_sol(int[] arr,int tar){
        int s =0;
        int e = arr.length-1;
        if(arr.length==0){
            return -1;
        }
        while(s<=e){
            int m = s+e>>1;
            if(arr[m]>tar){
                e=m-1;
            }
            else if(arr[m]<tar){
                s=m+1;
            }
            else{
                return m;
            }
        }
        return e;
    }

    static int[]  ceil_floor(int[] arr,int tar){
        int s =0;
        int e = arr.length-1;
        if(arr.length==0){
            return new int[]{-1};
        }
        while(s<=e){
            int m = s+e>>1;
            if(arr[m]>tar){
                e=m-1;
            }
            else if(arr[m]<tar){
                s=m+1;
            }
            else{
                return new int[]{m,m};
            }
        }
        return new int[]{s,e};
    }
}
