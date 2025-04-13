package org.sft.SeleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerContainerTest {
    WebDriver driver;
    @Test
    public void executeTestOnDockerContainer() throws MalformedURLException, InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
       // FirefoxOptions firefoxOptions = new FirefoxOptions();
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);

        Thread.sleep(15000);

        driver.quit();
    }
}
