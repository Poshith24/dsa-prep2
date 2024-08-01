package com.posh.STR;

import java.util.Scanner;
public class hello_strings {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        int[] count=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
            count[i]=arr[i];
        }
        sort(arr);
        int ans=hell(arr,count);
        System.out.println(ans);
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sort(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) {
            int j=i+1;
            while(j>0){
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    j--;
                }
                else{
                    break;
                }
            }
        }
    }
    static int hell(int[] arr,int[] count){
        int a=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==count[i]){
                a++;
            }
        }
        return a;
    }
}
