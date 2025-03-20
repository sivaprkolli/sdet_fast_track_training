package org.sft.programs;

import java.util.*;

public class FindDuplicatesInString {
    public static void main(String[] args) {
        String tool = "javvvvvaaaaaa";
        char[] chr = tool.toCharArray();

        int counter =0;
        for(int i=0; i<chr.length; i++){
           // System.out.println(chr[i]);

            for(int j=i+1; j<chr.length; j++){
                if(chr[i] == chr[j]){
                    System.out.println(chr[i]);
                }
            }
        }

        System.out.println(counter);


//        Set<Character> set = new TreeSet<>();
//        for(int i=0; i<chr.length; i++){
//            set.add(chr[i]);
//        }
//        System.out.print(set);

        Map<Character, Integer> map = new HashMap<>();
        for(Character c:chr){
            if(map.containsKey(c)){
                System.out.println(map.get(c));
                map.put(c,map.get(c) + 1);
            }else {
                map.put(c, 1);
            }
        }

        System.out.println(map);


    }
}
