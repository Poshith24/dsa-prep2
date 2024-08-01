package com.posh.Recursions.Strings;

import java.util.Scanner;

public class Remove_character {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String ans = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i)!='a'){
//                System.out.print(str.charAt(i));
//            }
//        }
//        character(str,0);
//        character2(str,ans);
//        String sol = inbuiltfunc(str);
//        System.out.println(sol);
        System.out.println(skipappnotapple(str));
    }

    static void character(String str,int i){
        if (i==str.length()){
            return;
        }
        if (str.charAt(i)!='a'){
            System.out.print(str.charAt(i));
        }
        character(str,i+1);
    }

    static void character2(String str,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if (ch =='a'){
            character2(str.substring(1),ans);
        }
        else{
            character2(str.substring(1),ans+ch);
        }
    }
    static String inbuiltfunc(String str){
        String ans="";
        if (str.isEmpty()){
            return ans;
        }
        char ch=str.charAt(0);
        if (ch !='a'){
            ans+=ch;
        }
        return ans+inbuiltfunc(str.substring(1));
    }

    static String skipapple(String str){
        if(str.isEmpty()){
            return "";
        }

        if (str.startsWith("apple")){
            return skipapple(str.substring(5));
        }
        else if (str.startsWith("app")){
            return skipapple(str.substring(3));
        }
        else{
            char ch = str.charAt(0);
            return ch+ skipapple(str.substring(1));
        }
    }

    static String skipappnotapple(String str){
        if(str.isEmpty()){
            return "";
        }

        if (str.startsWith("app") && !str.startsWith("apple")){
            return skipappnotapple(str.substring(3));
        }
        else{
            char ch = str.charAt(0);
            return ch+ skipappnotapple(str.substring(1));
        }
    }
}
