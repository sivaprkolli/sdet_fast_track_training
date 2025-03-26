package org.sft.SimpleFrameworkDevelopementUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseSFT {

   public WebDriver driver;

    @BeforeTest
    public void launchApplication(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
