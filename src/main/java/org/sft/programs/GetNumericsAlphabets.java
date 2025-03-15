package org.sft.programs;

public class GetNumericsAlphabets {
    public static void main(String[] args) {
        String str = "S1e2le3n4i5u6m@123$50%99";
        char[] chr = str.toCharArray();

        System.out.println(Character.isLetter(chr[0]));
        System.out.println(Character.isLetter(chr[3]));
        System.out.println(Character.isDigit(chr[3]));

        System.out.println(str.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll("[^0-9]",""));

        System.out.println(str.replaceAll("[^a-zA-Z]",""));

        System.out.println("************");
        System.out.println(str.replaceAll("[^0-9a-zA-Z]",""));
        System.out.println(str.replaceAll("$@%",""));

        String cost = "$5.99";
        double cost1 = 6.99;
        //System.out.println(Double.valueOf(cost)); // number format exception

        String actualCost = cost.replace("$",""); //5.99
        System.out.println(actualCost);

        double price = Double.valueOf(actualCost);
        System.out.println(price);
        System.out.println(cost1>price); //true
    }
}
