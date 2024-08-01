package com.posh.Codechef_problems;

import java.util.Scanner;

public class min_abs_score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i=0;
        while(i<t){
            int n = sc.nextInt();
            String A = sc.next();
            String B = sc.next();
            char[] ch1 = new char[n];
            char[] ch2 = new char[n];

            for(int j=0;j<n;j++){
                ch1[j]= A.charAt(j);
            }
            for(int j=0;j<n;j++){
                ch2[j]=B.charAt(j);
            }
            int sum =0;

            for(int j=0;j<n;j++){

                int x1 = ch1[j];
                int y = ch2[j];
                int opp_a = 219-x1;
                int opp_b = 219-y;
                if(x1>y){
                    if((x1-y)>(opp_b-x1)){
                        sum+= opp_b-x1+1;
                    }
                    else{
                        sum+=(y-x1);
                    }
                }
                else if(y>x1){
                    if((y-x1)>(opp_a-y)){
                        sum+=y-opp_a+1;
                    }
                    else{
                        sum+=(y-x1);
                    }
                }
            }

            if(sum<0){
                sum= -1*sum;
            }
            System.out.println(sum);
            i++;
        }
    }
}
