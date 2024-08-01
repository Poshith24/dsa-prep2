package com.posh.Ideas;

import java.util.Scanner;

public class youtube_video_id {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the youtube link: ");
        String ytube_link = sc.next();
        for(int i=0;i<ytube_link.length();i++){
            char ch = ytube_link.charAt(i);
            if(ch=='='){
               String str = video_id(ytube_link,i+1);
                System.out.println(str);
                break;
            }
        }

    }

    static String video_id(String str,int i){
        String ans="";
        for(int j=i;j<str.length();j++){
            char ch = str.charAt(j);
            ans = new StringBuilder(ans).append(ch).toString();
        }
        return ans;
    }
}
