package com.posh.leetcode_problems;

import java.util.HashMap;

public class minimise_str_len {
    public static void main(String[] args) {
        System.out.println(minimizedStringLength("aaabcd"));
    }

    public static int minimizedStringLength(String s) {
        HashMap<Character,Integer> result = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(result.containsKey(ch)){
                result.put(ch,result.get(ch)+1);
            }
            else{
                result.put(ch,1);
            }
        }
        int sum =0;
        for(Character key: result.keySet()){
            if (result.get(key)%2!=0 | result.get(key)==2){
                sum +=1;
            }
            else{
                sum+=2;
            }
        }
        return sum;
    }
}
