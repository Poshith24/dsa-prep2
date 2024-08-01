package com.posh.STR;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder(); // Just like arrays String builder is muttable
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        System.out.println(builder.charAt(0));
        builder.deleteCharAt(1);
        builder.delete(0,3);
        builder.reverse();
        System.out.println(builder.capacity());
        System.out.println(builder.length());
        System.out.println(builder.isEmpty());
        builder.trimToSize();
        System.out.println(builder.capacity());
        builder.setLength(21);
      builder.insert(1,15);
        System.out.println(builder);

    }
}
