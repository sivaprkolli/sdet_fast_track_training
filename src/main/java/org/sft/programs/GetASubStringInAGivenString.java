package org.sft.programs;

public class GetASubStringInAGivenString {



    public static void main(String[] args) {
        String price = "Welcome, to SDET training program and $18k is the payment";

        System.out.println(price.substring(11));
        System.out.println(price.substring(11,15));

        int index1 = price.indexOf("and ");
        System.out.println(price.substring(index1));

        String subText = price.substring(index1);

        int index2 = subText.indexOf("is");
        System.out.println(subText.substring(0,index2));
    }

}
