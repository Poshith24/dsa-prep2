package com.posh.Recursions.backtracking;

import java.util.ArrayList;
import java.util.List;

public class countpath {
    public static void main(String[] args) {
//        System.out.println(count_poss(3,3));
//        path(3,3,"");
//        pathdi(3,3,"");
//        System.out.println(count_possdi(3,3));
//        System.out.println(pathretdi(3,3,""));
//        boolean[][] maze = new boolean[3][3];
//        maze[1][1] =true;
//         allpaths(0,0,"",maze);
    }

    static int count_poss(int r,int c){
        if(c==1 || r==1){
            return 1;
        }

        int count=0;
        count+=count_poss(r-1,c);
        count+=count_poss(r,c-1);
        return count;
    }

    static void path(int r,int c,String str){

        if(r==1 && c==1){
            System.out.println(str);
            return;
        }
        if(r>1){
            path(r-1,c,str+"D");
        }
        if(c>1){
            path(r,c-1,str+"R");

        }
    }

    static List<String> pathret(int r, int c, String str){

        if(r==1 && c==1){
             List<String> l = new ArrayList<>();
             l.add(str);
             return l;
        }
        List<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathret(r-1,c,str+"D"));
        }
        if(c>1){
            list.addAll(pathret(r,c-1,str+"R"));
        }
        return list;
    }

    static void pathdi(int r,int c,String str){
        if(r==1 && c==1){
            System.out.println(str);
            return;
        }
        if(r>1){
            pathdi(r-1,c,str+"D");
        }
        if(c>1){
            pathdi(r,c-1,str+"R");

        }
        if(r>1 && c>1){
            pathdi(r-1,c-1,str+"Di");
        }
    }

    static int count_possdi(int r,int c){
        if(c==1 || r==1){
            return 1;
        }

        int count=0;
        count+=count_possdi(r-1,c);
        count+=count_possdi(r,c-1);
        count+=count_possdi(r-1,c-1);
        return count;
    }

    static List<String> pathretdi(int r, int c, String str){

        if(r==1 && c==1){
            List<String> l = new ArrayList<>();
            l.add(str);
            return l;
        }
        List<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathretdi(r-1,c,str+"D"));
        }
        if(c>1){
            list.addAll(pathretdi(r,c-1,str+"R"));
        }
        if(r>1 && c>1){
            list.addAll(pathretdi(r-1,c-1,str+"Di"));
        }
        return list;
    }

//  river as an obstacle.
    static List<String> pathretriv(int r, int c, String str,boolean[][] maze){

        if(r==maze.length-1 && c==maze[0].length-1){
            List<String> l = new ArrayList<>();
            l.add(str);
            return l;
        }
        List<String> list = new ArrayList<>();
        if(r<maze.length-1 && !maze[r+1][c]){
            list.addAll(pathretriv(r+1,c,str+"D",maze));
        }
        if(c<maze[0].length-1 && !maze[r][c+1]){
            list.addAll(pathretriv(r,c+1,str+"R",maze));
        }
        return list;
    }
    // all paths are allowed.

    static void allpaths(int r, int c, String str,boolean[][] maze){

        if(r==maze.length-1 && c == maze[0].length-1){
            maze[r][c] = false;
                System.out.println(str);

            return;
        }

        if(r<maze.length-1 && !maze[r+1][c]){
            maze[r+1][c] = true;
            allpaths(r+1,c,str+"D",maze);
        }
        if(c<maze[0].length-1 && !maze[r][c+1]){
            maze[r][c+1] = true;
            allpaths(r,c+1,str+"R",maze);
        }
        if(r>0 && !maze[r-1][c]){
            maze[r-1][c] = true;
            allpaths(r-1,c,str+"U",maze);
        }
        if(c>0 && !maze[r][c-1]){
            maze[r][c-1]=true;
            allpaths(r,c-1,str+"L",maze);
        }
    }
}
