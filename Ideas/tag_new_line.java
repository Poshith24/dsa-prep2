package com.posh.Ideas;

import java.util.Scanner;

public class tag_new_line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String s = sc.next();
        StringBuffer str = new StringBuffer(s);
        boolean flag = false;
        long char_count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='<'){
                flag=true;
                System.out.print(str.charAt(i));
//                char_count++;

            }
            else if (str.charAt(i)=='>' && flag){
                System.out.print(str.charAt(i));
                flag=false;
                System.out.println();
//                char_count=0;
            }
//            else if(char_count==200){
//                System.out.print(str.charAt(i));
//                System.out.println();
//                char_count=0;
//            }
            else{
                System.out.print(str.charAt(i));
//                char_count++;

            }

        }
    }
}
