package org.sft.exceptions;

public class ExceptionsPart1 {

    public static void main(String[] args) {
        int a = 0;
        try{
            System.out.println("Try Block");
           a = 5/0;
        }
        catch (ArithmeticException ae){
            System.out.println("ArithmeticException Block");
            System.out.println(ae.toString());
            a = 5/1;
        }

        finally {
            System.out.println("Finally Block");
            a=5/5;
        }

        System.out.println(a);
    }
}
