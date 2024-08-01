package com.posh;

import java.util.Scanner;

public class triplets {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=in.nextInt();
        }
        int count=0;
        for (int i = 0; i <= n - 3; i++) {
            int j=i+1;
            int k=j+1;
            int avg=(arr[i]+arr[j]+arr[k])/3;
            if (avg == (int)avg){
                count++;
            }
        }
        System.out.println(count);
    }
}
