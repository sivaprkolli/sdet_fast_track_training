package org.sft.programs;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 98765;
        int reminder=0;
        int reverseNumber = 0;

        /**
         * 15 % 10 = 5
         *
         * 25 % 10 = 5
         *
         * (5676750 +6)% 10 =
         *
         */
        System.out.println(n%10);
        System.out.println(n/10);
        System.out.println((reverseNumber*10)+ 5);
        System.out.println((5*10)+ 6);
        System.out.println((56*10)+ 7);
        System.out.println((567*10)+ 8);
        System.out.println((5678*10)+ 9);
        System.out.println((56789*10)+ 0);

        while (n!=0){
            reminder = n%10;
            reverseNumber = reverseNumber*10 + reminder;
            n = n/10;
        }
        System.out.println("reverseNumber :: " + reverseNumber);
    }
}
