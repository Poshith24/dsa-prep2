package com.posh.leetcode_problems;

public class lexigraphically {

    public static String smallestString(String str) {

        boolean firstcheck = false;
        int first=0;
        int last=0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)!='a') {
                if (!firstcheck) {
                    first = i;
                    firstcheck = true;
                }
            }
                else if(i!=str.length()-1 ){
                    if(str.charAt(i+1)=='a'){
                        last=i;
                        break;
                    }

                }
                else if( i+1==str.length()){

                    last=i;
                    break;
                }

        }
        return prevshift(str,first,last);
    }

    public static String prevshift(String str,int first, int last){

        int i = first;
        StringBuffer string = new StringBuffer(str);

        while(i!=last+1){
            char j;
            if( str.charAt(i)=='a'){
                if(str.length()==1){
                    j='z';
                    string.setCharAt(i,j);
                }
                else{
                    if(i==str.length()-1){
                        j='z';
                        string.setCharAt(i,j);
                    }
                    else{
                        j='z';
                        string.setCharAt(i,j);
                    }
                }

            }
            else{
                j = (char)((int)str.charAt(i)-1);
                string.setCharAt(i, j);
            }
            i++;


        }
        str= string.toString();
        return str;

    }


    public static void main(String[] args) {
        System.out.println(smallestString("aa"));
    }
}
