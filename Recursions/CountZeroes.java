package com.posh.Recursions;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(func(1010));
        System.out.println(count(1010,0));
    }
    static int count(int n,int count){
        int rem = n%10;
        if (n==0){
            return count;
        }
        if (rem==0){
            count++;
        }
        return count(n/10,count);
    }
    static int func(int n){
//        int digits = (int)Math.log(n)+1;
        return helper(n,0);
    }
    static int helper(int n,int count){
        int rem = n%10;

        if (rem ==0){
            count++;
        }
        if (n==(n%10)){
            return count;
        }
       return helper(n/10,count);
    }

}
