package org.sft.collectionsFramework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AboutSet {

    public static void main(String[] args) {

        Set<String> tools = new HashSet<>();

        tools.add("Selenium");
        tools.add("Appium");
        tools.add("Playwright");
        tools.add("RestAssured");
        tools.add("RestAssured");
        tools.add("Appium");
        System.out.println(tools);

        Set<String> tools1 = new TreeSet<>();

        tools1.add("Selenium");
        tools1.add("Appium");
        tools1.add("Playwright");
        tools1.add("RestAssured");
        tools1.add("RestAssured");
        tools1.add("Appium");
        System.out.println(tools1);
        tools1.add("PostMan");
        System.out.println(tools1);


    }
}
