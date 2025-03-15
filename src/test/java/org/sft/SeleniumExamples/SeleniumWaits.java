package org.sft.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumWaits {
    WebDriver driver;

    @AfterTest
    public void killSession(){
        driver.quit();
    }

    @Test
    public void aboutImplicitWait(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");

        WebElement firstNameInputBox = driver.findElement(By.name("UserFirstName"));
        WebElement lastNameInputBox = driver.findElement(By.name("UserLastNam"));
    }

    @Test
    public void aboutWebDriverWait(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        //WebElement firstNameInputBox = driver.findElement(By.name("UserFirstName"));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("UserFirstNam")));
    }

    @Test
    public void aboutFluentWait(){
        driver = new ChromeDriver();
        FluentWait fluentWait = new FluentWait(driver);
        fluentWait.ignoring(NoSuchElementException.class);
        fluentWait.withMessage("Provide right element");
        fluentWait.withTimeout(Duration.ofSeconds(20));
        fluentWait.pollingEvery(Duration.ofSeconds(4));

        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("UserFirstNam")));
    }
}
