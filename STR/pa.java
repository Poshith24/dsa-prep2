package com.posh.STR;

public class pa {
    public static void main(String[] args) {
        String str = null;
        System.out.println(check_if_palin(str));
    }

    static boolean check_if_palin(String str){
        if( str == null||str.length()==0 ){
            return true;
        }
        str = str.toLowerCase();
        int n = str.length();
        for(int i =0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
