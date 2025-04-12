package org.sft.Selenium4Features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class ChromeOptionsTest {
    WebDriver driver;

    @Test
    public void chromeOptionsUsage(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","Windows");
        desiredCapabilities.setCapability("platformVersion", "11.0");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBrowserVersion("133");
        chromeOptions.merge(desiredCapabilities);


        driver = new ChromeDriver(chromeOptions);


    }
}
