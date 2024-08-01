package com.posh.Codechef_problems;

import java.util.Scanner;

public class YesYes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i=0;
        while(i<t){

            String str = sc.next();

           if(yesss(str)){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
            i++;
        }
    }

    static boolean yesss(String str){

        int n = str.length();

        for(int j=0;j<n;j++){
            int flag=0;
            char ch = str.charAt(j);
            if(ch=='Y'){
                if(j==n-1){
                    return true;
                }
                else if(str.charAt(j+1)=='e'){
                    flag=1;
                }
            }
            else if(ch=='e'){
                if(j==n-1){
                    return true;
                }
                else if(str.charAt(j+1)=='s'){
                    flag=1;
                }
            }
            else if(ch=='s'){
                if(j==n-1){
                    return true;
                }
                else if(str.charAt(j+1)=='Y'){
                    flag=1;
                }
            }

            if(flag==0){
                return false;
            }
        }
        return true;
    }
}
