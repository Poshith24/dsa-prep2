package com.posh;

public class power  {
    public static void main(String[] args) {
        double ans = myPow(2,10);
        System.out.println(ans);
    }

        static double myPow(double x, int n) {
            double power=x;
            for(int i=1;i<=n;i++){
                power*=2;
            }
            return power;
        }

}
