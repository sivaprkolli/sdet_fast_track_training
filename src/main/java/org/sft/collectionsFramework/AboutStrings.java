package org.sft.collectionsFramework;

public class AboutStrings {

    public static void main(String[] args) {
        String s = "Selenium"; // address1
        s.concat(" Test");
        s = s.concat(" Automation"); // address2
        System.out.println(s);

        StringBuffer sb = new StringBuffer("Selenium");
        sb.append(" Test");
        System.out.println(sb);

        String s1 = new String("Appium");
        String s2 = "Appium";
        String s3 = "Appium";

        System.out.println("******************************************");
        /**
         * equals method looks for values
         * == look reference/memory/address
         */
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));

        String s4 = "Test " + "Automation";
        System.out.println(s4);
        System.out.println(s4.length());

        String[] str = {"Selenium", "Appium", "Playwright", "RestAssured"};
        int[] arr = {1,2,3,4,5};
        char[] crr = {'a','b','c','d'};
        boolean[] bcc = {true, false, true, false};
        double[] drr = {100.00, 200.00, 350.00};
        String st1 = "Test@1234$";

        System.out.println(str[2]);

        for (String str2: str){
            System.out.println(str2);
        }

        // i++ , ++i
        int i=0;
        System.out.println(i++);
        System.out.println(i);

        for (int j=0; j<3; j++){
            System.out.println(j);
        }

        System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
        int k = 0;
        System.out.println(++k);
        System.out.println(k);

        if (false){
            System.out.println("Selenium Test Automation");
        }

        if (true){
            System.out.println("Playwright Test Automation");
        }

        int age = 18;

        if(age>19){
            System.out.println("Apply driving licence");
        } else if(age<18){
            System.out.println("wait for 1 year");
        } else if(age == 18){
            System.out.println("Eligible");
        } else{
            System.out.println("provide right age");
        }

        System.out.println("lllllllllllllllllllllll");
        int l = 0;
        while (l<10){
            System.out.println("Appium Test Automation :: " + l);
            l++;
            if(l == 5){
                break;
            }
        }

        System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmm");
        for(int m=0; m<5; m++){
            if(m ==3){
                break;
            }
            System.out.println(m);
        }
    }

}
