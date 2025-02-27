package org.sft.javaBasics;

public class ChildTest extends ParentTest{



    public ChildTest(int a){
        System.out.println("Child parameter Constructor :: " +a);
    }

    public ChildTest(String a){
        System.out.println("Child String parameter Constructor :: " +a);
    }

    public static void main(String[] args) {
        ChildTest childTest = new ChildTest(5);
    }
}
