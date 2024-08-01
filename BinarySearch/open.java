package com.posh;

public class open {
    public static void main(String[] args) {
        int a=7358;
        int b=21;
        int c,d;

        while(b!=0){
            c=a%100;
            c=c*100;
            d=a/100;
            a=c+d;
            b=b-1;
        }

            System.out.println(a);

    }
}
