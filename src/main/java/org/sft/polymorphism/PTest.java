package org.sft.polymorphism;

public class PTest {

    public static void main(String[] args) {
        PTest pTest = new PTest();
        PParent pParent = new PParent();
        PChild pChild = new PChild();
        pChild.register("SIva");

    }
}
