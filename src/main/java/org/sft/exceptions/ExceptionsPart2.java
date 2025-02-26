package org.sft.exceptions;

public class ExceptionsPart2 {
    static int a;

    /**
     * Exception can be handled by catch block only
     *
     * @param args
     */
    public static void main(String[] args) {
        try{
            a = 5/0;
        }finally {
            a=5/4;
        }

        System.out.println(a);
    }
}
