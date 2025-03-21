package org.sft.programs;

public class SumOfTheDigits {

    public static void main(String[] args) {

        String s = "3243252";
        int a = Integer.parseInt(s);
        System.out.println(a);
        int num = 12345;

        System.out.println(60%10); // 0
        System.out.println(60/10); // 6
        System.out.println(a%10); // get last digit
        System.out.println(a/10); // remove the last digit
        int sum=0, reminder=0;
        while (a>0){
            reminder = a%10;
            sum = sum + reminder;
            a = a/10;
        }
        System.out.println(sum);
    }
}
