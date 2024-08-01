package com.posh.leetcode_problems;

import java.util.ArrayList;
import java.util.HashMap;

// https://leetcode.com/problems/buddy-strings/
public class buddy_strings {
    public static void main(String[] args) {

        System.out.println(buddyStrings("ab","ab"));
    }

    public static boolean buddyStrings(String s, String goal) {
        if(s.length()==0 || goal.length()==0){
            return false;
        }



        if(s.length()!=goal.length()){
            return false;
        }
        else{
            ArrayList<Integer> list = new ArrayList<>();
            int i =0;
            long count =0;
            while(i<s.length()){
                if(s.charAt(i)!=goal.charAt(i)){
                    count++;
                    list.add(i);
                }
                i++;
            }
            if(count==0 && check_hash(s) ){
                return true;
            }
            if(count==2){
                if(check(s,list.get(0),list.get(1),goal)){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean check(String s,int i,int j,String goal){
            if(s.charAt(i)==goal.charAt(j) && s.charAt(j)==goal.charAt(i)){
                return true;
            }
            return false;
    }

    public static boolean check_hash(String s){


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

            for(Character key: result.keySet()){
                if (result.get(key)>=2){
                    return true;
                }
            }
            return false;

    }

}
