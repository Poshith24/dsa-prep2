package com.posh.sorting;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubble(arr);
    }

    static void swap(int[] arr,int i,int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void bubble(int[] arr){

        for(int i =0;i<arr.length;i++){
            boolean swap_check = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap_check = true;
                    swap(arr,j,j+1);
                }
            }
            if (!swap_check){
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
