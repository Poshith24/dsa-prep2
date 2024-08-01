package com.posh.Codechef_problems;
// https://www.codechef.com/JAN231D/problems/ARRSWAP
import java.util.Scanner;

public class assym_swaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i =0;
        while(i<t){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] arr = new int[n];
            int[] b = new int[n];
            int[] brr = new int[n];
            for (int j = 0; j < n; j++) {
                a[j]  = sc.nextInt();
                arr[j] =a[j];
            }
            for (int j = 0; j < n; j++) {
                b[j]  = sc.nextInt();
                brr[j] = b[j];
            }
             int diff1 = diff1(a,b);
            int diff2 = diff2(arr,brr);
            if(diff1>diff2){
                System.out.println(diff2);
            }
            else{
                System.out.println(diff1);
            }
            i++;
        }
    }

    public static int diff1(int[] a,int[] b){
        int z =0;
        for (int i = 0; i < a.length; i++) {
            int amax = max(a);
            int bmin = min(b);
            if (a[amax]>b[bmin]){
                int temp = a[amax];
                a[amax] = b[bmin];
                b[bmin] = temp;
            }
            else{
                 z = a[amax];
                break;
            }
        }
        int amin = min(a);
        int diff = z-a[amin];
        return diff;
    }

    public static int diff2(int[] a,int[] b){
        int z =0;
        for (int i = 0; i < a.length; i++) {
            int amin = min(a);
            int bmax = max(b);
            if (b[bmax]>a[amin]){
                int temp = a[amin];
                a[amin] = b[bmax];
                b[bmax] = temp;
            }
            else{
                z = a[amin];
                break;
            }
        }
        int amax = max(a);
        int diff = a[amax]-z;
        return diff;
    }

    public static int max(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }

    public static int min(int[] arr){
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<arr[min]){
                min = i;
            }
        }
        return min;
    }
}
