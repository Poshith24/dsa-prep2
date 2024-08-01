package com.posh.leetcode_problems;

import java.util.Arrays;
import java.util.HashMap;

public class equal_strings {
    public static void main(String[] args) {

        System.out.println(checkStrings("mvsisij","msjisvi"));
//        int[] arr ={4,3,2,1};
//        changearr(arr);
//        System.out.println(Arrays.toString(arr));


    }

//    public static void changearr(int[] arr){
//        arr[0] = 89;
//
//    }

    public static boolean checkStrings(String s1, String s2) {
//        if(s1.equals(s2)){
//            return true;
//        }
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        if(!char_count(s1,s2)){
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if(!(ch1[i]==ch2[i] || check(ch1,ch2,i))){
                return false;
            }
        }
        return true;
    }

    public static void swap(char[] ch,int i,int j){
        char cha = ch[i];
        ch[i] = ch[j];
        ch[j] = cha;

    }


    public static boolean check(char[] ch1,char[] ch2,int i){
//        int j=i-2;
//        while(j>=0){
//            if(ch1[i]==ch2[j]){
//                swap(ch2,i,j);
//                return true;
//            }
//            j=j-2;
//        }
         int j=i+2;
        while(j<ch1.length){
            if(ch1[i]==ch2[j]){
                swap(ch2,i,j);
                return true;
            }
            j=j+2;
        }
        return false;
    }

    public static boolean char_count(String s1,String s2){
        HashMap<Character,Integer> result = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(result.containsKey(ch)){
                result.put(ch,result.get(ch)+1);
            }
            else{
                result.put(ch,1);
            }
        }

        HashMap<Character,Integer> result2 = new HashMap<>();

        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(result2.containsKey(ch)){
                result2.put(ch,result2.get(ch)+1);
            }
            else{
                result2.put(ch,1);
            }
        }
        return result.equals(result2);
    }
}

