package com.posh.Assignment_problems;

public class Three_bit {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2,7,7,8,7,8,8};
        int ans =0;
        for (int i = 0; i < arr.length; i++) {
            int b = Integer.parseInt(Integer.toBinaryString(arr[i]));
            ans+=b;
        }
        int final_sol = 0;
        int i = 0;
        while(ans>0){
            int rem = ans %10;
            int useful_num = rem%3;
            final_sol = useful_num * (int)Math.pow(2,i) +final_sol;
            ans/=10;
            i++;
        }
        System.out.println(final_sol);
//        System.out.println(ans);
//        int no_of_digits = (int)Math.log(Math.sqrt(ans));
    }
}
