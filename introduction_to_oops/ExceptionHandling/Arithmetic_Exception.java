package com.posh.introduction_to_oops.ExceptionHandling;

public class Arithmetic_Exception {

    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
//            System.out.println(a/b);
//           int c =  divide(a,b);

            // mimicking an exception
//            throw new Exception("just for fun.");
            String name = "Posh";
            if(name.equals("Posh")){
                throw new MyException("name is posh");
            }
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }

        catch (ArithmeticException e ){

            System.out.println("a normal exception.");
        }

        catch(Exception e){
//            e.printStackTrace();
//            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("this is always execute");
        }



    }

    static int divide(int a,int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("pls do not divide by zero.");
        }
        return a/b;
    }

}
