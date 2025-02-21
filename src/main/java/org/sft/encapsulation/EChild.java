package org.sft.encapsulation;

public class EChild extends EParent{

    public static void main(String[] args) {
        EChild child = new EChild();
        // int b = child.a;
        int c= child.getAValue();
        System.out.println(c);
    }
}
