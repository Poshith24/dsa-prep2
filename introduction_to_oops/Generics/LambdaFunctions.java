package com.posh.introduction_to_oops.Generics;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class LambdaFunctions  {

    public static <Sum> void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i+1);
        }

//        list.forEach((item) -> System.out.println(2*item));

        Consumer<Integer> fun = (item) -> System.out.println(2*item);
        list.forEach(fun);
//        System.out.println(list);

        Operation sum = (a,b) -> a+b;
        Operation diff = (a,b) -> a-b;
        Operation prod = (a,b) -> a*b;
        Operation div = (a,b) -> a/b;

        LambdaFunctions mycalci = new LambdaFunctions();

        int a = mycalci.operate(25,3,sum);

        System.out.println(mycalci.operate(25,5,sum));
        System.out.println(mycalci.operate(25,5,diff));
        System.out.println(mycalci.operate(25,5,prod));
        System.out.println(mycalci.operate(25,5,div));

        String s = null;
         s.toUpperCase();




    }

//    int sum(int a ,int b ){
//        return a+b;
//    }

    private int operate(int a,int b, Operation op){
        return op.operation(a,b);
    }

}

interface Operation{
    int operation(int a,int b);

}
