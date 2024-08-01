package com.posh.codeforces_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Tracking_segments {
    public static void main(String[] args) {
        func();
//        System.out.println(func());
    }

    public static void func(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i =0;
        while(i<t){
            int n = sc.nextInt();
            int[] arr = new int[n];
            Arrays.fill(arr,0);
            int m = sc.nextInt();
            int[] l = new int[m];
            int[] r = new int[m];
            for (int j = 0; j < m; j++) {
                l[j] = sc.nextInt();
                r[j] = sc.nextInt();
            }
            int q = sc.nextInt();
            int k=1;
            boolean flag=true;
            int[] ind = new int[q];
            for (int j = 0; j < q; j++) {
                ind[j] = sc.nextInt();
            }
            while(k<=q && flag){
                int index = ind[k-1];
                arr[index-1] =1;
                for (int j = 0; j < m; j++) {
                    if(check(arr,l[j],r[j])){
                        System.out.println(k);
                        flag=false;
                        break;
                    }
                }
                k++;
            }
            if(flag){
                System.out.println(-1);
            }
            i++;
        }


    }

    public static boolean check(int[] arr,int s,int e){
        int count_zeros=0;
        int count_ones =0;
        for (int i = s-1; i < e; i++) {
            if(arr[i]==0){
                count_zeros++;
            }
            else{
                count_ones++;
            }
        }
        return count_zeros<count_ones;
    }

}
