package com.posh.Arrays;

import java.util.Scanner;

public class rot25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rot = sc.nextLine();
        for(int i =0;i<rot.length();i++){
//            if(rot.charAt(i)=='a'){
//                System.out.print('z');
//            }
//            else{
//                System.out.print((char)(rot.charAt(i)-1));
//            }
            if(rot.charAt(i)=='/'){
                System.out.print('.');
            }
            else{
                int n = ((rot.charAt(i)-97+25)%26)+97;
                System.out.print((char)n);
            }

        }
    }
}
