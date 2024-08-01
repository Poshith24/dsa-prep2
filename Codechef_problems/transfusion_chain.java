package com.posh.Codechef_problems;

import java.util.HashMap;
import java.util.Scanner;

public class transfusion_chain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i =0;
        while(i<t){
            int n = sc.nextInt();
            String[] str = new String[n];
            for (int j = 0; j < n; j++) {
                str[j] = sc.next();
            }

            System.out.println(result(str));
            i++;
        }
    }


    static int result(String[] s){

        HashMap<String,Integer> result = new HashMap<>();

        for(int i=0;i<s.length;i++){
            String str = s[i];
            if(result.containsKey(str)){
                result.put(str,result.get(str)+1);
            }
            else{
                result.put(str,1);
            }
        }
        int x,y,z,w;
        x=y=z=w=0;
        if(result.containsKey("A")){
            x=result.get("A");
        }
        if(result.containsKey("B")){
            y=result.get("B");
        } if(result.containsKey("AB")){
            z=result.get("AB");
        } if(result.containsKey("O")){
            w=result.get("O");
        }
        return max(x,y)+z+w;
    }

    static int max(int a,int b){
        return a>b? a:b;
    }
}
