package com.posh;

public class array_asc_desc {
    public static void main(String[] args) {
        int[] arr ={1,4,5,6,7};
        int[] arr2 = {7,6,5,3};
        System.out.println(check_asc(arr));
        System.out.println(check_asc(arr2));

    }

    public static String check_asc(int[] arr){

        if(arr[0]-arr[arr.length-1]>0){
            return "descending";
        }
        else if(arr[0]-arr[arr.length-1]==0){
            return "neither ascending nor descending";
        }
        return "ascending";
    }

}
