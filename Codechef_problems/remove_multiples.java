package com.posh.Codechef_problems;

import java.util.ArrayList;
import java.util.Scanner;

public class remove_multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i =0;
        while(i++<t){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[m];
            long cost =0;
            ArrayList<Integer> list = new ArrayList<Integer>();
            ArrayList<Integer> mlist = new ArrayList<Integer>();
            for (int j = 0; j < m; j++) {
                arr[j] = sc.nextInt();
                mlist.add(arr[j]);
            }
            for (int j = 0; j < m; j++) {
                int s =2;
                if(arr[j]!=1){
                    while((s*arr[j])<=n){
                        if(!mlist.contains(s*arr[j])){
                            cost+=(long) arr[j];
                            list.add(s*arr[j]);
                            break;
                        }
                        s++;
                    }
                }
            }
            // 1 8 2 1 4
            int s=0;
            for (int j = 1; j <= n; j++) {
                if(!list.contains(j)){
                    if(s!=arr.length && arr[s]==j){
                        s++;
                    }
                    else{
                            cost+=(long)j;
                    }
                }

            }
            System.out.println(cost);
        }
    }

}
