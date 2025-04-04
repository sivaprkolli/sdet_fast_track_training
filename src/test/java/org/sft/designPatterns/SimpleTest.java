package org.sft.designPatterns;

public class SimpleTest {

    public static void main(String[] args) {



      /*  System.out.println(SingletonTest.getInstance());
        SingletonTest.getInstance().openApplication();

        System.out.println(SingletonTest.getInstance());
        SingletonTest.getInstance().openApplication();

        CreateWebDriver.getInstance().setDriver();
        CreateWebDriver.getInstance().getDriver();

        CreateWebDriver.getInstance().getDriver();*/


        DriverManager.getBrowserManager("firefox").getDriver();

    }
}
