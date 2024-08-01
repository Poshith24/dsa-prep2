package com.posh.codeforces_problems;

    import java.util.ArrayList;
    import java.util.Scanner;

    // https://codeforces.com/contest/1849/problem/B
    public class Monsters {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int i=0;
            while(i++<t){
                int n= sc.nextInt();
                int k= sc.nextInt();
                int[] arr = new int[n];
                for (int j = 0; j < n; j++) {
                    arr[j] = sc.nextInt();
                }
                int count=0;
                ArrayList<Integer> list = new ArrayList<>();
                while(!(count==arr.length)){
                    int m = getMaxIndexRecursive(arr,0,arr.length-1);
                    int maxElement = arr[m];

                    // Checking for any occurrences with smaller indices
//                    for (int x = 0; x < m; x++) {
//                        if (arr[x] == maxElement) {
//                            m = x;
//                            break;
//                        }
//                    }
                    arr[m] = arr[m]-k;
                    if(arr[m]<=0){
                        count++;
                        list.add(m);
                    }
                }
                for (Integer f:list) {
                    System.out.print(f+1+" ");
                }
                System.out.println();
            }
        }

        private static int getMaxIndexRecursive(int[] array, int left, int right) {
            if (left == right) {
                return left; // Base case: single element
            } else if (right - left == 1) {
                return (array[left] >= array[right]) ? left : right; // Base case: two elements
            } else {
                int mid = (left + right) / 2;
                int maxLeftIndex = getMaxIndexRecursive(array, left, mid);
                int maxRightIndex = getMaxIndexRecursive(array, mid + 1, right);
                return (array[maxLeftIndex] >= array[maxRightIndex]) ? maxLeftIndex : maxRightIndex;
            }
        }


    //    public static int max_index(int[] arr){
    //        int max=0;
    //        for (int i=1;i<arr.length;i++) {
    //            if(arr[i]>arr[max]){
    //                max =i;
    //            }
    //        }
    //        return max;
    //    }
    }
