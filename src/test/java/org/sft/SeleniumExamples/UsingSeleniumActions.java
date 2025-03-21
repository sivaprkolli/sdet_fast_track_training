package org.sft.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UsingSeleniumActions extends BaseSFT{

    //setTimeout(function(){debugger},5000)
    @Test
    public void moveToElementAndClick() throws InterruptedException {
        driver.get("https://ecommerce-playground.lambdatest.io/");
        WebElement megaMenu = driver.findElement(By.xpath("//span[normalize-space()='Mega Menu']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(megaMenu).moveToElement(driver.findElement(By.cssSelector("[title=\"Apple\"]"))).click().perform();
        Thread.sleep(5000);
        System.out.println("Test");
    }

}
