package org.sft.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class ParallelGridTest {

    public WebDriver driver;

    public void setBrowser(String browser) throws MalformedURLException {
        switch (browser) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                //chromeOptions.setBrowserVersion("131");
                //driver = new ChromeDriver(chromeOptions);
                driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444/wd/hub"), chromeOptions);
                break;
            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
               // firefoxOptions.setBrowserVersion("");
                driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444/wd/hub"), firefoxOptions);
                break;
            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                //edgeOptions.setBrowserVersion("");
                driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444/wd/hub"), edgeOptions);
                break;
            case "safari":
                SafariOptions safariOptions = new SafariOptions();
                //edgeOptions.setBrowserVersion("");
                driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444/wd/hub"), safariOptions);
                break;
        }
    }

    private By userNameInputBox = By.id("user-name");
    private By passwordInputBox = By.id("password");
    private By loginButton = By.cssSelector("[name='login-button']");

    public void login(String userName, String password) {
        driver.findElement(userNameInputBox).sendKeys(userName);
        driver.findElement(passwordInputBox).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    @Parameters({"browser"})
    @BeforeTest
    public void launchApp(@Optional("chrome") String browser) throws MalformedURLException {
        setBrowser(browser);
        driver.get("https://www.saucedemo.com/");
    }

    @AfterTest
    public void killSession() {
        driver.quit();
    }

    @Test
    public void verifyProductsPage() {
        login("standard_user","secret_sauce");
        Assert.assertEquals(driver.findElements(By.cssSelector(".inventory_item")).size(), 6);
    }
}


