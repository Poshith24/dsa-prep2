package com.posh;

public class Steps {
    public static void main(String[] args) {
        System.out.println(steps(8));
    }
    static int steps(int n){
        return ans(n,0);
    }

    static int ans(int n,int step){
        if (n==0){
            return step;
        }
        if ((n&1)==0){
            n/=2;
        }
        else{
            n-=1;
        }
        return ans(n,step+1);
    }
}
