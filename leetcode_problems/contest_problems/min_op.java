package com.posh.leetcode_problems.contest_problems;

public class min_op {
    public static void main(String[] args) {
        String str="6525479784667";
        long n = Long.parseLong(str);
        System.out.println(n%25);



        System.out.println(minimumOperations("6525479784667"));
//        System.out.println(minimumOperations("11"));

    }

    public static int minimumOperations(String num) {
        if(num.length()==1){
            return 1;
        }

        return min_ops(num,0,num.length());
    }

    public static int min_ops(String str,int count,int res){

        if(str.length()==0){
            return res;
        }
        if(str.length()>0 && div(str)){
            return count;
        }

        if(str.length()>0) {
            count++;
            for (int i = 0; i < str.length(); i++) {

                int ans = min_ops(str.substring(0, i) + str.substring(i + 1, str.length()), count,res);
                res = Math.min(ans, res);
            }
        }
        return res;
    }

    public static boolean div(String str){
        Long n = Long.parseLong(str);

        return n%25==0;
    }
}
