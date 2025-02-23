package org.sft.javaBasics;

public class DefaultAndRuntimeValues {


    String s; // Non-primitive

    /**
     * Numbers
     */
    int a;
    byte b1;
    short s1;
    long l;

    /**
     * decimal
     */
    double d;
    float f;

    /**
     * Not Numbers
     */
    char c;
    boolean b;


    public static void main(String[] args) {
        DefaultAndRuntimeValues defaultAndRuntimeValues = new DefaultAndRuntimeValues();
        System.out.println(defaultAndRuntimeValues.s);
        System.out.println(defaultAndRuntimeValues.a);
        int a = 10;
        defaultAndRuntimeValues.a = a;
        defaultAndRuntimeValues.a = defaultAndRuntimeValues.test1();
        System.out.println("A Value");
        System.out.println(defaultAndRuntimeValues.a);

        System.out.println(defaultAndRuntimeValues.b1);
        System.out.println(defaultAndRuntimeValues.s1);
        System.out.println(defaultAndRuntimeValues.l);
        System.out.println(defaultAndRuntimeValues.d);
        System.out.println(defaultAndRuntimeValues.f);
        System.out.println(defaultAndRuntimeValues.c);
        System.out.println(defaultAndRuntimeValues.b);
    }

    public int test1(){
        int g = 100;
        a = 40;
        return g;
    }


}
