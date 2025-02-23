package org.sft.accessModifiers;

public class AccessModifiersChild {

    public static void main(String[] args) {
        AccessModifiersParent accessModifiersParent = new AccessModifiersParent();
        System.out.println(accessModifiersParent.c);
        System.out.println(accessModifiersParent.b);
        System.out.println(accessModifiersParent.getD());
        accessModifiersParent.getC();
        accessModifiersParent.getB();
        //accessModifiersParent.test();
    }
}
