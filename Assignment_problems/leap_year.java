package com.posh;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result =0;

        if (n%4 == 0){
            result =1;
        }

        if (n%100 == 0){
            if (n%400 != 0){
                 result =0;
            }
        }

        if (result == 1){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }

    }
}
