package com.posh.Recursions.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        System.out.println(subset(arr));
        List<List<Integer>> ans = subsetDuplicate(arr);
        for (List<Integer> list : ans){
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start =0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start =0;
            if (i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            int n = outer.size();
            for (int j = start; j< n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
            end = n-1;
        }
        return outer;
    }
}
