package org.sft.programs;

public class ReverseAString {

    public static void main(String[] args) {
        String s = "Selenium";

        for (int i = s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }

        System.out.println();
        char[] c = s.toCharArray(); // {'S','e'......}

        for(int j=c.length-1; j>=0; j--){
            System.out.print(c[j]);
        }
    }
}
