package com.posh.Codechef_problems;

import java.util.Scanner;

// https://www.codechef.com/START97D/problems/SMILEY
public class schrodinger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int j=0;
        while(j++<t){
            int n = sc.nextInt();
            String s = sc.next();
            boolean flag = false;
            int count =0;
            int ans =0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if(flag){
                    if(ch=='('){
                        count =0;
                        flag = false;
                        break;
                    }
                    else if(ch==':'){
                        if(count>0){
                            ans++;
                        }
                        count =0;
                    }
                    else{
                        count++;
                    }

                }
                if(ch==':'){
                    flag = true;
                }

            }
            System.out.println(ans);
        }

    }
}
