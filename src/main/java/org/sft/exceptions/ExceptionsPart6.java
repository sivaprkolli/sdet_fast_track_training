package org.sft.exceptions;

public class ExceptionsPart6 {
    public static void main(String[] args) {
        int i=0;
        try{
            int j=5/i;
            if(i==0){
                throw new ArithmeticException("Please check your math code");
            }
        }catch (ArithmeticException e){
            int j = 5/1;
        }
    }
}
