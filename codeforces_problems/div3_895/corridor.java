package com.posh.codeforces_problems.div3_895;

import java.util.*;

public class corridor {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {


            int n = scanner.nextInt();

            // Create the HashMap
            HashMap<Integer, Integer> hashMap = new HashMap<>();

            // Take inputs in loop
            for (int i = 0; i < n; i++) {
                int key = scanner.nextInt();
                int value = scanner.nextInt();

                // Handle repeated keys
                if (hashMap.containsKey(key)) {
                    int existingValue = hashMap.get(key);
                    hashMap.put(key, Math.min(existingValue, value));
                } else {
                    hashMap.put(key, value);
                }
            }

            // Sort the HashMap by keys
            Map<Integer, Integer> sortedMap = new TreeMap<>(hashMap);
            int[] arr = new int[hashMap.size()];
            int i=0;

            // Print the sorted HashMap
            for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
                arr[i] = ((entry.getValue()-1)/2)+entry.getKey();
                i++;
            }
            Arrays.sort(arr);
            System.out.println(arr[0]);
        }
    }




}
