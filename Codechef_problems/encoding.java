package com.posh.Codechef_problems;

import java.util.Scanner;

public class encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String h ="";
        for(int j=0;j<n;j=j+2){
            char ch = s.charAt(j);
            if(j==n-1){
                h+=ch;
                j++;
            }
            else{
                char ch2 = s.charAt(j+1);
                h+=ch2;
                h+=ch;

            }
        }
        System.out.println(h);
        String ans ="";

        for(int j=0;j<h.length();j++){
            char ch = (char)(219-(int)(h.charAt(j)));
            ans+=ch;
        }
        System.out.println(ans);
    }
}
