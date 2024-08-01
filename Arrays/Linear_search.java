package com.posh.Arrays;

import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr = {1,5,4,79,34,6,-1};
//        int[] arr =new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=in.nextInt();
//        }
        int x;
        System.out.println("Enter number you are searching");
        x=in.nextInt();
//        search(arr,x);
        System.out.println(search4(arr,x));

    }

    static void search(int[] nums,int n){

        int count=0;
        for (int num : nums) {
            if (num == n) {
                System.out.println("Number is found");
                count = 1;
                break;
            }
        }
        if(count==0){
            System.out.println("Number is not found");
        }
    }

    static int search2(int[] nums,int n){
        if(nums.length==0){
            return -1;
        }
        for(int i =0;i<nums.length;i++){
            if( nums[i]==n ){
                return i;
            }
        }
        return -1;
    }

    static int search3(int[] nums,int n){
        if(nums.length==0){
            return -1;
        }
        for(int num:nums){
            if(num==n){
                return num;
            }
        }
        return Integer.MAX_VALUE; // USING THIS BECAUSE IF WE RETURN -1 IN THIS CASE -1 MAY BE ELEMENT IN THE ARRAY.
    }

    static boolean search4(int[] nums,int n){
        if(nums.length==0){
            return false;
        }
        for(int num:nums){
            if(num==n){
                return true;
            }
        }
        return false; // USING THIS BECAUSE IF WE RETURN -1 IN THIS CASE -1 MAY BE ELEMENT IN THE ARRAY.
    }
}
