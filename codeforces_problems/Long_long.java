package com.posh.codeforces_problems;
// https://codeforces.com/contest/1843/problem/B

import java.util.Arrays;
import java.util.Scanner;
public class Long_long {
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
                long count =0;
                boolean flag = true;
                for (int j = 0; j < n; j++) {
                    if(j!=0){
                        if(arr[j]<0 && flag){
                            count++;
                            flag=false;
                        }
                    }
                    else{
                        if(arr[j]<0){
                            count++;
                            flag=false;
                        }
                    }
                    if(arr[j]>0){
                        flag=true;
                    }


                }
                long sum=0;
                for (int j = 0; j < n; j++) {
                    if(arr[j]<0){
                        arr[j]*=-1;
                    }
                    sum+=(long)arr[j];
                }
                System.out.print(sum+" "+count);
                System.out.println();
                i++;
            }
        }



}
