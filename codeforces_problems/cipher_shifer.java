package com.posh.codeforces_problems;

import java.util.Scanner;

public class cipher_shifer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        int k =0;

        while(k<t){
            int n = sc.nextInt();
            String s = sc.next();
            StringBuffer str = new StringBuffer(s);
            int i=0;
            while(i<str.length()){
                char ch = str.charAt(i);
                i++;
                int j=i;
                while(str.charAt(i)!=ch){
                    i++;
                }
                str.replace(j,i+1,"");
                i=j;
            }
            System.out.println(str);
            k++;
        }
    }


}
