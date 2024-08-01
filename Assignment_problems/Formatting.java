package com.posh;
import java.util.Scanner;
public class Formatting {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String str =sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d%n",str,x);
            }
            System.out.println("================================");

        }


}
