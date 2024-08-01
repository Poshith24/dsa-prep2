package com.posh.Recursions;

public class count {
    public static void main(String[] args) {
        System.out.println(func(10));
    }
    static int func(int n){
        return count(n,0);
    }
    static int count(int n,int count){
        if (n==0){
            return count;
        }
        if ((n&1)==1){
            count++;
        }
        return count(n>>1,count);
    }
    static int count2(int n,int count){
        if (n==0){
            return count;
        }
        if ((n&1)==0){
            count++;
        }
        return count2(n>>1,count);
    }
}
