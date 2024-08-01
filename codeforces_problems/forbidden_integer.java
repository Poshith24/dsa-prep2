package com.posh.codeforces_problems;

import java.util.Scanner;

// https://codeforces.com/contest/1845/problem/0

public class forbidden_integer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            if(n==k & n!=x){
                System.out.println("YES");
                System.out.println(n);
            }
            else if(k>=1 && x!=1){
                System.out.println("YES");
                for (int i = 0; i < n; i++) {
                    System.out.print(1+" ");
                }
                System.out.println();
            }
            else if(k==1 && x==1){
                System.out.println("NO");
            }
            else if(k==2 && x==1){
                if(n%k==0){
                    int z = n/k;
                    System.out.println("YES");
                    for (int i = 0; i < z; i++) {
                        System.out.print(2+" ");
                    }
                    System.out.println( );
                }
                else{
                    System.out.println("NO");
                }
            }
            else if(k!=1 && x==1){
                if(n%2==0){
                    int z = n/2;
                    System.out.println("YES");
                    for (int i = 0; i < z; i++) {
                        System.out.print(2+" ");
                    }
                    System.out.println();
                }
                else{
                    if(check(n,k)){
                        System.out.println("YES");
                        System.out.println(n);
                    }
                    else if(sum(n,k)){
                        System.out.println("YES");
                        for (int i = 2; i <=k; i++) {
                            System.out.print(i+" ");
                        }
                        System.out.println();
                    }
                    else{
                        int s=1;
                        while((n-s*2)!=3){
                            s++;
                        }
                        System.out.println("YES");
                        for (int i = 0; i < s; i++) {
                            System.out.print(2+" ");
                        }
                        System.out.println(3);
                    }

                }
            }
        }
    }

    public static boolean check(int n,int k){
        if(n>k){
            return false;
        }
        return true;
    }
    public static boolean sum(int n,int k){
        long sum =0;
        for (int i = 2; i <=k; i++) {
            sum+=i;
        }
        return sum==n;
    }

}
