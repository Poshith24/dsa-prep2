package com.posh.codeforces_problems.div_2_892;

import java.util.Arrays;
import java.util.Scanner;

// https://codeforces.com/contest/1859/problem/0
public class united_we_stand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t++>0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(i>0){
                    if(arr[i]!=arr[i-1]){
                        flag=false;
                    }
                }
            }
            if(flag){
                System.out.println(-1);
            }
            else{
                Arrays.sort(arr);
                int j =n-1;
                int count =1;
                for (int i = n-2; i >=0 ; i++) {
                    if(arr[i]==arr[j]){
                        count++;
                    }
                    else{
                        break;
                    }
                }
                int[] c = new int[count];
                int[] b = new int[n-count];
                System.out.print((n-count)+" "+ (count));
                for (int i = 0; i < count; i++) {
                    c[i] = arr[n-i-1];
                    System.out.print(c[i]+" ");
                }
                System.out.println();
                for (int i = 0; i < n-count; i++) {
                    b[i] = arr[i];
                    System.out.print(b[i]+" ");
                }
                System.out.println();

            }


        }
    }
}
