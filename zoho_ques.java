package com.posh;
//import java.util.Tuple;

public class zoho_ques {
    public static void main(String[] args) {
//        System.out.println(zoho("abca"));
//        func();
        System.out.println(func2("aA","aAAbbbb"));
    }

//    public static int func3(){
//        int[] nums = {2,2,3,1};
//        Pair<Integer,Boolean> a = new Pair<Integer,Boolean>(-1,false);
//        Pair<Integer,Boolean> b = new Pair<Integer,Boolean>(-1,false);
//        Pair<Integer,Boolean> c = new Pair<Integer,Boolean>(-1,false);
//        for(int num:nums){
//            if((a.getValue() && a.getKey()==num) || (b.getValue() && b.getKey()==num) || (c.getValue() && c.getKey()==num)){
//                continue;
//            }
//            if(!a.getValue() || a.getKey() <=num){
//                c=b;
//                b=a;
//                a = new Pair<Integer,Boolean>(num,true);
//            }
//            else if(!b.getValue() || b.getKey() <=num) {
//                c = b;
//                b = new Pair<Integer, Boolean>(num, true);
//            }
//            else if(!c.getValue() || c.getKey() <=num) {
//                c = new Pair<Integer, Boolean>(num, true);
//            }
//
//        }
//        if(!c.getValue()){
//            return a.getKey();
//        }
//        return c.getKey();
//
//    }

    public static int func2(String s1,String s2){
        int num =0;
        for(int i=0;i<s2.length();i++){
            if(s1.indexOf(s2.charAt(i))!=-1){
                num++;

            }
        }
        return num;
    }
    public static void func(){
        int num = 5;
        int[] f = new int[num+1];
        for(int i=1;i<=num;i++) f[i] = f[i>>1 ]+(i&1);
        for(int i=0;i<f.length;i++){
            System.out.println(f[i]);
        }
    }

    public static boolean help(String s, int i, int j) {
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }


    public static boolean zoho(String s) {
        int i = 0;
        int j = s.length()-1;

        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else return help(s, i + 1, j) || help(s, i, j - 1);
        }
        return true;
    }
}




