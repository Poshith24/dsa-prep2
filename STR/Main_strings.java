package com.posh.STR;

public class Main_strings {

    public static void main(String[] args) {
	 String name="Poshith Kumar";
        String a="Poshith";// Here a is pointing to "Poshith" string
        System.out.println( a);
        a="Kumar"; // Now a is pointing towards "Kumar" and "Poshith" goes by garbage collection coz
        // no ref variable is pointing to "Poshith" so garbage collection will remove those objects from heap.
        // Now a is updated to "Kumar"..
        // String pool -seperate memory collection.and Strings are immutable for security reasons.
        System.out.println(a);
        String name1="Poshith";
        String name2="Poshith";

        System.out.println(name1==name2);
        String c= new String("Poshith");
        String d=new String("Poshith");
        // In the above strings c and d both are objects in heap but not in string pool so they are different objects
        // unlike name1 and name2.
        System.out.println(c==d);
        // When you only need to check values of objects but not their address use .equals method
     System.out.println(c.equals(d));
        // You can use .charAt(index) to find char at the respective index.
        System.out.println(c.charAt(6));


    }
}
