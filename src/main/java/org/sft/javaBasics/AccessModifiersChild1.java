package org.sft.javaBasics;


import org.sft.accessModifiers.AccessModifiersParent;

public class AccessModifiersChild1 {
    public static void main(String[] args) {
        AccessModifiersParent accessModifiersParent = new AccessModifiersParent();
        int c = accessModifiersParent.a;
        accessModifiersParent.getD();

    }
}
