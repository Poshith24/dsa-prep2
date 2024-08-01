package com.posh.leetcode_problems;

public class palindrome_qn {

    public static void main(String[] args) {

        String s = str_conv("1A man, a plan, a canal: Panama1");
        System.out.println(str_rev(s));

    }

    static boolean str_rev(String str){

        for (int i = 0; i < str.length()/2; i++) {
             if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                 return false;
             }
        }
        return true;
    }

    static String str_conv(String str){
        String ans="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch>=65 && ch<=90){
                ch+=32;
                ans+=ch;
            }
            else if((ch>=97 && ch<=122) || (ch>=48 && ch<=57)){
                ans+=ch;
            }
            else{
                ans +="";
            }
        }
        return ans;
    }
}
