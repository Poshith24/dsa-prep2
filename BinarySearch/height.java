package com.posh;

import java.util.Scanner;

public class height {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
//        int n=in.nextInt();
        int[] arr={2,5,1,3};
//        for (int i = 0; i < n; i++) {
//            arr[i]=in.nextInt();
//        }
//        mergesort(arr,0,n-1);
//        System.out.println(arr[n-2]);
        print2largest(arr,4);


    }

    static void merge(int[] a, int s, int m, int e)
    {
        int[] b=new int[100];

        int i = s;
        int j = m + 1;
        int k = s;
        while (i <= m && j <= e)
        {
            if (a[i] < a[j])
            {
                b[k] = a[i];
                k++;
                i++;
            }
            else
            {
                b[k] = a[j];
                k++;
                j++;
            }
        }
        while (i <= m)
        {
            b[k] = a[i];
            i++;
            k++;
        }
        while (j <= e)
        {
            b[k] = a[j];
            j++;
            k++;
        }

        for (int o = s; o <=e; o++)
        {
            a[o]=b[o];
        }


    }

   static void mergesort(int[] arr, int s, int e)
    {
        int m;
        if (s < e)
        {
            m = (s + e) / 2;
            mergesort(arr, s, m);
            mergesort(arr, m + 1, e);
            merge(arr, s, m, e);
        }
    }

    static void print2largest(int[] arr,int arr_size){
        for (int a = 0; a < (arr_size - 1); a++)
        {
            for (int b = 0; b < arr_size - a - 1; b++)
            {
                if (arr[b] > arr[b + 1])
                {
                   int  swap = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = swap;
                }
            }
        }
        System.out.println(arr[arr_size-2]);
    }

}


