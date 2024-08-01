package com.posh.Linkedlist;
// https://leetcode.com/problems/happy-number/
public class happy_number {

    public static void main(String[] args) {
        System.out.println(isHappy(1));
    }

    public static boolean isHappy(int n) {
        int s=n;
        int f=n;
        do{
            s=Sqrnum(s);
            f=Sqrnum(Sqrnum(f));
            if(s==1 | f==1){
                break;
            }
        }while(s!=f);
        if(s==f){
            return false;
        }
        return true;
    }

    private static int Sqrnum(int num){
        int ans =0;
        while(num>0){
            int rem = num%10;
            ans+=rem*rem;
            num/=10;
        }
        return ans;
    }
}
