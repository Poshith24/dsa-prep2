package com.posh.introduction_to_oops.ExceptionHandling;

public class run_time_exception_handling {
//    / Java Program to Demonstrate Exception is Thrown
// How the runTime System Searches Call-Stack
// to Find Appropriate Exception Handler

    // Class
// ExceptionThrown


        // Method 1
        // It throws the Exception(ArithmeticException).
        // Appropriate Exception handler is not found
        // within this method.
        static int divideByZero(int a, int b)
        {

            // this statement will cause ArithmeticException
            // (/by zero)
            int i = a / b;

            return i;
        }

        // The runTime System searches the appropriate
        // Exception handler in method also but couldn't have
        // found. So looking forward on the call stack
        static int computeDivision(int a, int b)
        {

            int res = 0;

            // Try block to check for exceptions
            try {

                res = divideByZero(a, b);
            }

            // Catch block to handle NumberFormatException
            // exception Doesn't matches with
            // ArithmeticException
            catch (ArithmeticException ex) {
                // Display message when exception occurs
                System.out.println(
                        "Arithmetic Exception is occurred");
            }
            return res;
        }

        // Method 2
        // Found appropriate Exception handler.
        // i.e. matching catch block.
        public static void main(String args[])
        {

            int a = 1;
            int b = 0;

            // Try block to check for exceptions
            try {
                int i = computeDivision(a, b);
            }

            // Catch block to handle ArithmeticException
            // exceptions
            catch (ArithmeticException ex) {

                // getMessage() will print description
                // of exception(here / by zero)
                System.out.println(ex.getMessage());
            }
        }

}
