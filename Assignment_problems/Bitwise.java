package com.posh;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int k=in.nextInt();

        calculate_the_maximum(n,k);
    }

   static void calculate_the_maximum(int n, int k) {
        //Write your code here.
        int a=2;
        int[][] and =new int[n][n];
       int[][] or =new int[n][n];
       int[][] xor =new int[n][n];


        for ( int i=1;  i<n;  i++) {
            for ( int j=a;  j<=n; j++ ) {
                and[i][j]=i&j;
                or[i][j]=i|j;
                xor[i][j]=i^j;

            }
            a++;
        }
        int h=2;
        int max_and =0;
        int max_or =0;
        int max_xor =0;
        for(int i=1;i<n;i++){
            for(int j=h;j<=n;j++){
                if (and[i][j]<k) {
                    if(and[i][j] > max_and){
                        max_and = and[i][j];
                    }
                }
                if (or[i][j]<k) {
                    if(or[i][j] > max_or){
                        max_or = or[i][j];
                    }
                }
                if (xor[i][j]<k) {
                    if(xor[i][j] > max_xor){
                        max_xor = xor[i][j];
                    }
                }
            }
            h++;
        }
       System.out.println(max_and);
       System.out.println(max_or);
       System.out.println(max_xor);
    }
}
