package com.posh.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class trying_all_problems {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String str = "Poshith";
////        char ch = sc.next().charAt(0);
////        System.out.println(search2(str,ch));
//        System.out.println(Arrays.toString(str.toCharArray()));
//
//    }
//
//    static boolean search2(String str,char ch){
//        if(str == null){
//            return false;
//        }
////        char[] arr = str.toCharArray();
////        for(char a:arr){
////            if (a==ch){
////                return true;
////            }
////        }
//        for(char a:str.toCharArray()){
//            if(a==ch){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    static boolean search(String str,char ch){
//
//        if(str==null){
//            return false;
//        }
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==ch){
//                return true;
//            }
//        }
//        return false;
//    }


    public static void main(String[] args) {
        int[] arr ={ 15,3,2,5790,233,25};
        System.out.println(digits(245789909));
//        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int ans =0;
        for(int i=0;i<nums.length;i++){
             if(func2(nums[i])){
                 ans++;
             }
        }
        return ans;
    }
//    static int func(int n){
//        int count =0;
//        while(n>0){
//            n= n/10;
//            count++;
//        }
//        return count;
//    }

    static boolean func2(int n){
        String str = Integer.toString(n);
        if(str.length()%2==0){
            return true;
        }
        return false;
    }
    static int digits(int n){
        if(n <0){
            n*=-1;
        }
        if(n==0){
            return 1;
        }
        return (int)Math.log10(n)+1;
    }
}

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/
/*
class Solution {
    public int findNumbers(int[] nums) {
        int ans =0;
        for(int i=0;i<nums.length;i++){
            int count = func(nums[i]);
            if(count%2==0){
                ans++;
            }
        }
        return ans;
    }
    static int func(int n){
        int count =0;
        while(n>0){
            n= n/10;
            count++;
        }
        return count;
    }
}
 */

/*
class Solution {
    public int findNumbers(int[] nums) {
          int ans =0;
        for(int i=0;i<nums.length;i++){
             if(func(nums[i])){
                 ans++;
             }
        }
        return ans;
    }
    static boolean func(int n){
         String str = Integer.toString(n);
        if(str.length()%2==0){
            return true;
        }
        return false;
    }
}
 */