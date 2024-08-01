package com.posh.gfg;

import java.util.Arrays;

public class mul_strings {
    public static void main(String[] args) {
        int[] n1 = {1,1};
        int[] n2 = {2};
//        ans(n1,n2);
        System.out.println(ans("-011","0002"));
    }

    public static String ans(String s1,String s2){
//        String s1 ="000001234";
//        String s2 ="00001234";

        boolean flag = true;
        if((s1.charAt(0)=='-' && s2.charAt(0)!='-')|| (s1.charAt(0)!='-' && s2.charAt(0)=='-') ){
            flag=false;
        }

        int nonZeroIndex = -1;
        StringBuilder input = new StringBuilder(s1);
        int k=0;
        if(s1.charAt(0)=='-'){
            k=1;
        }

            while(k++<input.length()){
                if (input.charAt(k) != '0' ) {
                    nonZeroIndex = k;
                    break;
                }
            }




        if (nonZeroIndex != -1) {
            input.delete(0, nonZeroIndex);
        } else {
            input.setLength(1); // Keep one zero if all characters are zeros
        }

        nonZeroIndex = -1;
        StringBuilder input2 = new StringBuilder(s2);

          k=0;
        if(s1.charAt(0)=='-'){
            k=1;
        }

        while(k++<input2.length()){
            if (input2.charAt(k) != '0' ) {
                nonZeroIndex = k;
                break;
            }
        }


        if (nonZeroIndex != -1) {
            input2.delete(0, nonZeroIndex);
        } else {
            input2.setLength(1); // Keep one zero if all characters are zeros
        }
//        System.out.println(input);
//        System.out.println(input2);
        k=0;
        int[] n1 = new int[input.length()];
        while(k<input.length()){
            n1[k] = (int)(input.charAt(k));
            k++;
        }

        k=0;
        int[] n2 = new int[input2.length()];
        while(k<input2.length()){
            n2[k] = (int)(input2.charAt(k));
            k++;
        }

        int[] ans = new int[n1.length+n2.length];
        Arrays.fill(ans,0);
        for (int i = n1.length-1; i >=0; i--) {
             int carry =0;
            for (int j = n2.length-1; j >=0; j--) {
                int pro = n1[i]*n2[j]+carry+ans[i+j+1];
                ans[i+j+1] = pro%10;
                carry = pro/10;
            }
            ans[i] +=carry;
        }

        StringBuffer str = new StringBuffer();
        if(!flag){
            str.append('-');
        }
        int i=0;
        if(ans[0]==0){
            i=1;
        }
        while(i<ans.length){
            str.append((char)(ans[i]+'0'));
            i++;
        }
        return str.toString();
    }
}
