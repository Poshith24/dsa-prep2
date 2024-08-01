package com.posh.codeforces_problems;

import java.util.Arrays;
import java.util.Scanner;

// https://codeforces.com/contest/1843/problem/0
public class Sasha_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i =0;
        while(i<t){
            int n =sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]= sc.nextInt();
            }
            if(n==1){
                System.out.println(0);
            }
            else{
                Arrays.sort(arr);
                int sum =0;
                for (int j = 0; j < n/2; j++) {
                    sum+=arr[n-j-1]-arr[j];
                }
                System.out.println(sum);
            }

            i++;
        }
    }

}
