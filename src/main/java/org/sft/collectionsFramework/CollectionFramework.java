package org.sft.collectionsFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class CollectionFramework{

    public static void main(String[] args) {
        Collection collection = new TreeSet();
        Collection collection1 = new ArrayList();

        collection1.add("Selenium");
        collection1.add(4.30);
        collection1.add(90876);
        collection1.add('S');
        collection1.add(true);

        int[] a = {1,2,3,4,5};
        System.out.println("array :: " + a);
        System.out.println(collection1);

        System.out.println(a[4]);

        for(int b:a){
            System.out.print(b);
        }

        for (Object obj:collection1){
            System.out.println(obj);
        }

    }
}
