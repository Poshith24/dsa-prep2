package com.posh.codeforces_problems;

import java.util.Scanner;

public class too_long {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int i=0;
                while(i<n){
                    String s = sc.next();
                    int k = s.length();
                    char ch1 = s.charAt(0);
                    char ch2 = s.charAt(k-1);

                    if(k>=10){
                        System.out.println(ch1+Integer.toString(k-2)+ch2);
                    }
                    else{
                        System.out.println(s);
                    }
                    i++;
        }
    }
}
