package com.posh.gfg.daily_challenge;

public class replace_os_with_xs_04_09_23 {
    public static void main(String[] args) {
        char[][] ch ={{'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'X', 'O', 'O'}};
//        System.out.println(Arrays.);
//        System.out.println(   fill(5,4,ch));
        char[][] ch2 = fill(5,4,ch);
        for (int i = 0; i < ch2.length; i++) {
            for (int j = 0; j < ch2[i].length; j++) {
                System.out.print(ch2[i][j]);
            }
            System.out.println();
        }

    }
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        for(int i=0;i<n;i++){
            boolean isStart = false;
            boolean isEnd = false;
            int s=0;
            int e=0;
            for(int j=0;j<m;j++){
                if(a[i][j]=='X'){
                    if(isEnd){
                        e=j;
                        swap(a,s,e,i);
                        isEnd=false;
                        s=e;
                    }
                    else{
                        s=j;
                        isStart =true;
                    }
                }
                else{
                    if(isStart){
                        isEnd = true;
                    }
                }
            }
        }
        return a;
    }

    static void swap(char[][] a,int s,int e,int f){
        for(int i =s;i<=e;i++){
            a[f][i]='X';
        }
    }
}
