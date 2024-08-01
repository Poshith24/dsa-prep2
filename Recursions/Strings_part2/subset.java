package com.posh.Recursions.Strings_part2;

//import com.posh.Assignment_problems.Array;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public static void main(String[] args) {
//        subset("","abc");
        System.out.println(subsetdupicate(new int[]{1,2,2}));
    }

    public static void subset(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        subset(p+up.charAt(0),up.substring(1));
        subset(p,up.substring(1));
    }

    public static ArrayList<String> subset2(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> left = subset2(p+up.charAt(0),up.substring(1));
        ArrayList<String> right = subset2(p,up.substring(1));
        left.addAll(right);
        return left;

    }

    public static ArrayList<String> subset3(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> left = subset3(p+up.charAt(0),up.substring(1));
        ArrayList<String> ascii = subset3(p+(int)(up.charAt(0)),up.substring(1));
        ArrayList<String> right = subset3(p,up.substring(1));
        left.addAll(ascii);
        left.addAll(right);
        return left;

    }

    public static  List<String> subset4(String up){
        List<String> outer = new ArrayList<>();
        outer.add("");
        for (int i = 0; i < up.length(); i++) {
            char ch = up.charAt(i);
            int n = outer.size();
            for (int j = 0; j < n; j++) {
                String str = outer.get(j);
                str+=ch;
                outer.add(str);
            }
        }

        return outer;

    }
    public static List<List<Integer>> subset4(int[] arr){
       List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int i = 0; i < arr.length; i++) {
            int n= outer.size();
            for (int j = 0; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j)); // create a copy of the list in outer list
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }

    public static List<List<Integer>> subsetdupicate(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start=0;
        int end =0;
        for (int i = 0; i < arr.length; i++) {
            int n= outer.size();
            start=0;
            if(i>0 && arr[i]==arr[i-1]){
                start = end+1;
            }
            for (int j = start; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j)); // create a copy of the list in outer list
                inner.add(arr[i]);
                outer.add(inner);
            }
            end = n-1;
        }
        return outer;
    }

}
