package com.posh.codeforces_problems.div_3_891;
//
import java.util.Scanner;

public class max_rounding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String x= sc.next();
            x = "0" +x;
            int n = x.length();
            int after = n;
            for (int i = n-1; i >=0; i--) {
                if(x.charAt(i)>='5'){
                    char ch = '0';
//                    x.charAt(i) = ch;
                }
            }


        }
    }
}
