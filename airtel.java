// The code snippet takes input values for n and k, and then performs a series of calculations using arrays and a HashMap. Finally, it prints the value of f[k][tot].
package com.posh;

import java.util.HashMap;
import java.util.Scanner;

public class airtel {


        static final int N = 105;
        static final int V = (int) 1e9;
        static final int M = (int) 1e5 + 5;
        static final int mod = (int) 1e9 + 7;

        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            int n = scanner.nextInt();
//            int k = scanner.nextInt();
//            int[] L = new int[M];
//            int[] R = new int[M];
//            int[] to = new int[M];
//            int tot = 0;
//            int[][] f = new int[N][M];
//            HashMap<Integer, Integer> mp = new HashMap<>();
//
//            for (int l = 1, r; l <= n; l = r + 1) {
//                r = n / (n / l);
//                ++tot;
//                L[tot] = l;
//                R[tot] = r;
//                mp.put(R[tot], tot);
//            }
//
//            for (int i = 1; i <= tot; ++i) {
//                to[i] = mp.get(n / L[i]);
//            }
//
//            for (int i = 1; i <= tot; ++i) {
//                f[0][i] = 1;
//            }
//
//            for (int i = 1; i <= k; ++i) {
//                for (int j = 1; j <= tot; ++j) {
//                    f[i][j] = (int) ((f[i][j - 1] + 1L * f[i - 1][to[j]] * (R[j] - L[j] + 1)) % mod);
//                }
//            }
//
//            System.out.println(f[k][tot]);
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();
            int k=0;
            while(k<t){

                 int n = sc.nextInt();
//                int n = 7;
//                int[] a = {4,5,5,0,6,4,4};
                 int[] a = new int[n];
                int sum=0;

                 for(int i=0;i<n;i++){
                     a[i] = sc.nextInt();
                     sum+=a[i];
                 }
                 int eq = sum/n;
//                int eq = 4;

                for(int i=0;i<n;i++){
                    a[i]-=eq;
                }
                int i=0;
                int j = n-1;
                boolean flag = true;
                while(i<j){
                    if(a[i]<0 || a[j]>0){
                        flag=false;
                        break;
                    }
                    else if(a[i]==0){
                        i++;
                    }
                    else if(a[j]==0){
                        j--;
                    }
                    else if(a[i]>0 & a[j]<0){
                        int x = a[i]+a[j];
                        if(x<0){
                            a[j] =x;
                            a[i]=0;
                            i++;
                        }
                        else if(x>0){
                            a[i]=x;
                            a[j]=0;
                            j--;
                        }
                        else{
                            a[i]=0;
                            a[j]=0;
                            i++;
                            j--;
                        }
                    }
                }
                for (int l = 0; l < n; l++) {
                    if(a[l]!=0){
                        System.out.println("No");
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    System.out.println("Yes");
                }


                k++;
            }

    }

}
