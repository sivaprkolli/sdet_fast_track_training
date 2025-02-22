package org.sft.abstraction;

public class ChromeTest extends RemoteDriver{

    public void devTools(){

    }

    public static void main(String[] args) {
        ChromeTest chromeTest = new ChromeTest();
        RemoteDriver remoteDriver = new ChromeTest();
        Selenium selenium = new ChromeTest();
        selenium.click();
        selenium.type();

        remoteDriver.click();
        remoteDriver.type();

        chromeTest.click();
        chromeTest.type();


    }
}
