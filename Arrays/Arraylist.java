package  com.posh.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist<I extends Number> {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>( );


        Scanner in=new Scanner(System.in);
        list.add(72);
        list.add(35);
        list.add(94);
        list.add(343);
        list.add(50);
        list.add(25);
        list.add(13);



        System.out.println(list.contains(35));
        System.out.println(list);
        list.set(2,29);
        System.out.println(list);
            list.add(23);
        System.out.println(list);
        list.add(3,7);
        System.out.println(list);
//        list.clear();
        list.ensureCapacity(5);
//        list.hashCode();
        System.out.println(list.hashCode());
//        list.remove(3);
//        list.remove(4);
//        System.out.println(list.size());
//        list.trimToSize();
//        list.clone();
//        System.out.println(list.add(23));


//        for (int i = 0; i < 5; i++) {
//                list.add(in.nextInt());
//        }
//
//        // get item at any index
//        for (int i = 0; i < 5; i++) {
//            System.out.print (list.get(i)+" "); // pass index her, list[index]
//        }
//        System.out.println();

//        System.out.println(list);

    }
}
