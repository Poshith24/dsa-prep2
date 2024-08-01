package com.posh.Codechef_problems;

import java.util.Scanner;

public class codechef_problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long count =0;
        if(n!=1){
            for(int i =1;i<n/2;i++){
                for(int j=1;j<n;j++){
                    if((i+j)>n){
                        break;
                    }
                    else if((i+j)==n){
                        if(i!=j){
                            count+=2;
                        }
                        else{
                            count+=1;
                        }

                    }
                }
            }
        }
        System.out.println(count);
    }
}
