package com.posh.Recursions.Strings_part2;

import java.util.ArrayList;
import java.util.List;

public class permutatioins {
    public static void main(String[] args) {
        List<String> l = permutationslist("","abc");
        System.out.println(l);
        System.out.println(permutationscount("","abc"));
//     permutations("","abc");
    }

    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            char ch = up.charAt(0);
            permutations(f+ch+l,up.substring(1));
        }
    }

    static List<String> permutationslist(String p,String up){

        if(up.isEmpty()){
            List<String > l = new ArrayList<>();
            l.add(p);
            return l;
        }

        List<String> list= new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            char ch = up.charAt(0);
            List<String> ansfrombelowcalls = permutationslist(f+ch+l,up.substring(1));
            list.addAll(ansfrombelowcalls);
        }
        return list;

    }

    static int permutationscount(String p,String up){

        if(up.isEmpty()){
            return 1;
        }
        int count =0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            char ch = up.charAt(0);
             count += permutationscount(f+ch+l,up.substring(1));
        }
        return count;

    }
}
