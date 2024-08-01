import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        // type casting
//        int num= (int)67.483f;
//        System.out.println(num);

//        int a=260;
//        byte b=(byte)a; // 257 % 256 = 1


//        byte a=40;
//        byte b=50;
//        byte c=100;
//
//        int d = a*b/c;  // a*b operation is doing in integer
//        byte b=50;
//        b=b*2;

//        System.out.println(d);

        int number = 'A'; //ASCII values..
//        System.out.println("你好"); //unicode language..

//        System.out.println(4*8);

        byte b=42;
        char c='a';
        short s=1024;
        int i=50000;
        float f =5.67f;
        double d=0.1234;
        double result= (f*b) + (i/c) - (d*s);
        // float + int - double = double
        System.out.println((int)c);
        System.out.println(i/97);
        System.out.println((f*b) + " " + (i/c)+ " " + (d*s));
        System.out.println(result);
    }
}
