package com.posh.Recursions.backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class nqueens {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean[][] board = new boolean[n][n];
            System.out.println(Nqueens(0,0,board)); ;
        }

    }

    public static long Nqueens(int r,int c,boolean[][] board){

        long count=0;

        for (c= 0; c< board[0].length; c++) {


            if(r==0 || check(r,c,board)){

                if(r==board.length-1){
                    board[r][c]= true;
//                    // print the boolean array
//                    for(boolean[] a: board){
//                        System.out.println(Arrays.toString(a));
//                    }
//                    System.out.println();
//                    display(board);
                    board[r][c] = false;
                    return 1;
                }
                else{
                   board[r][c] = true;
                  count+= Nqueens(r+1,0,board);
                   board[r][c] = false;
                }
            }
        }
        return count;

    }
    public static void display(boolean[][] board){
        for (int i = 0; i < board.length; i++) {
//            System.out.print("[ ");
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
//            System.out.print("] ");
            System.out.println();
        }
        System.out.println();
    }

    public static boolean check(int r,int c,boolean[][] board){

        int k=r;
        while(k>0){
            if(board[--k][c]){
                return false;
            }
        }
        k=r;
        int l=c;
//        int s = Math.min(r,c);
//        int p = Math.max(r,c);
//        while((k>=s && l>=s) && (l!=0 && k!=0)){
//            if(board[--k][--l]){
//                return false;
//            }
//        }
//        k=r;
//        l=c;
//        while((k<=p && l<=p) && (l!=board[0].length-1 && k!=0)){
//
//            if(board[--k][++l]){
//                return false;
//            }
//        }

        int s = Math.min(r,c);
        int p = Math.min(r,board[0].length-1-c);
        while(s>0){
            if(board[--k][--l]){
                return false;
            }
            s--;
        }
        k=r;
        l=c;
        while(p>0){
            if(board[--k][++l]){
                return false;
            }
            p--;
        }
        return true;
    }

}

