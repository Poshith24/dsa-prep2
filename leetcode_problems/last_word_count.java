package com.posh.leetcode_problems;
// https://leetcode.com/problems/length-of-last-word/
public class last_word_count {

    public static void main(String[] args) {

        System.out.println(count("Hello World     "));
    }

    public static int count(String str){
            int count=0;
            int countb=0;
            for (int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(ch==' '){
                    if(count!=0){
                        countb=count;
                    }
                    count=0;
                }else{
                    count++;
                }
            }
            if (count==0){
                return countb;
            }
            return count;
    }
}
