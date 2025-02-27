package org.sft.exceptions;

public class CustomException{

    public static void main(String[] args) {

        try{
            int i=5/0;
            throw new SFTException("Please check the math code written by you");
        }catch (Exception e){
            System.out.println("Catch");
        }
    }
}
