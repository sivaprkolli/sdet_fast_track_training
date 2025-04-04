package org.sft.designPatterns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager implements BrowserManager{


    @Override
    public WebDriver getDriver() {
        return new ChromeDriver();
    }
}
