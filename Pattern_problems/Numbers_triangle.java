package com.posh.Pattern_problems;

public class Numbers_triangle {
    public static void main(String[] args) {
        Pattern3(5);
    }
    static void Pattern(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=  n+i-1; j++) {
                if (j>n-i){
                    if (j<n){
                        System.out.print(n-j+1+" ");
                    }
                    else{
                        System.out.print(j-n+1+" ");
                    }
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    static void Pattern2(int n){

        for (int rowno = 1; rowno <=n ; rowno++) {
            for (int spaces = 0; spaces < n-rowno; spaces++) {
                System.out.print("  ");
            }
            for (int colno = rowno; colno >= 1 ; colno--) {
                System.out.print(colno +" ");
            }
            for (int colno = 2; colno <= rowno; colno++) {
                System.out.print(colno + " ");
            }
            System.out.println();
        }

        for (int rowno = 1; rowno <n; rowno++) {
            for (int spaces = 0; spaces < rowno; spaces++) {
                System.out.print("  ");
            }
            for (int colno = n-rowno; colno >= 1 ; colno--) {
                System.out.print(colno +" ");
            }
            for (int colno = 2; colno <= n-rowno; colno++) {
                System.out.print(colno + " ");
            }
            System.out.println();

        }
    }

    static void Pattern3(int n){

        for (int rowno = 1; rowno <= 2*n - 1 ; rowno++) {

            int c = rowno>n ? 2*n-rowno : rowno;
            int space = rowno>n ? rowno-n : n-rowno;
            for (int spaces = 0; spaces < space; spaces++) {
                System.out.print("  ");
            }
            for (int colno = c; colno >= 1 ; colno--) {
                System.out.print(colno +" ");
            }
            for (int colno = 2; colno <= c; colno++) {
                System.out.print(colno + " ");
            }
            System.out.println();
        }
    }

}
