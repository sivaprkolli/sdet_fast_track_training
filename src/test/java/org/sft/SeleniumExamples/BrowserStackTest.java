package org.sft.SeleniumExamples;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackTest {
    WebDriver driver;
    @Test
    public void executeTestOnBrowserStack() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("os", Platform.WIN11);
        desiredCapabilities.setCapability("os_version","11");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBrowserVersion("128");
//        chromeOptions.setPlatformName("MacOS Sequoia");
        //chromeOptions.setBrowserVersion("18");
        chromeOptions.merge(desiredCapabilities);


        driver = new RemoteWebDriver(new URL("https://Username:AccessKey@hub.browserstack.com/wd/hub"), chromeOptions);

        Thread.sleep(15000);

        driver.quit();
    }
}
