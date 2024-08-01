package com.posh.leetcode_problems;

import java.util.Arrays;

public class merge_sort {

    public static void main(String[] args) {

        int[] arr1 = {0};
        int[] arr2 = {1};
        merge(arr1,arr2,0,1);

        System.out.println(Arrays.toString(arr1));
    }

    public static void merge(int[] arr1,int[] arr2,int a,int b){

        int i=0;
        int j=0;
        int[] temp = new int[arr1.length];
        int k=0;

        while(i<a && j<b){
            if(arr1[i]<=arr2[j]){
                temp[k]=arr1[i];
                k++;
                i++;
            }
            else{
                temp[k]=arr2[j];
                k++;
                j++;
            }
        }
        if(i== a){
            for(int m=j;m<b;m++){
                temp[k]=arr2[m];
                k++;
            }
        }
        else if(j== b){
            for(int m=j;m<a;m++){
                temp[k]=arr2[m];
                k++;
            }
        }
        for(int m=0;m<arr1.length;m++){
            arr1[m] = temp[m];
        }

    }
}
