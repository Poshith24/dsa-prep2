package com.posh.Recursions.Strings;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
//        ArrayList<String> ans = seq2("","abc");
//        System.out.println(ans);
        System.out.println(seq2Ascii("", "ab"));
    }
    static void seq(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        seq(p+up.charAt(0),up.substring(1));
        seq(p,up.substring(1));
    }

    static ArrayList<String> seq2(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> left =  seq2(p+up.charAt(0),up.substring(1));
        ArrayList<String> right = seq2(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    static void seqAscii(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        seqAscii(p+ch,up.substring(1));
        seqAscii(p + (ch+0),up.substring(1));
        seqAscii(p,up.substring(1));

    }

    static ArrayList<String> seq2Ascii(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first =  seq2Ascii(p+ch,up.substring(1));
        ArrayList<String> second = seq2Ascii(p+(ch+0),up.substring(1));
        ArrayList<String> third = seq2Ascii(p,up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
