package org.sft.inheritance;

import org.sft.javaBasics.MiscTest;

public class Child extends Parent{

    public static void main(String[] args) {
        Child child = new Child();
        MiscTest misc = new MiscTest();

        child.login();
        child.register();
        System.out.println(child.a);
        misc.payment();
        System.out.println(misc.getTotalValue());
    }
}
