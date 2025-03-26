package org.sft.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.plaf.SpinnerUI;
import java.time.Duration;

public class JavaScriptExecutorTests extends BaseSFT{

    public JavascriptExecutor jse;
    @BeforeTest
    public void initialize(){
        jse =  (JavascriptExecutor) driver;
    }

    @Test
    public void useJSClick(){
        driver.get("https://www.prettylittlething.com/dark-grey-marl-knit-distressed-detail-chunky-cable-jumper.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement acceptAllButton = driver.findElement(By.xpath("//button[.='Accept All']"));
        acceptAllButton.click();
         jse = (JavascriptExecutor)driver;
        WebElement sizeButton = driver.findElement(By.xpath("//span[text()='S']"));
       // jse.executeScript("arguments[0].click()", sizeButton);
        sizeButton.click();
        System.out.println("Test");
    }

    @Test
    public void clickUsingJS(){
        driver.get("https://ecommerce-playground.lambdatest.io/");

        WebElement myAccount = driver.findElement(By.xpath("(//div/span[normalize-space()='My account'])[2]"));
        //myAccount.click();
        String clickJse = "arguments[0].click()";
        jse.executeScript(clickJse, myAccount);


        WebElement searchBox = driver.findElement(By.cssSelector("[name=\"search\"][data-autocomplete]"));

        String typejse = "arguments[0].value='Selenium'";
        jse.executeScript(typejse, searchBox);
       // searchBox.sendKeys("Selenium");

        System.out.println("");
    }

    @Test
    public void changeAttributeUsingJS(){
        driver.get("https://the-internet.herokuapp.com/windows");

        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));

        String attributeJse = "arguments[0].setAttribute('target','_self')";

        jse.executeScript(attributeJse, clickHereLink);

        clickHereLink.click();
        System.out.println("");
    }

    @Test
    public void scrollToElementUsingJS(){
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='© LambdaTest - Powered by OpenCart']")));

        WebElement bottomText = driver.findElement(By.xpath("//p[text()='© LambdaTest - Powered by OpenCart']"));

        String scrollJse = "arguments[0].scrollIntoView(true)";

        jse.executeScript(scrollJse, bottomText);

        jse.executeScript("window.scrollBy(0,250)", "");

        System.out.println();


    }


}
