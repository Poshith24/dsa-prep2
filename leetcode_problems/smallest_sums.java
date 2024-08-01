//package com.posh.leetcode_problems;
//
//import com.posh.Assignment_problems.Array;
//
//import java.util.ArrayList;
//import java.util.List;
////import javafx.util;
//
//// https://leetcode.com/problems/find-k-pairs-with-smallest-sums/
//public class smallest_sums {
//    public static void main(String[] args) {
//        System.out.println(kSmallestPairs(new int[]{1,2},new int[]{3},3));
//    }
//
//    public static List<List<Integer>> smallest_pairs(int[] arr1,int[] arr2, int k){
////        pair<Integer,Pair<Integer,Integer>>
//    }
//    public static List<List<Integer>> kSmallestPairs(int[] arr1, int[] arr2, int k) {
//        List<List<Integer>> list = new ArrayList<List<Integer>>();
//        int m  = arr1.length;
//        int n = arr2.length;
//        if(k>=m*n){
//            for (int i = 0; i < m; i++) {
//                for (int j = 0; j < n; j++) {
//                    List<Integer> innerlist = new ArrayList<Integer>();
//                    innerlist.add(arr1[i]);
//                    innerlist.add(arr2[j]);
//                    list.add(innerlist);
//                }
//            }
//            return list;
//        }
//        if(k==1){
//            List<Integer> innerlist = new ArrayList<Integer>();
//            innerlist.add(arr1[0]);
//            innerlist.add(arr2[0]);
//            list.add(innerlist);
//            return list;
//        }
//        int j=0;
//        int l =0;
//        int f =0;
//        while(j<k){
//            int a1min = arr1[l];
//            int a2min = arr2[f];
//            if(a1min<a2min){
//                if((k-j)>=n){
//                    for (int i = f; i < n; i++) {
//                        List<Integer> innerlist = new ArrayList<Integer>();
//                        innerlist.add(arr1[l]);
//                        innerlist.add(arr2[i]);
//                        list.add(innerlist);
//                    }
//                    j+=n;
//                    l++;
//                }
//                else{
//                    for (int i = f; i < k-j; i++) {
//                        List<Integer> innerlist = new ArrayList<Integer>();
//                        innerlist.add(arr1[l]);
//                        innerlist.add(arr2[i]);
//                        list.add(innerlist);
//                    }
//                    j=k;
//                    l++;
//                }
//            }
//            else{
//                if((k-j)>=m){
//                    for (int i = l; i < m; i++) {
//                        List<Integer> innerlist = new ArrayList<Integer>();
//                        innerlist.add(arr1[i]);
//                        innerlist.add(arr2[f]);
//                        list.add(innerlist);
//                    }
//                    j+=m;
//                    f++;
//                }
//                else{
//                    for (int i = l; i < k-j; i++) {
//                        List<Integer> innerlist = new ArrayList<Integer>();
//                        innerlist.add(arr1[i]);
//                        innerlist.add(arr2[f]);
//                        list.add(innerlist);
//                    }
//                    j=k;
//                    f++;
//                }
//            }
//        }
//        return list;
//
//
//    }
//}
