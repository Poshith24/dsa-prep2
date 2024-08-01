package com.posh.codeforces_problems;

import java.util.Scanner;

public class good_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int l=0;

        while(l<t){
            int n=sc.nextInt();
            int k = sc.nextInt();
            int i,j;
            double x,y;
            if(n%2==0){
                i=n/2;
                x = Math.ceil((double)i/(double)k);
                System.out.println((int)(2*x));
//                i=Math.ceil((double)n/(double) 2);
            }
            else{

                i=n/2;
                j=n/2+1;
                if(j==k){
                    i=n/2+1;
                    j=i+1;
                }
                x = Math.ceil((double)i/(double)k);
                y = Math.ceil((double)j/(double)k);
                if( x==y){
                    System.out.println((int)(x*2));
                }
                else{
                    System.out.println((int)(x*2+1));
                }

            }
            l++;
        }

    }
}
