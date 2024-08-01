package com.posh.Codechef_problems;

import java.util.Scanner;

public class great_run {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i =0;
        while(i<t){

            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];


            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();

            }

            int max =0;
            for(int j=0;j<n-k;j++){
                int sum = sum(arr,j,k);
                if(sum>max){
                    max = sum;
                }
            }
            System.out.println(max);
            i++;
        }


    }

    static int sum(int[] arr,int i,int k){

        int sum =0;
        for(int l=i;l<i+k;l++){
            sum+=arr[l];
        }
        return sum;
    }
}
