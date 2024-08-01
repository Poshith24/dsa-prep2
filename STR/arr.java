package com.posh.STR;

import java.util.Scanner;

public class arr {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int ans = Sum(arr);
        System.out.println(ans);

    }

    static int Sum(int[] arr) {
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            sum+=(arr[i]*(arr[i]+1));
//        }
//        return sum;
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            if (arr[i] == arr[j] * arr[j]) {
                return i;
            }
        }
        return -1;
    }
 }
