package com.posh.Arrays.just_trying;

import java.util.Scanner;

public class codeforces_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a==1){
                System.out.println(1);
            }
            if(c!=1){
                if(b==1){
                    if((a-1)>2*(c-b)){
                        System.out.println(2);
                    }
                    else if((a-1)<2*(c-b)){
                        System.out.println(1);
                    }
                    else{
                        System.out.println(3);
                    }
                }
                else{

                }
            }
        }
    }
}
