package org.sft.designPatterns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager implements BrowserManager{
    @Override
    public WebDriver getDriver() {
        return new FirefoxDriver();
    }
}
