package com.posh.Pattern_problems;

public class Difficult_problem {
    public static void main(String[] args) {
        Pattern(5);
    }
    
    static void Pattern(int n){
        int k=n;
        n=2*n;
        for (int rowno = 1; rowno < n; rowno++) {
            for (int colno = 1; colno < n; colno++) {
                int atEveryIndex = k-Math.min(Math.min(colno,n-colno),Math.min(rowno,n-rowno))+1;
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}

