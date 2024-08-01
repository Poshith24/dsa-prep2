package com.posh.leetcode_problems;

public class swap_adjacent_lr {
    public static void main(String[] args) {
        System.out.println(canTransform("RXXLRXRXL","XRLXXRRLX"));
    }
    static boolean canTransform(String start, String end) {
        int flag = 0;
        for(int i=0;i<start.length()-1;i=i+2){
            if(start.substring(i,i+2).equals("RX")){
                if(!end.substring(i,i+2).equals("XR")){
                    return false;
                }
                else{
                    flag=1;

                }

            }
            else if(start.substring(i,i+2).equals("XL")){
                if(!end.substring(i,i+2).equals("LX")){
                    return false;
                }
                else{
                    flag=1;

                }
            }

        }
        int flag2 = 0;

        for(int i =0;i<start.length();i++){
            if(start.charAt(i)!=end.charAt(i)){
                flag2=1;
            }
        }

        if(flag==0){
            if(flag2==1){
                return false;
            }
        }

        // if(flag==false){
        //     for(int i =0;i<start.length();i++){
        //         if(start.charAt(i)!=end.charAt(i)){
        //             return false;
        //         }
        //     }
        // }
        return true;
    }
}
