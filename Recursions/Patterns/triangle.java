package com.posh.Recursions.Patterns;

public class triangle {
    public static void main(String[] args) {
        func2(4,0);
    }
    static void func(int r,int c){

        if (r==0){
            return;
        }
        if(r>c){
            System.out.print("* ");
            func(r,c+1);
        }
        else{
            System.out.println();
            func(r-1,0);
        }
    }

    static void func2(int r,int c){
        if (r==0){
            return;
        }
        if(r>c){
            func2(r,c+1);
            System.out.print("* ");

        }
        else{
            func2(r-1,0);
            System.out.println();
        }
    }
}
