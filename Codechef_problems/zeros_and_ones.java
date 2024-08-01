package com.posh.Codechef_problems;

import java.util.HashMap;
import java.util.Scanner;

public class zeros_and_ones {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i =0;
        while(i<t){
            int  n = sc.nextInt();
            String str = sc.next();

            System.out.println(ans(str));
            i++;
        }
    }

    static int ans(String str){

        HashMap<Character,Integer> result = new HashMap<>();
        for(int i =0;i<str.length();i++){
            if (result.containsKey(str.charAt(i))){
                result.put(str.charAt(i),result.get(str.charAt(i))+1);
            }
            else{
                result.put(str.charAt(i),1);
            }
        }
        int n0 =0;
        int n1 =0;

        for(Character key: result.keySet()){
            if(key=='0'){
                n0 = result.get(key);
            }
            if(key=='1'){
                n1 = result.get(key);
            }
        }
        if (n1==str.length()){
            return 1;
        }
        if(n1==0){
            return 0;
        }
        if(n0>=n1){
             return n1;
        }
        else{
            return n0+1;
        }

    }
}
