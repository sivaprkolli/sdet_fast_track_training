package org.sft.factoryDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager implements SeleniumDriverManager{
    private static ThreadLocal<WebDriver> cDriver = new ThreadLocal<>();
    @Override
    public WebDriver createDriver() {
        cDriver.set(new ChromeDriver());
        return  cDriver.get();
    }
}
