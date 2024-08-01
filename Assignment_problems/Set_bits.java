package com.posh;


public class Set_bits {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(Integer.toBinaryString(n));
//        int count = 0;
//        while(n>0){
//            if((n&1) ==1){
//               count++;
//            }
//            n = n>>1;
//        }
        int i=0;
        while(n>0){
            n=n&(n-1);
            // n -= n&(-n);
            i++;
        }
        System.out.println(i);
//        System.out.println(count);
    }
}
