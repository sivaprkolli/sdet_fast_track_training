package org.sft.collectionsFramework;

import org.sft.abstraction.Interface4;

public class WrapperClass {
    public static void main(String[] args) {
        String s = "0"; // non p
        int i = 5; // premitive

        String s1 = new String("Selenium");
        //Character c = new Character('c');
        // Integer  k = new Integer(5); // deprecated

        Integer l = 9;
        System.out.println(l.intValue());

        System.out.println(Integer.parseInt(s)+1);
        System.out.println(Integer.valueOf(s));

        System.out.println("Test"+i);
        String s3 = "Test"+i;
        String s4 = "Test5";
        System.out.println(s3);

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(String.valueOf(l));
    }

}
