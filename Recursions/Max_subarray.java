package com.posh;

import java.util.Scanner;



public class Max_subarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int arr_size = arr.length;

        int max_sum = subarray_max(arr,arr_size);
        System.out.println("Sum of largest contigious subarray is "+ max_sum);

    }

    static int subarray_max(int[] arr, int n){

        int max_sum =0;
        int current_sum =0;

        for (int i = 0; i < n; i++) {
            current_sum += arr[i];
            if (current_sum <0){
                current_sum=0;
            }
            else if(current_sum > max_sum){
                max_sum = current_sum;
            }
        }
        return max_sum;
    }
}
