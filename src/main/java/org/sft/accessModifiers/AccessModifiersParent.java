package org.sft.accessModifiers;

public class AccessModifiersParent {
    public int a = 10;
    protected int b = 5;
    int c = 11;
    private int d = 12;

    public int getD(){
        return d;
    }

     void getC(){
        System.out.println("c value : " +  c);
    }

    protected void getB(){
        System.out.println("b value : " +  b);
    }

    private int test(){
        return  d+d+d;
    }
}
