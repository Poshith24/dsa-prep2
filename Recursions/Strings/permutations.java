package com.posh.Recursions.Strings;

import java.util.ArrayList;
import java.util.List;

public class permutations {
    public static void main(String[] args) {
        Permutations("","abc");
//        ArrayList<String> ans = func("","abc");
//        System.out.println(ans);

//        System.out.println(Permutationcount("","abcde"));
    }

    static void Permutations(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            char ch = up.charAt(0);
            String l = p.substring(i,p.length());
            Permutations(f+ch+l,up.substring(1));
        }
    }

    static ArrayList<String> func(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> final_ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            char ch = up.charAt(0);
            String l = p.substring(i,p.length());
            ArrayList<String> Ans_From_Below_Calls = func(f+ch+l,up.substring(1));
            final_ans.addAll(Ans_From_Below_Calls);
        }
        return final_ans;
    }

    static int Permutationcount(String p,String up){
        if (up.isEmpty()){
//            System.out.println(p);
            return 1;
        }
        int count =0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            char ch = up.charAt(0);
            String l = p.substring(i,p.length());
           count+= Permutationcount(f+ch+l,up.substring(1));
        }
        return count;
    }
}
