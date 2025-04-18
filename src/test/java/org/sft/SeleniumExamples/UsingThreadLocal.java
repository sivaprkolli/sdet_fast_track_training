package org.sft.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class UsingThreadLocal {

    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    public void setDriver(){
        driverThreadLocal.set(new ChromeDriver());
    }

    public WebDriver getDriver(){
        return driverThreadLocal.get();
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


    @Parameters("browser")
    @BeforeTest
    public void setUp(String browser) throws MalformedURLException {
        WebDriver driver = setBrowser(browser);
        driverThreadLocal.set(driver);
        getDriver().navigate().to("https://www.saucedemo.com/");
    }

    @Test
    public void loginTest(){
        WebElement usernameInputBox = getDriver().findElement(By.name("user-name"));
        usernameInputBox.clear();
        usernameInputBox.sendKeys("standard_user");

        WebElement passwordInputBox = getDriver().findElement(By.id("password"));
        passwordInputBox.clear();
        passwordInputBox.sendKeys("secret_sauce");

        WebElement loginButton = getDriver().findElement(By.id("login-button"));
        loginButton.click();
    }

    @AfterTest
    public void tearDown(){
        getDriver().quit();
    }


}
