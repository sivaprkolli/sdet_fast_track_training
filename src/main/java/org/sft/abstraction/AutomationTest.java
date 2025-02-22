package org.sft.abstraction;

public class AutomationTest{

    public static void main(String[] args) {
        AbstractData abstractData = new ImplementData();
       // ImplementData implementData = new ImplementData();
        abstractData.register();
        abstractData.login();



        InterfaceData interfaceData = new ImplementData2();
        interfaceData.payment();
        interfaceData.booking();

        //WebDriver driver = new ChromeDriver();
        ChromeTest chromeTest = new ChromeTest();
        chromeTest.type();
        chromeTest.click();

        Selenium selenium = new ChromeTest();
        selenium.click();
        selenium.type();


    }
}
