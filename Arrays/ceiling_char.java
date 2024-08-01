package com.posh.Arrays;

public class ceiling_char {
    public static void main(String[] args) {
        char[] letters = {'e','e','e','e','e','e','g','k','o'};
        char target = 'e';
        System.out.println(char_ceiling(letters,target));
        System.out.println(ceiling_solution(letters,target));

    }

    static char char_ceiling(char[] letters,char target){
        int s =0;
        int e = letters.length-1;
        while(s<=e){
            int m = s+e>>1;
            if(letters[m]==target){
                if(m!=letters.length-1){
                    if(letters[m+1]!=letters[m]){
                        return letters[m+1];
                    }
                    else{
                        s = m+1;
                    }

                }
                else{
                    return letters[0];
                }
            }
            else if(target<letters[m]){
                if(m!=s){
                    e=m;
                }
                else{
                    return letters[m];
                }
            }
            else{
                if(m!=letters.length-1){
                    s=m+1;
                }
                else{
                    return letters[0];
                }
            }
        }
        return letters[s];
    }

    static char ceiling_solution(char[] arr,char tar){
        int s =0;
        int e = arr.length-1;
        int n = e;
//        if(arr.length==0){
//            return -1;
//        }
        while(s<=e){
            int m = s+e>>1;
            if(arr[m]>tar){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return arr[s%n];
    }
}
