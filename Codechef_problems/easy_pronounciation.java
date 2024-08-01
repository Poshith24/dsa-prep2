package com.posh.Codechef_problems;

import java.util.Scanner;

public class easy_pronounciation {

    /* package codechef; // don't place package name! */


        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int i=0;
            while(i<t){
                int n = sc.nextInt();
                String str = sc.next();

                int count =0;
                int flag =0;
                for(int j=0;j<str.length();j++){
                    char ch = str.charAt(j);
                    if(ch=='a' || ch=='e' || ch=='i' || ch =='o' || ch=='u'){
                        count=0;
                    }
                    else{
                        count++;
                    }

                    if(count==4){
                        flag=1;
                        System.out.println("NO");
                        break;
                    }
                }

                if(flag==0){
                    System.out.println("YES");
                }

                i++;
            }
        }


}
