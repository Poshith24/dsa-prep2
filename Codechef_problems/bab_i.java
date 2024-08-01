package com.posh.Codechef_problems;

import java.util.Arrays;
import java.util.Scanner;

public class bab_i {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        boolean zflag=false;
        boolean nflag=false;
        boolean pflag = false;
        int ans = -1;
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                zflag = true;
            }
            if (arr[i]<0){
                nflag = true;
            }
            if (arr[i]>0){
                pflag = true;
            }
        }
        int n=0;
        int p=0;
        int s=0;
        int e=0;
        Arrays.sort(arr);
        boolean aflag = false;
        if (zflag | !pflag){
            ans =-1;
            aflag = true;
        }
        else if (!nflag && !zflag){
            ans = arr[0]-1;
            aflag = true;
        }
        else{
            for (int i = 0; i < l; i++) {
                if (i<l-1){
                    if(arr[i]<0 && arr[i+1]>0){
                        n = arr[i];
                    }
                }

               if (i>0){
                   if (arr[i]>0 && arr[i-1]<0){
                       p = arr[i];
                   }
               }
            }
            int f = -1*n;
            int g = -1*p;
            if (f>p){
                s = g+1;
            }
            else{
                s = n+1;
            }

            if (g<n){
                e = f-1;
            }
            else{
                e=p-1;
            }
        }
//        System.out.println("s ->" +s+ " e -> "+e);
        if (!aflag){
            if(s==-1*e){
                ans = e;
            }
            else{
                ans =-1;
            }
        }
        System.out.println("ans ->"+ans);


    }

}
