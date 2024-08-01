package com.posh.Pattern_problems;

public class Rhombus {
    public static void main(String[] args) {
        PatternRhombus(5);
    }
    /*
                 *
                * *
               * * *
              * * * *
             * * * * *
              * * * *
               * * *
                * *
                 *
     */

    static void PatternRhombus(int n){

//        for (int i = 0; i < 2*n-1; i++) {
//            int NO_of_Spaces= i<n ? n-i-1 : i-n+1;
//            for (int j = 0; j < NO_of_Spaces; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < n-NO_of_Spaces; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for (int row = 1; row < 2*n; row++) {
            int cols= row>n ? 2*n-row : row;
            int NO_of_spaces= n-cols;
            for (int i = 1; i <= NO_of_spaces; i++) {
                System.out.print(" ");
            }
            for (int colno = 1; colno <=cols; colno++) {
                System.out.print("* ");
            }
            System.out.println();
        }


//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=n; j++) {
//                if (j>= n-i+1){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <=n-1; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (j>i){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
    }
}
