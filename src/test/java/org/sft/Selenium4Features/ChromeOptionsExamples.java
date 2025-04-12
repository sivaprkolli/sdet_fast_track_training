package org.sft.Selenium4Features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class ChromeOptionsExamples {

    WebDriver driver;

    @Test
    public void acceptCert(){
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--incognito");
        //chromeOptions.addArguments("--headless");

        Map<String, String> mobileCaps = new HashMap<>();
        mobileCaps.put("deviceName","iPhone SE");
        chromeOptions.setExperimentalOption("mobileEmulation", mobileCaps);
        chromeOptions.setAcceptInsecureCerts(true);
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.cacert.org/");

    }
}
