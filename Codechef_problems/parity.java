package com.posh.Codechef_problems;

import java.util.Scanner;

public class parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
       int[] b = new int[n];
       int[] c = new int[n];
       int[] d = new int [n];
       c[0] = 3;
       d[0] =2;

       for(int j=0;j<n;j++){
           b[j] = sc.nextInt();
          if (j!=n-1){
              if(b[j]==0){
                  c[j+1] = c[j];
                  d[j+1] = d[j];
              }
              else{
                  if (c[j]==3){
                      c[j+1] =2;
                  }
                  else{
                      c[j+1] =3;
                  }

                  if(d[j]==2){
                      d[j+1]=3;
                  }
                  else{
                      d[j+1]=2;
                  }
              }
          }
       }

//       for(int j=0;j<n;j++){
//           System.out.print(c[j]+" ");
//       }
//        System.out.println();
//        for(int j=0;j<n;j++){
//            System.out.print(d[j]+" ");
//        }

        if ((c[n-1]+c[0])%2==b[n-1] || (d[n-1]+d[0])%2==b[n-1] ){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
