package com.posh.Recursions;

public class no_of_ways {
    public static void main(String[] args) {

        System.out.println(helper(0,3,2));
    }

    public static int helper(int curr,int steps,int len){
        if(steps==0 && curr==0){
            return 1;
        }
        if(steps==0 && curr!=0){
            return 0;
        }
        int left = curr-1;
        int right = curr+1;
        steps--;
        long ans = helper(curr,steps,len)+helper(curr,steps,left)+helper(curr,steps,right);
//        long ans = 0;
//        if(curr>=0 && curr<=len-1){
//            steps--;
//            ans += helper(curr,steps,len);
//            if(curr>0){
//                int left = curr-1;
//                ans += helper(left,steps,len);
//            }
//            if(curr<len-1){
//                int right = curr+1;
//                ans +=helper(right,steps,len);
//            }
//        }
        return (int)(ans % (long) (Math.pow(10, 9) + 7));

    }
}
