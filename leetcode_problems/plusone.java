package com.posh.leetcode_problems;

import java.util.Arrays;

// https://leetcode.com/problems/plus-one/

public class plusone {

    public static void main(String[] args) {

        int[] digits={7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        System.out.println(Arrays.toString(plusOne2(digits)));

    }

    public static int[] plusOne(int[] digits) {
        long no=0;

        for(int i=0;i<digits.length;i++){
            no+=digits[i]*pow(10,digits.length-i-1);
        }
        long ans = no+1;
        int digit_count=0;
        long n = ans;
        while(n>0){
            digit_count++;
          n=n/10;
        }
        int[] a = new int[digit_count];
        int i=digit_count-1;
        int l = (int)ans;
        while(ans>0){
            a[i]=(int)(ans%10);
            ans=ans/10;
            i--;
        }

        return a;

    }

    public static int[] plusOne2(int[] arr){

        int n = arr.length;
        int k = arr[n-1];
        int count=0;
        if(k>9){
            for (int i=0;i<n;i++){
//                if(count)
                if(k>9){
                    arr[n-i-1] = k%10;
                    k=k/10;
                    k=arr[n-i-2]+k%10;
                }
                else{
                    i=n;
                }
                count++;
            }

        }
        else{
            arr[n-1]+=1;
        }
        return arr;
    }


//    class Solution {
//        public int[] plusOne(int[] arr) {
//            int n = arr.length;
//            int k = arr[n-1]+1;
//            boolean flag =false;
//            if(k>9){
//                if(n==1){
//                    int[] b = new int[n+1];
//                    b[1]= k%10;
//                    k=k/10;
//                    b[0] = k%10;
//                    return b;
//
//                }
//                else{
//                    for (int i=0;i<n;i++){
//                        if(k>9){
//                            if(n-i-1==0){
//                                int[] b = new int[n+1];
//                                for(int j=0;j<n+1;j++){
//                                    if(j==0){
//                                        b[j]=(k/10)%10;
//
//                                    }
//                                    if(j==1){
//                                        b[j] = k%10;
//                                    }
//                                    b[j] = arr[j];
//                                }
//                                return b;
//                            }
//                            else{
//                                arr[n-i-1] = k%10;
//
//                            }
//
//                            k=k/10;
//                            k=arr[n-i-2]+k%10;
//                        }
//                        else{
//                            i=n;
//                        }
//                    }
//                }
//            }
//            else{
//                arr[n-1]+=1;
//            }
//
//
//            return arr;
//        }
//    }

//    public static int[] rev(int[] arr){
//        for(int i=0;i<arr.length/2;i++){
//            int temp = arr[i];
//            arr[i] = arr[arr.length-i-1];
//            arr[arr.length-i-1] = temp;
//        }
//        return arr;
//    }

    public static long pow(int a,int b){
        long ans =1;
        for(int i=0;i<b;i++){
            ans*=a;
        }
        return ans;
    }
}
