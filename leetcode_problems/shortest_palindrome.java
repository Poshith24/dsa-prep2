package com.posh.leetcode_problems;

public class shortest_palindrome {
    public static void main(String[] args) {

        System.out.println(shortestPalindrome("aacecaaa"));
    }

    static String shortestPalindrome(String str) {
        int n = str.length();
        boolean flag = false;
        StringBuilder rev = new StringBuilder();
        if(n==0){
            return str;
        }
        else if(n==1){
            char ch = str.charAt(0);
            str+=ch;
            return str;
        }
        else{
            for(int i =n-1;i>0;i--){
                if(isPal(str.substring(0,i+1))){
                    if(i==n-1){
                        return str;
                    }
                    else{
                        String last_str = str.substring(i+1,n);
                        rev.append(last_str);
                        rev.reverse();
                        rev.append(str);
                        flag =true;
                        break;
                    }
                }
            }
        }
        if(!flag){
            String last_str = str.substring(1,n);
            rev.append(last_str);
            rev.reverse();
            rev.append(str);
        }
        String ans = rev.toString();
        return ans;
    }

    static boolean isPal(String str){
        int m = str.length()/2;
        if(str.length()%2==0){

            for(int i=m-1;i>=0;i--){
                for(int j=m;j<str.length()-1;j++){
                    char ch1 = str.charAt(i);
                    char ch2 = str.charAt(j);
                    if(!(Character.compare(ch1,ch2)==0)){
                        return false;
                    }
                }
            }
        }
        else{
            int i = m-1;
            int j = m+1;
            while(i>=0 && j<str.length()){
                char ch1 = str.charAt(i);
                char ch2 = str.charAt(j);
                if(!(Character.compare(ch1,ch2)==0)){
                    return false;
                }
                i--;
                j++;
            }
        }
        return true;
    }
}
