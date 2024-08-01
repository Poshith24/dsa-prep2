package com.posh;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
         double a=area();
        System.out.println(a);
    }

    static double area(){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        double area= Math.PI *a*a;
        return area;
    }


}
