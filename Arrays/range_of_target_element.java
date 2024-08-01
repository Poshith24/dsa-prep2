package com.posh.Arrays;

import java.util.Arrays;

public class range_of_target_element {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int tar = 7;
//        int[] ans = new int[2];
//        int tar = 8;
//        ans[0] = range_min(arr,tar);
//        ans[1] = range_max(arr,tar);
//        System.out.println(Arrays.toString(ans));
//        System.out.println(Arrays.toString(range_max_min(arr,tar)));

        System.out.println(range_min(arr,tar));
        System.out.println(range_max(arr,tar));
    }

    static int range_min(int[] arr,int tar){
        int s =0;
        int e = arr.length-1;

        while(s<=e){
            int m = s+e>>1;
            if(arr[m]<tar){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return s;
    }

    static int range_max(int[] arr,int tar){
        int s =0;
        int e = arr.length-1;

        while(s<=e){
            int m = s+e>>1;

            if(arr[m]>tar){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return e;
    }

//    static int[] range_max_min(int[] arr,int tar,boolean isFirstIndex){
//        int s =0;
//        int e = arr.length-1;
//        int[] ans={-1,-1};
//
//        while(s<=e){
//            int m = s+e>>1;
//
//            if(arr[m]>tar){
//                e=m-1;
//            }
//            else if(arr[m]<tar){
//                s=m+1;
//            }
//            else{
//               if(!isFirstIndex){
//                   if(m!=arr.length-1){
//                       if(arr[m+1]!=arr[m]){
//                           ans[1]=m;
//                       }
//                       else{
//                           s=m+1;
//                       }
//                   }
//                   else{
//                       arr[1] =m;
//                   }
//               }
//               else{
//                if(m!=s){
//                    if(arr[m-1]!=arr[m]){
//                         ans[0]=m;
//                    }
//                    else{
//                        e=m-1;
//                    }
//                }
//                else{
//                     ans[0]=m;
//                }
//            }
//        }
//        return ans;
//    }
}
