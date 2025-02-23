package org.sft.javaBasics;

import org.sft.accessModifiers.AccessModifiersParent;

public class AccessModifiersChild2 extends AccessModifiersParent{
    public static void main(String[] args) {
        AccessModifiersChild2 accessModifiersParent = new AccessModifiersChild2();
        int c = accessModifiersParent.b;
        accessModifiersParent.getB();
        accessModifiersParent.getD();
    }
}
