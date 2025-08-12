package org.sft.programs;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        char firstNonRepeatedChar = findFirstNonRepeatedCharacter(str);
        if (firstNonRepeatedChar != '\0') {
            System.out.println("The first non-repeated character is: " + firstNonRepeatedChar);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }

    public static char findFirstNonRepeatedCharacter(String str){
        Map<Character, Integer> map = new HashMap<>();

        char[] chr = str.toCharArray();
        for(char c: chr){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
