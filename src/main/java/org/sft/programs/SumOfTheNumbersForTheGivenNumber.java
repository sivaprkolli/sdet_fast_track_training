package org.sft.programs;

public class SumOfTheNumbersForTheGivenNumber {

    public static void main(String[] args) {
        int n = 12345; //15

        System.out.println(n%10); // 5
        System.out.println(n/10); // 1234

        System.out.println((0*10)+5);
        System.out.println((5*10)+4);
        System.out.println((54*10)+3);
        System.out.println((543*10)+2);
        System.out.println((5432*10)+1);

        int total = 0;

        while ( n!=0){
            total = total + n%10;
            n = n/10;
        }

        System.out.println(total);
    }
}
