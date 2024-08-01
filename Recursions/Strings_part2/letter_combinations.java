package com.posh.Recursions.Strings_part2;

import java.util.ArrayList;
import java.util.List;

public class letter_combinations {
    public static void main(String[] args) {

//        System.out.println(letterCombinations("","789"));
        System.out.println(numcombinations("",4));

    }

    public static List<String> numcombinations(String s,int target){

        if(target==0){
            List<String> l = new ArrayList<>();
            l.add(s);
            return l;
        }

        List<String> list = new ArrayList<>();
        for (int i = 1; i <=6 && i<=target ; i++) {

                char ch = (char)(i+'0');
                list.addAll(numcombinations(s+ch,target-i));

        }
        return list;
    }

    public static List<String> letterCombinations(String p,String digits) {

        if(digits.isEmpty()){
            List<String> s = new ArrayList<>();
            s.add(p);
            return s;
        }

        char ch = 'a';
        char first = digits.charAt(0);
        int a = first-'0';
        a=(a-2)*3;
        ch+=a;
        int looprun =3;
        if(first=='9'){
            looprun =4;
            ch+=1;
        }
        if(first=='8'){
            ch+=1;
        }
        if(first=='7'){
            looprun =4;
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < looprun; i++) {
            List<String> ansbelowcalls = letterCombinations(p+ch,digits.substring(1));
            res.addAll(ansbelowcalls);
            ch +=1;
        }
        return res;
    }
}
