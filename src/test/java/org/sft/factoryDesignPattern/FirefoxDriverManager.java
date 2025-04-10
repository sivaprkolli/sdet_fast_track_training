package org.sft.factoryDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager implements SeleniumDriverManager{

    private static ThreadLocal<WebDriver> fDriver = new ThreadLocal<>();
    @Override
    public WebDriver createDriver() {
        fDriver.set(new FirefoxDriver());
        return fDriver.get();
    }
}
