package org.sft.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class JavaScriptExecutorTests extends BaseSFT{


    @Test
    public void useJSClick(){
        driver.get("https://www.prettylittlething.com/dark-grey-marl-knit-distressed-detail-chunky-cable-jumper.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement acceptAllButton = driver.findElement(By.xpath("//button[.='Accept All']"));
        //acceptAllButton.click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        WebElement sizeButton = driver.findElement(By.xpath("//span[text()='S']"));
       // jse.executeScript("arguments[0].click()", sizeButton);
        sizeButton.click();
        System.out.println("Test");
    }
}
