package com.posh;

import java.util.Scanner;

public class remainder {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int count=0;

        while(n>0){
            int rem=n%10;
            if(rem==0){
                count++;
            }
            n=n/10;
        }
        if(count>0){
            System.out.println("True");
        }
        else
            System.out.println("False");



    }

}
