package com.posh.Hashmap;

import java.util.HashMap;

public class hashmap_trying {


        public static void main(String[] args) {
            int[] arr = {13,7,13,7,13,7,13,13,7};

            countFreq(arr);

//            String s = "abcabc";
//            System.out.println(countChar(s));

        }

        static void countFreq(int[] arr){
            HashMap<Integer,Integer> result = new HashMap<>();

            for(int i=0;i<arr.length;i++){
                if (result.containsKey(arr[i])){
                    result.put(arr[i],result.get(arr[i])+1);
                }
                else{
                    result.put(arr[i],1);
                }
            }
//
//            for(Integer key: result.keySet()){
//                System.out.println(key+" "+result.get(key));
//            }
//            System.out.println(result);
            int ans =0;
            for(Integer l: result.keySet()){
                int k = result.get(l);
                int rem3 = k%3;
                if(rem3==0){
                    ans+=k/3;
                }
                else if(rem3==1){
                    if(k==1){
                        ans+=0;
                        break;
                    }
                    boolean flag=true;
                    int a=0;
                    while(flag){
                        k=k-2;
                        a=a+2;
                        if(k%3==0){
                            ans+=k/3;
                            ans+=a/2;
                            flag=false;
                        }
                    }
                }
                else{
                    if(k==2){
                        ans+=1;
                    }
                    else{
                        ans+=rem3;
                        ans++;
                    }

                }
//                if(k%3==0){
//                    ans+=k/3;
//                }
//                else if(k%2==0){
//                    ans +=k/2;
//                }
//                else{
//                    ans =-1;
//                    break;
//                }
            }
            System.out.println(ans);
        }

        static boolean countChar(String s){

            HashMap<Character,Integer> result = new HashMap<>();

            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(result.containsKey(ch)){
                    result.put(ch,result.get(ch)+1);
                }
                else{
                    result.put(ch,1);
                }
            }

            for(Character key: result.keySet()){
                if (result.get(key)%2!=0){
                    return false;
                }
            }
            return true;
        }


}
