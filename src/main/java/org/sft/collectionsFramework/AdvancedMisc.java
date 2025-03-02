package org.sft.collectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdvancedMisc {

    public static void main(String[] args) {
        List<String> tools = new ArrayList<>();
        tools.add("Selenium");
        tools.add("Appium");
        tools.add("Playwright");
        tools.add("RestAssured");
        tools.add("RestAssured");
        tools.add("Appium");
        //System.out.println(tools);


        String[] test = {"Selenium", "Appium","Playwright","RestAssured"};
        List<String> techStack = Arrays.asList(test);
        System.out.println(techStack);

        List<List<String>> list = new ArrayList<>();
        list.add(tools);
        list.add(techStack);
        System.out.println("**********************List**************************");
        System.out.println(list);

        for(List<String> lis: list){
            System.out.println(lis);
        }


    }
}
