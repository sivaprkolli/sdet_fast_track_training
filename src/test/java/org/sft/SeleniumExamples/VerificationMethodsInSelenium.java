package org.sft.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

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

        WebElement sizeButton = driver.findElement(By.xpath("//span[text()='Select a Size']"));
        System.out.println(sizeButton.isEnabled());
    }
}
