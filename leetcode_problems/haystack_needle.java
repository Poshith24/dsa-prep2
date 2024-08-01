package com.posh.leetcode_problems;

public class haystack_needle {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi","pi"));
    }

    static int strStr(String haystack, String needle) {
        char check = needle.charAt(0);
        if( needle.length()==1){
            if(haystack.length()==1){
                char ch = haystack.charAt(0);
                if(check==ch){
                    return 0;
                }
            }
            else{
                for(int i=0;i<haystack.length();i++){
                    char ch2 = haystack.charAt(i);
                    if(ch2==check){
                        return i;
                    }
                }
            }

        }

        if(needle.length()<=haystack.length()){
            if(needle.length()==haystack.length()){
                if(needle.equals(haystack)){
                    return 0;
                }
            }
            for(int i=0;i<haystack.length();i++ ){
                char ch = haystack.charAt(i);
                if(ch==check){
                    if(i+needle.length()<=haystack.length()){
                        String check2 = haystack.substring(i,i+needle.length());
                        if(check2.equals(needle)){
                            return i;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
