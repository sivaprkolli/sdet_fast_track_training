package org.sft.programs;

public class GetNumberOfOccurances {

    public static void main(String[] args) {
        String str= "AAABBCDDDEEEEFFFFFF"; //A3B2C1D3E4F5

        StringBuilder sb = new StringBuilder();
        String str1 = new String();

        System.out.println(sb.length());
        System.out.println(str1.length());

        str1 = str1.concat("Selenium");
        System.out.println(str1);
        sb.append("Automation");
        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer();
        int counter=0;
        for (int i=1; i<str.length(); i++){

            if(str.charAt(i-1) == str.charAt(i)){
                counter++;
            }else {
                if(counter>1){
                    sb1.append(str.charAt(i-1)).append(counter);
                }
                counter=1;

            }
        }
        System.out.println(sb1);
    }
}
