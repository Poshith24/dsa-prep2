package com.posh.leetcode_problems.daily_leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class extra_characters_02_09_23 {

    public static void main(String[] args) {
        String[] dict = {"leet","code","leetcode"};

        String str = "scode";
//        System.out.println(str.substring(1));

//        System.out.println(dict[0]);
//        System.out.println(str.substring(1,4));
        System.out.println(minExtraChar2("leetscode",dict));
    }


    public static int minExtraChar(String str, String[] dictionary) {
        int n = str.length();
        int i=0;

        // colloycollotkvzqpdaumuqgs
        int count=0;
        while(i<n){
            boolean hell = false;
            int max =0;
            for (int j = 0; j < dictionary.length; j++) {

                if(dictionary[j].length()<=str.length()){
                    if(str.substring(0, dictionary[j].length()).equals(dictionary[j])){
                       if(max<dictionary[j].length()){
                           max = dictionary[j].length();
                       }
                    hell = true;

                    }

                }
            }

            if(!hell){
                count++;
                str= str.substring(1);
                i++;
            }
            else{
                str=str.substring(max);
                i=i+max;
            }
        }
        return count;
    }

    public static int minExtraChar2(String str, String[] dictionary) {

        Set<String> check = new HashSet<>(Arrays.asList(dictionary));
        int[] dp = new int[str.length()+1];
        Arrays.fill(dp,str.length()+1);
        dp[0] =0;
        for (int i = 1; i <= str.length(); i++) {
            dp[i]=dp[i-1]+1;
            for (int j = 1; j <=i ; j++) {
                if(check.contains(str.substring(i-j,i))){
                    dp[i] = Math.min(dp[i],dp[i-j]);
                }
            }
        }
        return dp[str.length()];
    }


}
