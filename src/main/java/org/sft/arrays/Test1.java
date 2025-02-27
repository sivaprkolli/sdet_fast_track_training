package org.sft.arrays;

public class Test1 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = new int[8];

        int[][] d = {{1,2,3,4,5}, {6,7,8,9,10}};

        System.out.println("b length :: " + b.length);

        System.out.println(a[4]);

        String[] s= {"Selenium", "Appium", "WebDriverIO"};
        System.out.println(s[1]);

        System.out.println(s.length);

        String s1 = "Playwright";
        System.out.println(s1.length());

        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

        for(int c:a){
            System.out.println(c);
        }
    }
}
