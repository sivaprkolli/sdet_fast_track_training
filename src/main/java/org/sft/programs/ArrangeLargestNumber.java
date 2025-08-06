package org.sft.programs;

import java.util.Arrays;

public class ArrangeLargestNumber {
    public static void main(String[] args) {
        int number = 6792;

        char[] digits = String.valueOf(number).toCharArray();

        Arrays.sort(digits);
        for(int i = digits.length -1; i>=0; i--){
            System.out.print(digits[i]);
        }
    }
}
