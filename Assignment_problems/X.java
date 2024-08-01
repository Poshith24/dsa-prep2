package com.posh;

import java.util.Scanner;

public class X {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i=0;

       while(i==0){
           char ch = in.next().charAt(0);
           if (ch == 'x'){
               break;
           }
           else{
               System.out.println(ch);
           }
       }

    }
}
