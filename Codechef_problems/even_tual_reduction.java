package com.posh.Codechef_problems;

import java.util.HashMap;
import java.util.Scanner;

public class even_tual_reduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i =0;
        while(i<t){
            int n = sc.nextInt();
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                for (int k = n-1; k <=0; k++) {
                    if(countChar(s,j,k)){

                    }
                }
            }
            i++;
        }
    }

//    static void replace(String s,int l,int m){
//        for(int i=l;i<m;i++){
//            s.replace(s.charAt(i),'');
//        }
//    }
    static boolean countChar(String s,int l ,int m){

        HashMap<Character,Integer> result = new HashMap<>();

        for(int i=l;i<m;i++){
            char ch = s.charAt(i);
            if(result.containsKey(ch)){
                result.put(ch,result.get(ch)+1);
            }
            else{
                result.put(ch,1);
            }
        }

        for(Character key: result.keySet()){
            if (result.get(key)%2!=0){
                return false;
            }
        }
        return true;
    }
}
