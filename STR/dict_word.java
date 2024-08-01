package com.posh.STR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// https://leetcode.com/problems/word-break/
public class dict_word {
    public static void main(String[] args) {
            List<String> dict = new ArrayList<>();
            dict.add("aaaa");
            dict.add("aaa");
//        dict.add("rs");
//        dict.add("and");
//        dict.add("cat");


        boolean ad = wordbreak("aaaaaaa",dict);
        System.out.println(ad);
//        System.out.println(wordbreak("catsandog",dict));
    }

    static boolean wordbreak(String str, List<String> dict){
        Collections.sort(dict, Comparator.comparing(String::length));
        while(!str.isEmpty()){
            boolean ad=false ;
            for (int i = 0; i < dict.size(); i++) {
                if(str.startsWith(dict.get(i))){
                    if(dict.contains(str.substring(dict.get(i).length()))){

                    }
                    str=str.substring(dict.get(i).length());
                    ad=true;
                    break;
                }
            }
            if(!ad){
                return false;
            }
        }
        return true;
    }
}
