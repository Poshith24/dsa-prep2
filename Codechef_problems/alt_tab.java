package com.posh.Codechef_problems;

import java.util.HashMap;
import java.util.Scanner;

// https://www.codechef.com/START95D/problems/ALTTAB
public class alt_tab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            int n = sc.nextInt();
            String[] str = new String[n];
            for (int j = 0; j < n; j++) {
                str[j] = sc.next();
            }

            System.out.println(result(str));


    }

    static StringBuffer result(String[] s) {

        HashMap<String, Integer> result = new HashMap<>();

        for (int i = 0; i < s.length; i++) {
            String str = s[i];
            if (result.containsKey(str)) {
                result.put(str, result.get(str) + 1);
            } else {
                result.put(str, 1);
            }
        }
         StringBuffer ans = new StringBuffer("");
        for (int i = s.length-1; i >=0; i--) {
            if(result.get(s[i])>0){
                String z = s[i];
                int n = z.length();
                ans.append(z.charAt(n-2));
                ans.append(z.charAt(n-1));
                result.put(s[i],0);
            }
        }
        return ans;
    }

}
