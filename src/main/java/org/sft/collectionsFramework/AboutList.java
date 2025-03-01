package org.sft.collectionsFramework;

import java.util.*;

public class AboutList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);

        System.out.println(arrayList.get(0));
        arrayList.add(3);
        System.out.println(arrayList);
        arrayList.add(2, 0);
        System.out.println(arrayList);

        System.out.println(arrayList.size());
        System.out.println(arrayList.indexOf(0));

        System.out.println(arrayList.isEmpty());
       // System.out.println(arrayList.toArray());

        System.out.println(arrayList.remove(2)); // removed zero from the list
        System.out.println(arrayList);

        for(int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        for(int a: arrayList){
            System.out.println(a);
        }

        ListIterator<Integer> listIterator = arrayList.listIterator();

        System.out.println(listIterator.next());
        System.out.println(listIterator.hasNext());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.hasPrevious());

        System.out.println();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }


        List<String> tools = new ArrayList<>();
        tools.add("Selenium");
        tools.add("Appium");
        tools.add("Playwright");
        tools.add("RestAssured");
        tools.add("RestAssured");
        tools.add("Appium");

        System.out.println(tools);
        Collections.sort(tools);
        System.out.println(tools);

    }
}
