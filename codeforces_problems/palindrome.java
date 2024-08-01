package com.posh.codeforces_problems;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int f=0;
        while(f<t){

            int n= sc.nextInt();
            int q = sc.nextInt();
            String s = sc.next();
            int[] a = new int[q];
            int[] b = new int[q];
            for(int i=0;i<q;i++){
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
            }
            for(int i=0;i<q;i++){
                int ans = func(s.substring(a[i]-1,b[i]));
                System.out.println(ans);
            }
            f++;
        }

    }

    public static int func(String ans){
        int n = ans.length();
        int k= n-1;
        int res =0;
        for(int i=2;i<=n;i++){
            for(int j=0;j<k;j++){
                if(!isPalindrome(ans.substring(j,j+i))){
                    res+=i;
                    break;
                }
            }
            k--;
        }
        return res;
    }

    public static boolean isPalindrome(String str){
        int n= str.length();
        for(int j=0;j<n/2;j++){
            if(str.charAt(j)!=str.charAt(n-j-1)){
                return false;
            }
        }
        return true;
    }
}
