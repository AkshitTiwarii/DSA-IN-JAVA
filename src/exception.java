/*
Exceptions in Java

There are 3 types of error
1- Compile time
2- Run time
3- Logical Error

So we have to handle the Run Time errors using the exception and exception handling

We use Try, throw and catch statements to solve the run time errors in java

 */
import  java.util.Scanner;

class AkshitError extends Exception{
}

public class exception {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try{
            int c = i/j;
            if (j ==0)
                throw new ArithmeticException();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Exception " + e);
        }
        System.out.println("i = " + i);
    }
}