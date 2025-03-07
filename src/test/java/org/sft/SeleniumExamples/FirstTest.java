package org.sft.SeleniumExamples;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void loginTest(){
        //ChromeDriver chromeDriver = new ChromeDriver();
        //ChromiumDriver chromiumDriver = new ChromeDriver();
        //RemoteWebDriver remoteWebDriver = new ChromeDriver();
        // WebDriver driver = new ChromeDriver();
        SearchContext searchContext = new ChromeDriver();
    }

}
