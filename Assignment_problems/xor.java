package com.posh;

public class xor {
    public static void main(String[] args) {
        int a= 3,b=9;
        System.out.println(ans(b)^ans(a-1));

    }

    static int ans(int a){
        int ans=0;
        if (a%4==0){
            ans=a;
        }
        if (a%4==1){
            ans=1;
        }
        if (a%4==2){
            ans=a+1;
        }
        if (a%4==3){
            ans=0;
        }
        return ans;
    }
}
