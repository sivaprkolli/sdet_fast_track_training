package org.sft.singleDesignPatterns;

public class SingletonTest {

    public static void main(String[] args) {
        SingletonPattern st1 =  SingletonPattern.getInstance();
        SingletonPattern st2 =  SingletonPattern.getInstance();
        SingletonPattern st3 =  SingletonPattern.getInstance();

        SingletonTest st = new SingletonTest();
        SingletonTest st4 = new SingletonTest();

        System.out.println(st);
        System.out.println(st4);

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}
