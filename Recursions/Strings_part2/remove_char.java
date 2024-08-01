package com.posh.Recursions.Strings_part2;

public class remove_char {

    public static void main(String[] args) {
        removechar("abccdaef","");
        System.out.println(removechar2("abccdaef"));
    }

    public static void removechar(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
        }
        else{
            char ch = str.charAt(0);
            if(ch!='a'){
                ans+=ch;
            }
            removechar(str.substring(1),ans);
        }
    }

    public static String removechar2(String str){
        String ans ="";
        if(str.length()==0){
            System.out.println(ans);
        }
        else{
            char ch = str.charAt(0);
            if(ch!='a'){
                ans+=ch;
            }
            return ans+removechar2(str.substring(1));
        }
        return "";
    }


}
