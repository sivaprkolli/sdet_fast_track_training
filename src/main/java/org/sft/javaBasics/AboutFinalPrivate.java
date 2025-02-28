package org.sft.javaBasics;

public class AboutFinalPrivate {
    final int a = 5;
    static int b = 6;

    public static void main(String[] args) {
        AboutFinalPrivate aboutFinal = new AboutFinalPrivate();
       // aboutFinal.a = 10;
        b = 7;
        System.out.println(b);
    }

    private void sum(){
        System.out.println("Private Method");
    }

    private void sum(int a){
        System.out.println("test :: " + a);
    }

    public final void test1(){
        System.out.println("Test 1 final method");
    }

    public final void test1(int a){
        System.out.println("Test 1 final method");
    }
}
