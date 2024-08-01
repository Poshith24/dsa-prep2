package com.posh.sliding_window;

public class ex {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,2,4,3};

        System.out.println(sumequal(arr,7));

//        int sum =0;
//
//        for (int i = 0; i < 2; i++) {
//            sum+=arr[i];
//        }
//        int k =2;
//        int maxsum = sum;
//        for (int i = 1; i < arr.length; i++) {
//            if(i+k-1<arr.length){
//                sum=sum-arr[i-1]+arr[i+k-1];
//            }
//            maxsum = Math.max(maxsum,sum);
//        }
//        System.out.println(maxsum);
    }

    public static int sumequal(int[] arr,int x){
        int s=0;
        int e =0;
        int sum = 0;
        int min_len = Integer.MAX_VALUE-1;
        int current_sum =0;
        while(s<arr.length && e<arr.length){
              if(current_sum>x){
                  current_sum-=arr[s];
                  s++;
              }
              else if(current_sum<x && e<arr.length){
                  current_sum +=arr[e];
                  if(current_sum!=x){
                      e++;
                  }
              }
              else{
                  int len = e-s+1;
                  min_len = Math.min(len,min_len);
                  current_sum-=arr[s];
                  s++;

              }
        }
        return min_len==Integer.MAX_VALUE-1? 0:min_len;

    }
}
