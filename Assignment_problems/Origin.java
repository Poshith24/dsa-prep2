package com.posh;

import java.util.Scanner;

public class Origin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int i=0,j=0,k=0;
        while(i<2*n){
            if (i%2==0){
                x[j]=in.nextInt();
                j++;
            }
            else{
               y[k]=in.nextInt();
               k++;
            }
            i++;
        }
        int result = ans(x,y);
        System.out.println(result);
        
    }
    
    static int ans(int[] x,int[] y){
//        int[] sol = new int[x.length];
        int max =0;
        int ans=0;
        for (int i = 0; i < x.length; i++) {
            for (int j = i+1; j < y.length; j++) {
                if (i!=j){

                        int a = x[j] - x[i];
                        int b = y[j] - y[i];
                        double m = (double) (a) /(double) (b);
                        int n = (a * a) + (b * b);
                        if (y[i]*a == b * x[i] ) {
                            ans = n;
                        }
                        else if(a==0 && y[i]==0){
                            ans = n;
                        }
                        if (b==0 && x[i]==0){
                            ans=n;
                        }
                    }
                    if (ans > max) {
                        max = ans;
                    }
                }
            }
           return ans;
        }


}
