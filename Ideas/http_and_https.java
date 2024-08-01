package com.posh.Ideas;

import java.util.Scanner;

public class http_and_https {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String link = sc.next();

        for(int i=0;i<link.length();i++){
            char ch = link.charAt(i);
            if( ch == 'h'){
                if(i!=0){
                    String ps1 = ps(link,i,3);
                    String ps2 = ps(link,i,4);
                    if(ps2.equals("https")){

                        System.out.println();
                        System.out.print(ch);
                    }
                    else if(ps1.equals("http")){

                        System.out.println();
                        System.out.print(ch);
                    }
                    else{
                        System.out.print(ch);
                    }
                }
                else{
                    System.out.print(ch);
                }
            }
            else{
                System.out.print(ch);
            }
        }
        System.out.println();
    }

    // ps--> Possible string

    static String ps(String link,int i,int str_len){
        String ps = "";
        for(int j=i;j<=i+str_len;j++){
              char ch = link.charAt(j);
              ps = new StringBuilder(ps).append(ch).toString();
        }
        return ps;
    }
}
