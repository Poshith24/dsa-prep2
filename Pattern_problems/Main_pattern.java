package com.posh.Pattern_problems;

public class Main_pattern {

    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        int n=in.nextInt();
        Pattern5(5);
    }
    /*
     *****
     *****
     *****
     *****
     *****

     */
    static void Pattern1(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     */
    static void Pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
     *****
     ****
     ***
     **
     *

     */

    static void Pattern3(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

     */
    static void Pattern4(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *

     */

    static void Pattern5(int n){
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <=n-1; i++) {
//            for (int j = 1; j <=n-i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int row = 1; row < 2*n; row++) {
            int cols= row>n ? 2*n-row : row;
//            if (row<=n){
//                cols=row;
//            }
//            else{
//                cols=2*n-row;
//            }

            for (int colno = 1; colno <=cols; colno++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
         *
        **
       ***
      ****
     *****
     */
    static void Pattern6(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (j >= n-i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*
     *****
      ****
       ***
        **
         *
     */
    static void Pattern7(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
