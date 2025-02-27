package org.sft.javaBasics;

public class ParentTest {
    int a = 10;

    public ParentTest(){
        System.out.println("Default ParentTest");
    }

    public ParentTest(int a){
        System.out.println("Parametrized ParentTest ::"  + 1);
    }

    public ParentTest(String s){
        System.out.println("Parametrized String ParentTest ::"  + s);
    }
    public void test1(){
        System.out.println("Test1");
    }
}
