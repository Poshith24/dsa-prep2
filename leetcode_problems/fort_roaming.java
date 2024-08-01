package com.posh.leetcode_problems;

// https://leetcode.com/contest/biweekly-contest-94/problems/maximum-enemy-forts-that-can-be-captured/

import com.posh.Arrays.Arraylist;

import java.util.ArrayList;

public class fort_roaming {



    public static void main(String[] args) {


        int[] arr ={-1,-1,1,-1,-1,0};
        System.out.println(captureForts(arr));
    }


    public static int captureForts(int[] forts) {

        ArrayList<Integer> list = new ArrayList<>();

        int a=0;
        for (int i=0;i<forts.length;i++){
            if(forts[i]==1){
                  a = checkforts(forts,i);
                  if(a!=forts.length){
                      if(a!=i+1 && a>0){
                          if(forts[a]!=1){
                              list.add(a-i-1);
                          }
                      }
                      i=a-1;
                  }
                  else{
                      i=forts.length;
                  }

            }
            else if (forts[i]==-1){
                a = checkforts(forts,i);
                if(a!=forts.length){
                    if(a!=i+1 && a>0){
                        if(forts[a]!=-1){
                            list.add(a-i-1);
                        }
                    }
                    i=a-1;
                }
                else{
                    i=forts.length;
                }


            }
        }
        list.trimToSize();
        int max=0;
        for (int j=0;j<list.size();j++){
            if(list.get(j)>max){
                max = list.get(j);
            }
        }

        return max;
    }

    public static int checkforts(int[] arr,int m){

        for(int s=m+1;s<arr.length;s++){

           if (arr[s]!=0){
               return s;
           }
        }
        if(m==arr.length-1){
            return arr.length;
        }
        return arr.length;
    }
}
