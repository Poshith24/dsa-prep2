package com.posh.Recursions.backtracking;

import java.util.Scanner;

public class nknights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-->0){
//            int n = sc.nextInt();
//            boolean[][] board = new boolean[n][n];
//            System.out.println(Nknights(0,0,board,n)); ;
//        }
                    boolean[][] board = new boolean[3][3];

        System.out.println(Nknights(0,0,board,3)); ;

    }

    public static long Nknights(int r,int c,boolean[][] board){
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
                    count+=1;
                }
                else{
                    board[r][c] = true;
                    count+= Nknights(r+1,0,board);
                    board[r][c] = false;
                }
            }
        }
        return count;
    }

    public static long Nknights(int r,int c,boolean[][] board,int target){
        if(target==0){
            display(board);
            return 1;
        }
        long count=0;
        if(c==board[0].length && r==board.length-1){
            return 0;
        }
        if(c==board[0].length){
            return Nknights(r+1,0,board,target);
        }

            if (check(r, c, board)) {

                board[r][c] = true;

                count+=Nknights(r,c+1,board,--target);
                board[r][c] = false;
                target++;
            }
            return count+Nknights(r,c+1,board,target);
    }


    public static long Nknights2approach(int r,int c,boolean[][] board,int target){

        if(target==0){
            display(board);
            return 1;
        }

        long count=0;
        if(r==board.length-1 && c==board[0].length){
            return 0;
        }
        if(c==board[0].length){
            count+=Nknights2approach(r+1,0,board,target);
        }
        if(check(r,c,board)){
            board[r][c] = true;
            count+=Nknights2approach(r,c+1,board,--target);
            board[r][c] = false;
            target++;
        }

        return Nknights2approach(r,c+1,board,target);
    }


    public static void display(boolean[][] board){
        for (int i = 0; i < board.length; i++) {
//            System.out.print("[ ");
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]){
                    System.out.print("K ");
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
        if(r-2>=0){
            if(c-1>=0){
                if(board[r-2][c-1]){
                    return false;
                }
            }
            if(c+1<board.length){
                if(board[r-2][c+1]){
                    return false;
                }
            }
        }
        if(r-1>=0){
            if(c-2>=0){
                if(board[r-1][c-2]){
                    return false;
                }
            }
            if(c+2<board.length){
                if(board[r-1][c+2]){
                    return false;
                }
            }
        }
        return true;
    }

}
