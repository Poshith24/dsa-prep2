package com.posh.Recursions.backtracking;

import java.util.Arrays;

public class suduko_solver {
    public static void main(String[] args) {
        char[][] charArray = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
//        for (int i = 1; i <=9; i++) {
//            System.out.println(check(board,0,2,i));
//        }
        sudukosolver(charArray,0,0);

    }

    public static void helper(int[][] board,int r,int c){
        if(r==board.length-1 && c==board[0].length){
            // print the array.
//            for (int[] arr :
//                    board) {
//                System.out.println(Arrays.toString(arr));
//            }
//            System.out.println();



            return;
        }

        if(c==board[0].length){
            helper(board,r+1,0);
            return;
        }



        if(board[r][c]==0){
//            boolean flag = false;
            for (int i = 1; i <=9 ; i++) {
                if(check(board,r,c,i)){
                    board[r][c] =i;
//                    flag=true;
                    helper(board,r,c+1);
                    board[r][c]=0;
                }
            }

            return;
        }
//        else{
//            return;
//        }
        helper(board,r,c+1);
    }

    public static void sudukosolver(char[][] charArray,int r,int c){



        int[][] board = new int[charArray.length][charArray[0].length];
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {
                if (charArray[i][j] == '.') {
                    board[i][j] = 0;
                } else {
                    board[i][j] = charArray[i][j] - '0';
                }
            }
        }
        helper(board,0,0);


    }


        public static boolean check(int[][] board,int r,int c,int prob){
            for (int i = 0; i < 9; i++) {
                if (board[r][i] == prob || board[i][c] == prob) {
                    return false;
                }
            }

            int f = (r / 3) * 3;
            int k = (c / 3) * 3;

            for (int i = f; i < f + 3; i++) {
                for (int j = k; j < k + 3; j++) {
                    if (board[i][j] == prob) {
                        return false;
                    }
                }
            }
            return true;
        }
}
