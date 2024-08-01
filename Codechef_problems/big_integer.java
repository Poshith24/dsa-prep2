package com.posh.Codechef_problems;

import java.math.BigInteger;
import java.util.Scanner;

public class big_integer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i =0;
        while(i<t){

            BigInteger n = sc.nextBigInteger();
            BigInteger div = new BigInteger("20");
            BigInteger s = new BigInteger("1");
            BigInteger[] answers = n.divideAndRemainder(div);
            int comparevalue = n.compareTo(s);
            if(comparevalue==0){
                System.out.println(1);
            }
            else{
                System.out.println(answers[1]);
            }
            i++;
        }

    }
}
