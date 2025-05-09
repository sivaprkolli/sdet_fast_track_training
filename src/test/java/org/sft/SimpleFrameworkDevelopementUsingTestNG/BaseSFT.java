package org.sft.SimpleFrameworkDevelopementUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseSFT {


    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    public WebDriver getDriver(){
        return driverThreadLocal.get();
    }


    @AfterTest
    public void tearDown(){
        getDriver().quit();
    }

    @Parameters("browser")
    @BeforeTest
    public void launchApplication(String browser) throws MalformedURLException {
        driverThreadLocal.set(setBrowser(browser));
        getDriver().get("https://www.saucedemo.com/");
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public WebDriver setBrowser(String browser) throws MalformedURLException {
       WebDriver driver = null;
        switch (browser) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
                break;
            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxOptions);
                break;
            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), edgeOptions);
                break;
            case "safari":
                SafariOptions safariOptions = new SafariOptions();
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), safariOptions);
                break;
        }
        return driver;
    }

}
