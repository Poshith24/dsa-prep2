package com.posh;

import java.util.Arrays;
import java.util.Objects;

public class LinearSearchInStrings {
    public static void main(String[] args) {
        String str ="Poshith" ;
//        System.out.println(search(str, 'P'));
        System.out.println(Arrays.toString(str.toCharArray()));
    }

    static boolean search2(String letter,char name){

        if (letter.length()==0){
            return false;
        }

        for(char ch:letter.toCharArray()){
            if (ch==name){
                return true;
            }
        }
        return false;
    }

    static boolean search(String letter,char name){

        if (letter.length()==0){
            return false;
        }

        for (int i = 0; i < letter.length(); i++) {
             if (letter.charAt(i)==name){
                 return true;
             }

        }
        return false;
    }
}
