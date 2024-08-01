package com.posh.leetcode_problems.daily_leetcode;

/// https://leetcode.com/problems/path-with-minimum-effort
public class path_with_min_effort_16_9_23 {
    public static void main(String[] args) {

        int[][] heights = {
                {1,2,2},
                {3,8,2},
                {5,3,5}
        };
        System.out.println(minimumEffortPath(heights));
    }

    public static int minimumEffortPath(int[][] heights) {

        return minimumEffortPath(heights,0,0);
    }

    private static int minimumEffortPath(int[][] maze,int r,int c){

        int sum1=Integer.MAX_VALUE-1;
        int sum2=Integer.MAX_VALUE-1;
        int sum3=Integer.MAX_VALUE-1;
        int sum4=Integer.MAX_VALUE-1;
        //left
        if(c!=0){
            sum1 = Math.abs(maze[r][c]-maze[r][c-1]) + check(maze,r,c-1);
        }
        //right
        if(c!=maze[0].length-1){
            sum2 = Math.abs(maze[r][c]-maze[r][c+1]) + check(maze,r,c+1);
        }
        //up
        if(r!=0){
            sum3 = Math.abs(maze[r][c]-maze[r-1][c]) + check(maze,r-1,c);
        }
        //down
        if(r!=maze.length-1){
            sum4 = Math.abs(maze[r][c]-maze[r+1][c]) + check(maze,r+1,c);

        }

        return Math.min(Math.min(sum1,sum2),Math.min(sum3,sum4));

    }

    private static int check(int[][] maze,int r,int c){
        if(r==0 && c==0){
            return Integer.MAX_VALUE-1;
        }
        if(r==maze.length && c==maze[0].length){
            return 0;
        }
        return minimumEffortPath(maze,r,c);
    }
}
