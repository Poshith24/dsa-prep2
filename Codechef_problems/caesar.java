package com.posh.Codechef_problems;

import java.util.Scanner;

// https://www.codechef.com/START97D/problems/CAESAR
public class caesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int i =0;
        while(i++<f){
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();
            String u = sc.next();
            int diff =0;
            if(s.charAt(0)<t.charAt(0)){
                  diff = (int) t.charAt(0)-s.charAt(0);
//                System.out.println(diff);
            }
            else{
                  diff =26-((int) s.charAt(0)-t.charAt(0));
//                System.out.println(diff);
            }
            StringBuffer ans = new StringBuffer();

        for (int j = 0; j < n; j++) {
            char ch = (char) (u.charAt(j)+diff);
            if(ch>='a' && ch<='z'){
                ans.append(ch);
            }
            else{
                ch = (char)('a'+(char)(ch-'z')-1);
                ans.append(ch);
            }
        }
        System.out.println(ans);

        }
    }
}
