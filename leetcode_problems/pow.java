package com.posh.leetcode_problems;
// https://leetcode.com/problems/powx-n/

// solution for reference - https://leetcode.com/problems/powx-n/solutions/19542/python-solution-o-logn-59ms/

public class pow {

    public static double Pow(double x,int n){


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

        if(n<=-Integer.MAX_VALUE){
            return 0;
        }
        if(n<0){
            n*=-1;
            x= 1/x;
        }
        double ans =1;

        for(long i=0;i<n;i++){
            ans*=x;
        }
        return ans;
    }


    public static void main(String[] args) {

        System.out.println(Pow(2.00000,-2147483647));
    }
}
