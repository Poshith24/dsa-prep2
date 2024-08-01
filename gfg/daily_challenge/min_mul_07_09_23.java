package com.posh.gfg.daily_challenge;

public class min_mul_07_09_23 {

    public static void main(String[] args) {

        int[] arr = {3, 4, 65};
        System.out.println(minimumMultiplications(arr,7,66175));
    }


    public static int minimumMultiplications(int[] arr, int start, int end) {

       int ans=  minimumMultiplications(arr,start%100000,end,0);
       return ans==Integer.MAX_VALUE ? -1:ans;
    }

    public static int minimumMultiplications(int[] arr,int s,int e,int count){
            if(s>e){
                return Integer.MAX_VALUE-1;
            }
            if(s==e){
                return count;
            }

            int f=Integer.MAX_VALUE-1;
            count++;
        for (int i = 0; i < arr.length; i++) {
            f = Math.min(minimumMultiplications(arr,(s*arr[i])%100000,e,count),f);
        }
        return f;
    }
}
