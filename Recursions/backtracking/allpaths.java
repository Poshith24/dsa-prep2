package com.posh.Recursions.backtracking;

import java.util.Arrays;

public class allpaths {
    public static void main(String[] args) {

        int r =3;
        int c=3;
        boolean[][] maze = new boolean[r][c];
        int[][] matrix =new int[r][c];
        allpaths(0,0,"",maze,matrix,1);
    }

//    public static void allpaths(int r,int c,String str){
//        if(r==1 && c==1){
//            System.out.println(str);
//            return;
//        }
//
//        if(r>1){
//            allpaths(r-1,c,str+"D");
//        }
//        if(c>1){
//            allpaths(r,c-1,str+"R");
//        }
//        if(r<3){
//            allpaths(r+1,c,str+"U");
//        }
//        if(c<3){
//            allpaths(r,c+1,str+"L");
//        }
//    }

    public static void allpaths(int r,int c,String str,boolean[][] maze){
        if(r==maze.length-1 && c==maze[0].length-1){
            maze[r][c]=false;
            System.out.println(str);
            return;
        }

        maze[r][c] = true;
        if(r<maze.length-1 && !maze[r+1][c]){
//            maze[r+1][c] = true;
            allpaths(r+1,c,str+"D",maze);
        }
        if(c<maze[0].length-1 && !maze[r][c+1]){
//            maze[r][c+1] = true;
            allpaths(r,c+1,str+"R",maze);
        }
        if(r>0 && !maze[r-1][c]){
//            maze[r-1][c] = true;
            allpaths(r-1,c,str+"U",maze);
        }
        if(c>0 && !maze[r][c-1]){
//            maze[r][c-1] = true;
            allpaths(r,c-1,str+"L",maze);
        }
        maze[r][c] = false;
    }


    public static void allpaths(int r,int c,String str,boolean[][] maze,int[][] arr,int count){
        if(r==maze.length-1 && c==maze[0].length-1){
            maze[r][c]=false;
            arr[r][c] =count;
            System.out.println(str);
//            System.out.println(Arrays.deepToString(arr));
            for(int[] a: arr){
                System.out.println(Arrays.toString(a));
            }
            System.out.println();
            arr[r][c] =0;
            return;
        }

        maze[r][c] = true;
        arr[r][c] =count;
        if(r<maze.length-1 && !maze[r+1][c]){
//            maze[r+1][c] = true;
            allpaths(r+1,c,str+"D",maze,arr,count+1);
        }
        if(c<maze[0].length-1 && !maze[r][c+1]){
//            maze[r][c+1] = true;
            allpaths(r,c+1,str+"R",maze,arr,count+1);
        }
        if(r>0 && !maze[r-1][c]){
//            maze[r-1][c] = true;
            allpaths(r-1,c,str+"U",maze,arr,count+1);
        }
        if(c>0 && !maze[r][c-1]){
//            maze[r][c-1] = true;
            allpaths(r,c-1,str+"L",maze,arr,count+1);
        }
        maze[r][c] = false;
        arr[r][c] = 0;
    }
}
