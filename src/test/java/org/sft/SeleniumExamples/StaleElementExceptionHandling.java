package org.sft.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class StaleElementExceptionHandling extends BaseSFT{

    @Test
    public void handleElementException(){
        driver.get("https://para.testar.org/parabank/about.htm;jsessionid=FB240F858FA900BA96DEE5A980656F85");
        WebElement userNameInputBox = driver.findElement(By.name("username"));
        userNameInputBox.sendKeys("Siva");
        driver.navigate().refresh();
        try{
            userNameInputBox.click();
        }catch (StaleElementReferenceException ste) {
            driver.findElement(By.name("username")).sendKeys("Prasad");
        }
    }
}
