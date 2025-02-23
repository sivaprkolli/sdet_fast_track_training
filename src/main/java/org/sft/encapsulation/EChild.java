package org.sft.encapsulation;

public class EChild extends EParent{

    public static void main(String[] args) {
        EChild child = new EChild();
        child.setA(5);
        int a = child.getA();
        System.out.println(a);
        child.setName("Appium");
        System.out.println(child.getName());
    }
}
