package com.posh.Arrays;

import java.util.Scanner;

public class odd_pairs {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i =0;
        while(i<t){
            int n = sc.nextInt();
            int x = n/2;
            if(n==1){
                System.out.println(0);
            }
            else if(n%2==0){
                int sol = x*x;
                System.out.println(sol*2);
            }
            else if(n%2!=0){

                int pro = x*(x+1);
                int sol2 = 2*pro;
                System.out.println(sol2);
            }
            i++;
        }
    }
}
