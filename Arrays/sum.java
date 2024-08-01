package com.posh;

public class sum {
    public static void main(String[] args) {
        int[][] arr= {
                {1,2,3},
                {4,1,6},
                {3,3,7}
        };
        sum(arr);


    }
    static void sum(int[][] nums){
        int[] sum=new int[3];
        for (int person = 0; person < nums.length; person++) {
            for (int account = 0; account < nums[person].length; account++) {

                sum[person]+=nums[person][account];
            }

        }

        int max=sum[0];
        for (int i = 1; i < sum.length; i++) {
            if(sum[i]>max){
                max=sum[i];
            }
        }
        System.out.println(max);


    }

}
