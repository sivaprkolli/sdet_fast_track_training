package org.sft.singleDesignPatterns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
    WebDriver driver;

    @BeforeTest
    public void initialize(){
        SeleniumDriver.getInstance().setDriver();
        driver = SeleniumDriver.getInstance().getDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterTest
    public void killSession(){
        driver.quit();
    }

    @Test
    public void loginAsAdmin(){
        driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("submit-button")).click();
    }

}
