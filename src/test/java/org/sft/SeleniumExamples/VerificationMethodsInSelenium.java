package org.sft.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class VerificationMethodsInSelenium extends BaseSFT {



    @Test
    public void isDisplayedWebElement() {

    }

    /**
     * Radio buttons
     * CheckBoxes
     */
    @Test
    public void isSelectedWebElement() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("#checkboxes>input"));

        WebElement checkBox1 = checkBoxes.get(0);
        WebElement checkBox2 = checkBoxes.get(1);

        System.out.println(checkBox1.isSelected());
        System.out.println(checkBox2.isSelected());

//        checkBox1.click();
//        checkBox2.click();

//        System.out.println(checkBox1.isSelected());
//        System.out.println(checkBox2.isSelected());
//
        if (!checkBox1.isSelected()){
            checkBox1.click();
        }
    }

    @Test
    public void isEnabledWebElement(){
        driver.get("https://www.prettylittlething.com/dark-grey-marl-knit-distressed-detail-chunky-cable-jumper.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement acceptAllButton = driver.findElement(By.xpath("//button[.='Accept All']"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='Accept All']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[.='Accept All']")));
        wait.until(ExpectedConditions.elementToBeClickable(acceptAllButton));
        acceptAllButton.click();

        WebElement sizeButton = driver.findElement(By.xpath("//span[text()='Select a Size']"));
        System.out.println(sizeButton.isEnabled());

        List<WebElement> sizes = driver.findElements(By.xpath("//div[text()='Select your Size']/../following-sibling::div//span[contains(@class,'cursor-pointer')]"));;
        wait.until(ExpectedConditions.visibilityOfAllElements(sizes));
        CommonActions ca = new CommonActions();
        boolean flag = ca.isElementEnabled(sizes.get(0));
        Assert.assertFalse(flag);
    }


}
