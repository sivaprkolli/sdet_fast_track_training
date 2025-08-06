package org.sft.programs;

import java.util.HashMap;
import java.util.Map;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        String str = "Selenium Automation is easy".toLowerCase();
        int vowelsCount = 0;
        int consonantsCount = 0;
        char[] ch = str.toCharArray();

        Map<Character, Integer> vowelsMap = new HashMap<>();
        Map<Character, Integer> consonantsMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            /*char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z') { // Check if the character is a letter
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }*/
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                vowelsCount++;
            } else {
                consonantsCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);

        for (char c : ch) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelsMap.put(c, vowelsMap.getOrDefault(c,0) + 1);
                }else {
                    consonantsMap.put(c, consonantsMap.getOrDefault(c, 0) + 1);
                }

        }
        System.out.println("Vowels Map: " + vowelsMap);
        System.out.println("Consonants Map: " + consonantsMap);
    }
}

