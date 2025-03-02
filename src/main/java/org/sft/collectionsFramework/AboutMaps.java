package org.sft.collectionsFramework;

import java.util.*;

public class AboutMaps {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Selenium");
        list.add("Appium");
        System.out.println(list);
        Set<String> set = new HashSet<>();
        set.add("RestAssured");
        set.add("Playwright");
        System.out.println(set);

        Map<Integer, String> map = new HashMap<>();
        map.put(4, "Selenium");
        map.put(2, "Appium");
        map.put(3, "RestAssured");
        map.put(5, "WebDriverIO");
        map.put(6, "WebDriverIO");

        System.out.println(map);
        System.out.println(map.get(5));

        //Map.Entry<Integer, String> entry;
        System.out.println(map.entrySet());

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println(map.containsKey(7));
        System.out.println(map.containsValue("Pynt"));

      //  map.remove(6);
        System.out.println(map);


        Map<Integer, String> map1 = new TreeMap<>();
        map1.put(4, "Selenium");
        map1.put(2, "Appium");
        map1.put(3, "RestAssured");
        map1.put(5, "WebDriverIO");
        map1.put(6, "WebDriverIO");

        System.out.println(map1);
        System.out.println(map);


        Map<String, String> map2 = new HashMap<>();
        map2.put("Four", "Selenium");
        map2.put("Two", "Appium");
        map2.put("Three", "RestAssured");
        map2.put("Six", "WebDriverIO");
        map2.put("Five", "WebDriverIO");

        System.out.println(map2);


    }

}
