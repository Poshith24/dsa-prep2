package com.posh.Arrays;

import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cycle_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycle_sort(int[] arr){

        int i =0;
        while(i<arr.length){

            int correct_pos = arr[i]-1;
            if(i!=correct_pos){
                swap(arr,i,correct_pos);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr,int i ,int j){
        int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
    }
}
