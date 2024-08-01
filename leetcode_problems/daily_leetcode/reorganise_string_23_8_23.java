package com.posh.leetcode_problems.daily_leetcode;

import java.util.*;

public class reorganise_string_23_8_23 {
    public static void main(String[] args) {

        String s= "zqugrfbsznyiwbokwkpvpmeyvaosdkedbgjogzdpwawwl";

//        System.out.println(reorganizeString(s));

//        HashMap<Character,Integer> result = new HashMap<>();
//
//        for(int i=0;i<s.length();i++){
//            char ch = s.charAt(i);
//            if(result.containsKey(ch)){
//                result.put(ch,result.get(ch)+1);
//            }
//            else{
//                result.put(ch,1);
//            }
//        }
//        for(Character key: result.keySet()){
//            System.out.println(key+" "+result.get(key));
//        }
//        System.out.println(result);
        System.out.println(reorganizeString2(s));


//        list.forEach((fruit)->System.out.println(fruit.getKey() + " -> " + fruit.getValue()));
    }


    public static String reorganizeString2(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> freqMap.get(b) - freqMap.get(a));
        maxHeap.addAll(freqMap.keySet());

        StringBuilder res = new StringBuilder();
        while (maxHeap.size() >= 2) {
            char char1 = maxHeap.poll();
            char char2 = maxHeap.poll();

            res.append(char1);
            res.append(char2);

            freqMap.put(char1, freqMap.get(char1) - 1);
            freqMap.put(char2, freqMap.get(char2) - 1);

            if (freqMap.get(char1) > 0) maxHeap.add(char1);
            if (freqMap.get(char2) > 0) maxHeap.add(char2);
        }

        if (!maxHeap.isEmpty()) {
            char ch = maxHeap.poll();
            if (freqMap.get(ch) > 1) return "";
            res.append(ch);
        }

        return res.toString();
    }

    public static String reorganizeString(String s) {

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

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(result.entrySet());

        //Using Entry's comparingByValue() method for sorting in ascending order
        list.sort(Map.Entry.comparingByValue());
        StringBuffer str = new StringBuffer();

        int rem_chars = s.length()-list.get(list.size()-1).getValue()+1;
        int max_char = list.get(list.size()-1).getValue();
        StringBuffer check = new StringBuffer();
        if(max_char ==rem_chars){
            for (int i = list.size() - 2; i >= 0; i--) {
                Map.Entry<Character, Integer> entry = list.get(i);
                Character key = entry.getKey();
                Integer value = entry.getValue();
                int j=0;
                while(j<value){
                    check.append(key);
                    j++;
                }
            }
            Character key = list.get(list.size()-1).getKey();
            int val = list.get(list.size() - 1).getValue();
            int i=0;
            while (val > 0) {
                str.append(key);
                if(i<check.length()){
                    str.append(check.charAt(i));
                }
                val--;
                i++;
            }
        }



        if(max_char<rem_chars) {


            while (list.get(list.size() - 1).getValue() > 0) {


                for (int i = list.size() - 1; i >= 0; i--) {
                    Map.Entry<Character, Integer> entry = list.get(i);
                    Character key = entry.getKey();
                    Integer value = entry.getValue();
                    if (value > 0) {
                        str.append(key);

                    }

                    // Decrease the count by 1
                    entry.setValue(value - 1);

                    // Perform operations on the character (key) if needed
                    // ...
                }
            }
        }

        return str.toString();
    }

}
