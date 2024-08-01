package com.posh.leetcode_problems;

public class powx_n {
    public static void main(String[] args) {
        System.out.println(ans());

    }
// 0.9997854232788086
    public static double ans(){
        double x=2;
        int n = 10;
// 0.9997854232788086
        if(n==0){
            return 1.0;
        }

        if(x==1 || x==0){
            return x;
        }
        if(x==-1){
            if(n%2==0){
                return 1;
            }
            else{
                return -1;
            }
        }

        if(x>=2 &&n<=-Integer.MAX_VALUE){
            return 0;
        }
        if(n==Integer.MIN_VALUE){
            x*=x;
            n=n/2;
        }
        if(n<0){
            n*=-1;
            x= 1/x;
        }
        double ans =1;

        while(n>0){
            if((n&2)==1){
                ans *=x;
            }
            x*=x;
            n=n/2;
        }
        return ans;
    }
}
