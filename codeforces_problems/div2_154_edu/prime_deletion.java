package com.posh.codeforces_problems.div2_154_edu;

import java.util.Scanner;

public class prime_deletion {

    public static void main(String[] args) {
//        String str="abc";
////        String f = str.substring(0,1)+str.substring(2,str.length());
////        System.out.println(f.toString());
////        System.out.println(check_str("123456789"));
//        System.out.println();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();

            String ans = check_str(str);
            if(ans!=null){
                System.out.println(ans);
            }
            else{
                System.out.println(-1);
            }
        }
    }


    public static String check_str(String str){
        if(isPrime(str) && str.length()>=2){
            return str;
        }


        if(str.length()>=2){
            for (int i = 0; i < str.length(); i++) {
                StringBuffer s = new StringBuffer(str);
                String ans;
                if(i==str.length()-1){
                    ans = check_str(s.substring(0,str.length()-1));
                }
                else{
                    ans = check_str(s.substring(0,i)+s.substring(i+1,str.length()));
                }

                if(ans!=null){
                    return ans;
                }
            }
        }

        return null;
    }

    public static boolean isPrime(String str){

        Long n = Long.parseLong(str);
        if(n==1 ){
            return false;
        }
        for (int i = 2; i*i<n  ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
