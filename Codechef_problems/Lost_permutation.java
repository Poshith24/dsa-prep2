package com.posh.Codechef_problems;

import java.util.Scanner;

public class Lost_permutation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i=0;
        while(i<t){
            int m = sc.nextInt();
            int s = sc.nextInt();

            int[] arr = new int[m];
            int arr_sum =0;
            for(int j=0;j<m;j++){
                arr[j]=sc.nextInt();
                arr_sum+=arr[j];
            }
            int max = max_of_arr(arr);
            for(int j=max;j<50;j++){
                int a = (j*(j+1))/2;

                if(a-arr_sum==s){

                }
            }


            i++;
        }
    }

    static int max_of_arr(int[] arr){
        int max =0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        return max;
    }
}
