package org.sft.singleDesignPatterns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDriver {

    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();
    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
    private static SeleniumDriver seleniumDriver;
    private SeleniumDriver(){}

    //private WebDriver driver;

    public void setDriver() {
        driverThreadLocal.set(new ChromeDriver());
    }

    public WebDriver getDriver(){
        return driverThreadLocal.get();
    }

    public static SeleniumDriver getInstance(){
        if (seleniumDriver == null){
            seleniumDriver = new SeleniumDriver();
        }
        return seleniumDriver;
    }

}
